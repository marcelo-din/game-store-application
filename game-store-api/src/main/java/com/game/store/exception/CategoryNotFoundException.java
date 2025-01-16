package com.game.store.exception;

import java.util.UUID;

public class CategoryNotFoundException extends EntityNotFoundException {

    private static final String MSG_CATEGORY_NOT_FOUND = "Unable to find category with id [%s]";

    public CategoryNotFoundException(String message) {
        super(message);
    }

    public CategoryNotFoundException(UUID categoryId) {
        super(String.format(MSG_CATEGORY_NOT_FOUND, categoryId));
    }


}
