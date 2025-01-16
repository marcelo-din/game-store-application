package com.game.store;

import com.game.store.category.Category;
import com.game.store.category.CategoryRepository;
import com.game.store.game.GameRequest;
import com.game.store.game.GameService;
import com.game.store.platform.Console;
import com.game.store.platform.Platform;
import com.game.store.platform.PlatformRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Profile("test")
public class DatabaseInitializer implements CommandLineRunner {

    private final PlatformRepository platformRepository;

    private final CategoryRepository categoryRepository;

    private final GameService gameService;

    @Override
    public void run(String... args) {
        addPlatform();
        addCategory();
        addGame();
    }

    private void addPlatform() {
        for (Console console : Console.values()) {
            Platform plat = Platform.builder()
                    .console(console)
                    .build();
            platformRepository.save(plat);
        }
    }

    private void addCategory() {
        Category category = Category.builder()
                .name("Action")
                .description("Action games")
                .build();
        categoryRepository.save(category);
    }

    private void addGame() {
        Category category = categoryRepository.findAll().get(0);
        GameRequest gameRequest = new GameRequest("Doom", category.getId(), List.of("PC", "XBOX"));
        gameService.saveGame(gameRequest);
    }

}
