package com.game.store.game;

import com.game.store.category.Category;
import com.game.store.comment.Comment;
import com.game.store.commom.BaseEntity;
import com.game.store.wishlist.WishList;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.CascadeType.MERGE;
import static jakarta.persistence.CascadeType.PERSIST;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Game extends BaseEntity {

    private String title;

    @Enumerated(EnumType.STRING)
    private SupportedPlatforms supportedPlatforms;

    private String coverPicture;

    @ManyToOne
    @JoinColumn(name = "category_id", foreignKey = @ForeignKey(name = "fk_game_category"))
    private Category category;

    @OneToMany(mappedBy = "game")
    private List<Comment> comments;

    @ManyToMany(cascade = {PERSIST, MERGE})
    @JoinTable(name = "game_wishlist", joinColumns = @JoinColumn(name = "game_id"),
            foreignKey = @ForeignKey(name = "fk_game_wishlist"),
            inverseJoinColumns = @JoinColumn(name = "wish_list_id"),
            inverseForeignKey = @ForeignKey(name = "fk_wishlist_game"))
    private List<WishList> wishLists;

    public void addWishList(WishList wishList) {
        this.wishLists.add(wishList);
        wishList.getGames().add(this);
    }

    public void removeWishList(WishList wishList) {
        this.wishLists.remove(wishList);
        wishList.getGames().remove(this);
    }
}
