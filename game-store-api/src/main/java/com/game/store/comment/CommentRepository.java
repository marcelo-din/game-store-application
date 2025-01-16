package com.game.store.comment;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CustomJpaRepository<Comment, String> {
}
