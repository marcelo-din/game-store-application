package com.game.store.game;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GameRepository extends CustomJpaRepository<Game, String> {

    Optional<Game> findByTitle(String title);
}
