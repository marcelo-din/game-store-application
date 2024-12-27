package com.game.store.wishlist;

import com.game.store.commom.BaseEntity;
import com.game.store.game.Game;
import com.game.store.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.FetchType.EAGER;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WishList extends BaseEntity {

    private String name;

    @OneToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_wishlist_user"))
    private User user;

    @ManyToMany(mappedBy = "wishLists", fetch = EAGER)
    private List<Game> games;

}
