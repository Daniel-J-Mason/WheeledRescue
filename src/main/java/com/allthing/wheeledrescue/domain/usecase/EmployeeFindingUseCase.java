package com.allthing.wheeledrescue.domain.usecase;

import com.allthing.wheeledrescue.domain.model.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeFindingUseCase {
    Optional<Employee> findById(UUID id);
    
    Optional<Employee> findDepartmentManager();
    
    Optional<Employee> findManagerByEmployee();
    
    List<Employee> findAll();
    
    List<Employee> findManagers();
    
    List<Employee> findByManager();
    
    List<Employee> findByDepartment();
}
