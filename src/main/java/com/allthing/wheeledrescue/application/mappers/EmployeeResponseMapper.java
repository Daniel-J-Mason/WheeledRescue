package com.allthing.wheeledrescue.application.mappers;

import com.allthing.wheeledrescue.application.dto.EmployeeResponse;
import com.allthing.wheeledrescue.domain.model.Employee;
import com.allthing.wheeledrescue.domain.model.util.Gender;

import java.util.Optional;

public class EmployeeResponseMapper {
    
    public EmployeeResponse map(Employee employee){
        return EmployeeResponse.builder()
                .id(employee.getId())
                .number(employee.getNumber())
                .birthDate(employee.getBirthDate())
                .firstName(employee.getFirstName())
                .lastName(employee.getLastName())
                .gender(Optional.ofNullable(employee.getGender()).map(Gender::name).orElse(Gender.UNLISTED.name()))
                .hireDate(employee.getHireDate())
                .leaveDate(employee.getLeaveDate())
                .build();
    }
}
