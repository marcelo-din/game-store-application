package com.game.store.platform;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlatformService {

    private final PlatformRepository platformRepository;

    public List<Platform> findAllByConsoleIn(List<Console> consoles) {
        return platformRepository.findAllByConsoleIn(consoles);
    }
}
