package com.game.store.game;

import com.game.store.category.CategoryService;
import com.game.store.exception.GameTitleFoundException;
import com.game.store.platform.Console;
import com.game.store.platform.Platform;
import com.game.store.platform.PlatformService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;
    private final CategoryService categoryService;
    private final PlatformService platformService;

    @Transactional
    public UUID saveGame(GameRequest gameRequest) {
        List<Console> consoles = GameMapper.getPlatforms(gameRequest);
        checkExistsGameByTitle(gameRequest.title());
        categoryService.findOrFail(gameRequest.categoryId());

        Game game = GameMapper.toGame(gameRequest);

        List<Platform> platforms = platformService.findAllByConsoleIn(consoles);
        platforms.forEach(game::addPlatform);

        Game savedGame = gameRepository.save(game);
        return savedGame.getId();
    }

    private void checkExistsGameByTitle(String title) {
        gameRepository.findByTitle(title)
                .ifPresent(game -> {
                    throw new GameTitleFoundException(title);
                });
    }
}