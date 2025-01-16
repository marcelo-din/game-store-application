package com.game.store.notifaction;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends CustomJpaRepository<Notifacation, String> {
}
