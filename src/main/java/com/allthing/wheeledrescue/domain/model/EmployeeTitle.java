package com.allthing.wheeledrescue.domain.model;

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
public class EmployeeTitle {
    private UUID id;
    private Employee employee;
    private Title title;
    private LocalDate fromDate;
    private LocalDate toDate;
}
