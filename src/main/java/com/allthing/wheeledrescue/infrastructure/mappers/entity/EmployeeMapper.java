package com.allthing.wheeledrescue.infrastructure.mappers.entity;

import com.allthing.wheeledrescue.domain.model.Employee;
import com.allthing.wheeledrescue.domain.model.util.Gender;
import com.allthing.wheeledrescue.infrastructure.entity.EmployeeEntity;

import java.util.Optional;

public class EmployeeMapper {
    
    public EmployeeEntity map(Employee employee) {
        return EmployeeEntity.builder()
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
    
    public Employee map(EmployeeEntity employeeEntity){
        return Employee.builder()
                .id(employeeEntity.getId())
                .number(employeeEntity.getNumber())
                .birthDate(employeeEntity.getBirthDate())
                .firstName(employeeEntity.getFirstName())
                .lastName(employeeEntity.getLastName())
                .gender(Gender.valueOf(employeeEntity.getGender()))
                .hireDate(employeeEntity.getHireDate())
                .leaveDate(employeeEntity.getLeaveDate())
                .build();
    }
}
