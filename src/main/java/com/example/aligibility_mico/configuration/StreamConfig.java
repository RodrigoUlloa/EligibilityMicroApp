package com.example.aligibility_mico.configuration;

import com.example.aligibility_mico.common.GameCreatedEvent;
import com.example.aligibility_mico.common.GameEligibleEvent;
import com.example.aligibility_mico.processors.EligibilityGameProcessor;
import com.example.gameserviceapi.commons.entities.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

import java.util.function.Function;
@Configuration
public class StreamConfig {
    @Bean
    public Function<Flux<GameCreatedEvent>, Flux<GameEligibleEvent>> gameCreatedBinding(final EligibilityGameProcessor processor){
        return processor::process;
    }
}
