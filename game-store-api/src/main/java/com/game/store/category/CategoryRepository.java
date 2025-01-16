package com.game.store.category;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CategoryRepository extends CustomJpaRepository<Category, UUID> {
}
