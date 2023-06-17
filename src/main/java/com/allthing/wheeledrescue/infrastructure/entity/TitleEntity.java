package com.allthing.wheeledrescue.infrastructure.entity;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TitleEntity {
    private UUID id;
    private EmployeeEntity employeeEntity;
    private String title;
    private LocalDate fromDate;
    private LocalDate toDate;
}
