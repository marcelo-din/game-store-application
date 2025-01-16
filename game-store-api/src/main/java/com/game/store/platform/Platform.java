package com.game.store.platform;

import com.game.store.commom.BaseEntity;
import com.game.store.game.Game;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
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
public class Platform extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private Console console;

    @ManyToMany(mappedBy = "platforms")
    private List<Game> games;
}
