package com.game.store.exception;

public abstract class EntityNotFoundException extends BusinessException {
    
    public EntityNotFoundException(String message) {
        super(message);
    }
}
