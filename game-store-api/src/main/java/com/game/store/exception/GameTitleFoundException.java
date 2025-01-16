package com.game.store.exception;

public class GameTitleFoundException extends EntityFoundException {

    private static final String MSG_GAME_TITLE_FOUND = "There is already a game with this title [%s]";

    public GameTitleFoundException(String title) {
        super(String.format(MSG_GAME_TITLE_FOUND, title));
    }

}
