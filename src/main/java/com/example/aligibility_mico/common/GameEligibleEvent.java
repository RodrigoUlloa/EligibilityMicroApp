package com.example.aligibility_mico.common;

import lombok.*;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GameEligibleEvent {
    private Integer id;
    private String name;
    private Integer userId;
    private boolean isEligible;
}
