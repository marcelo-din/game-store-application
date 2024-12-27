package com.game.store.user;

import com.game.store.commom.BaseEntity;
import com.game.store.wishlist.WishList;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "_user")
public class User extends BaseEntity {

    private String firstname;
    private String lastname;
    private String email;
    private String profilePictureUrl;

    @OneToOne(mappedBy = "user")
    private WishList wishList;
}
