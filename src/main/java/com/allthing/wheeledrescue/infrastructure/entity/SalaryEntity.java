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
public class SalaryEntity {
    private UUID id;
    private EmployeeEntity employeeEntity;
    private Long hourlySalary;
    private LocalDate fromDate;
    private LocalDate toDate;
}
