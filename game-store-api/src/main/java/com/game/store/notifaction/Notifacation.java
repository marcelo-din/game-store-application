package com.game.store.notifaction;

import com.game.store.commom.BaseEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Notifacation extends BaseEntity {

    private String message;
    private String receiver;
    private NotifactionLevel level;
    private NotifactionStatus status;
}
