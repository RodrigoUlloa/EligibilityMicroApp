package com.example.aligibility_mico.common;

import lombok.*;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class GameCreatedEvent {
    private Integer id;
    private String name;
    private Integer userId;
}
