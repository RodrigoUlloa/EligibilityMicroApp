package com.example.aligibility_mico.services;


import com.example.aligibility_mico.common.GameCreatedEvent;
import com.example.aligibility_mico.common.GameEligibleEvent;
import reactor.core.publisher.Mono;

public interface GameEligibleService {
    Mono<GameEligibleEvent> eligibilityGame(GameCreatedEvent gameCreatedEvent);
}
