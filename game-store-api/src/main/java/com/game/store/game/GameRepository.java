package com.game.store.game;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends CustomJpaRepository<Game, String> {
}
