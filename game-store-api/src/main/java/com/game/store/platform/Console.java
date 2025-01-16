package com.game.store.platform;

import java.util.Arrays;

public enum Console {

    PC,
    XBOX,
    PLAYSTATION,
    NINTENDO;

    public static Console findByName(String name) {
        return Arrays.stream(values()).filter(console -> console.name().equals(name))
                .findFirst().orElseThrow(() -> new IllegalArgumentException(String.format("Console not found with name [%s]", name)));
    }

}
