package com.allthing.wheeledrescue.infrastructure.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentEntity {
    private UUID id;
    private Long number;
    private String name;
}
