package com.game.store.platform;

import com.game.store.commom.CustomJpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlatformRepository extends CustomJpaRepository<Platform, String> {

    @Query("SELECT p " +
            " FROM Platform p " +
            "WHERE p.console in :consoles")
    List<Platform> findAllByConsoleIn(@Param("consoles") List<Console> consoles);
}
