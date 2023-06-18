package com.allthing.wheeledrescue.application.usecase;

import com.allthing.wheeledrescue.domain.model.Employee;
import com.allthing.wheeledrescue.domain.repository.EmployeeRepository;
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
    public Optional<Employee> findByEmployeeNumber(Long number) {
        return employeeRepository.findByEmployeeNumber(number);
    }
    
    @Override
    public Optional<Employee> findDepartmentManagerNumber(Long number) {
        return Optional.empty();
    }
    
    @Override
    public Optional<Employee> findManagerByEmployeeNumber(Long number) {
        return Optional.empty();
    }
    
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
    
    @Override
    public List<Employee> findManagers() {
        return null;
    }
    
    @Override
    public List<Employee> findByManagerNumber(Long number) {
        return null;
    }
    
    @Override
    public List<Employee> findByDepartmentNumber(Long number) {
        return null;
    }
    
    @Override
    public List<Employee> findActiveEmployees() {
        return employeeRepository.findActiveEmployees();
    }
}
