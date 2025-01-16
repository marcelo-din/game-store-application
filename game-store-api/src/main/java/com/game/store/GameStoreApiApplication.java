package com.game.store;

import com.game.store.commom.CustomJpaRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = CustomJpaRepositoryImpl.class)
public class GameStoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameStoreApiApplication.class, args);
    }

}
