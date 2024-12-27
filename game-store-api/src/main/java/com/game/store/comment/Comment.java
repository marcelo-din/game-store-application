package com.game.store.comment;

import com.game.store.commom.BaseEntity;
import com.game.store.game.Game;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Comment extends BaseEntity {

    private String comment;

    @ManyToOne
    @JoinColumn(name = "game_id", foreignKey = @ForeignKey(name = "fk_comment_game"))
    private Game game;
}
