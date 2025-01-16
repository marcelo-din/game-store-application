package com.game.store.platform;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformtRepository extends CustomJpaRepository<Platform, String> {
}
