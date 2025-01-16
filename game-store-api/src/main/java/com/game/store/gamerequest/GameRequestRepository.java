package com.game.store.gamerequest;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRequestRepository extends CustomJpaRepository<GameRequestEntity, String> {
}
