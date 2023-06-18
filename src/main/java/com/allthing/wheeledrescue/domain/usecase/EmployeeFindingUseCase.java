package com.allthing.wheeledrescue.domain.usecase;

import com.allthing.wheeledrescue.domain.model.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeFindingUseCase {
    Optional<Employee> findById(UUID id);
    
    Optional<Employee> findByEmployeeNumber(Long number);
    
    Optional<Employee> findDepartmentManagerNumber(Long number);
    
    Optional<Employee> findManagerByEmployeeNumber(Long number);
    
    List<Employee> findAll();
    
    List<Employee> findManagers();
    
    List<Employee> findByManagerNumber(Long number);
    
    List<Employee> findByDepartmentNumber(Long number);
    
    List<Employee> findActiveEmployees();
}
