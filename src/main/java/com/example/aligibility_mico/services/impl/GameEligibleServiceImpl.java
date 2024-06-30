package com.example.aligibility_mico.services.impl;

import com.example.aligibility_mico.common.GameCreatedEvent;
import com.example.aligibility_mico.common.GameEligibleEvent;
import com.example.aligibility_mico.services.GameEligibleService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Service
public class GameEligibleServiceImpl implements GameEligibleService {
    @Override

    public Mono<GameEligibleEvent> eligibilityGame(GameCreatedEvent gameCreatedEvent){
        return Mono.just(gameCreatedEvent)
                .flatMap(this::checkIsEligible)
                .map(givenCreated -> GameEligibleEvent.builder()
                        .id(givenCreated.getId())
                        .name(givenCreated.getName())
                        .userId(givenCreated.getUserId())
                        .isEligible(true)
                        .build()
                );
    }

    private Mono<GameCreatedEvent> checkIsEligible(GameCreatedEvent gameCreatedEvent) {
        return Mono.just(gameCreatedEvent)
                .filter(Objects::nonNull)
                .map(given -> gameCreatedEvent);
    }
}
