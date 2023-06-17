package com.allthing.wheeledrescue.application.usecase;

import com.allthing.wheeledrescue.domain.model.Employee;
import com.allthing.wheeledrescue.domain.repository.EmployeeRepository;
import com.allthing.wheeledrescue.domain.service.EmployeeService;
import com.allthing.wheeledrescue.domain.usecase.EmployeeFindingUseCase;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class DefaultEmployeeFindingUseCase implements EmployeeFindingUseCase {
    
    private final EmployeeRepository employeeRepository;
    
    @Override
    public Optional<Employee> findById(UUID id) {
        return employeeRepository.findById(id);
    }
    
    @Override
    public Optional<Employee> findDepartmentManager() {
        return Optional.empty();
    }
    
    @Override
    public Optional<Employee> findManagerByEmployee() {
        return Optional.empty();
    }
    
    @Override
    public List<Employee> findAll() {
        return null;
    }
    
    @Override
    public List<Employee> findManagers() {
        return null;
    }
    
    @Override
    public List<Employee> findByManager() {
        return null;
    }
    
    @Override
    public List<Employee> findByDepartment() {
        return null;
    }
}
