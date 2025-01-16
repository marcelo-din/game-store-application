package com.game.store.game;

import com.game.store.category.Category;
import com.game.store.platform.Console;

import java.util.ArrayList;
import java.util.List;

public abstract class GameMapper {

    private GameMapper() {
    }

    public static Game toGame(GameRequest gameRequest) {
        return Game.builder()
                .title(gameRequest.title())
                .category(Category.builder()
                        .id(gameRequest.categoryId())
                        .build())
                .platforms(new ArrayList<>())
                .build();
    }

    public static List<Console> getPlatforms(GameRequest gameRequest) {
        return gameRequest.platforms().stream()
                .map(Console::findByName)
                .distinct()
                .toList();
    }

}
