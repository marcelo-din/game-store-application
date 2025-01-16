package com.game.store.user;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CustomJpaRepository<User, String> {
}
