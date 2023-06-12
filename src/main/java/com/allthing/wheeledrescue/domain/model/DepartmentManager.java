package com.allthing.wheeledrescue.domain.model;

import com.allthing.wheeledrescue.domain.model.Department;
import com.allthing.wheeledrescue.domain.model.Employee;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DepartmentManager {
    private UUID id;
    private Employee employee;
    private Department department;
    private LocalDate fromDate;
    private LocalDate toDate;
}
