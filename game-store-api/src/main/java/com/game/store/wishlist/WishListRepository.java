package com.game.store.wishlist;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends CustomJpaRepository<WishList, String> {
}
