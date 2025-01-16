package com.game.store.category;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CustomJpaRepository<Category, String> {
}
