package com.game.store.category;

import com.game.store.commom.BaseEntity;
import com.game.store.game.Game;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
public class Category extends BaseEntity {

    private String name;
    private String description;

    @OneToMany(mappedBy = "category")
    private List<Game> games;
}
