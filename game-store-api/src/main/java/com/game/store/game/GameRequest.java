package com.game.store.game;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.UUID;

public record GameRequest(
        @NotBlank String title,
        @NonNull UUID categoryId,
        @NotNull List<String> platforms
) {
}
