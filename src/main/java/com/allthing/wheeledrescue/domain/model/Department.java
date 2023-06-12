package com.allthing.wheeledrescue.domain.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Department {
    private UUID id;
    private Long number;
    private String name;
}
