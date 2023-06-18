package com.allthing.wheeledrescue.infrastructure.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
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
