package com.allthing.wheeledrescue.domain.repository;

import com.allthing.wheeledrescue.domain.model.Employee;
import com.allthing.wheeledrescue.util.exception.DatabaseEntityNotFoundException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository {
    Optional<Employee> findById(UUID id);
    
    List<Employee> findAllEmployees();
    
    Employee create(Employee entity) throws DatabaseEntityNotFoundException;
    
    Employee update(Employee entity) throws DatabaseEntityNotFoundException;
}
