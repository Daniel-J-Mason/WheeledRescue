package com.allthing.wheeledrescue.domain.usecase;

import com.allthing.wheeledrescue.domain.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeFindingUseCase {
    Optional<Employee> findById();
    
    Optional<Employee> findDepartmentManager();
    
    Optional<Employee> findManagerByEmployee();
    
    List<Employee> findAll();
    
    List<Employee> findManagers();
    
    List<Employee> findByManager();
    
    List<Employee> findByDepartment();
}
