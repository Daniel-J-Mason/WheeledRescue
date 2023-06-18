package com.allthing.wheeledrescue.infrastructure.repository;

import com.allthing.wheeledrescue.domain.model.Employee;
import com.allthing.wheeledrescue.domain.repository.EmployeeRepository;
import com.allthing.wheeledrescue.infrastructure.mappers.entity.EmployeeMapper;
import com.allthing.wheeledrescue.infrastructure.mappers.mybatis.EmployeeEntityMapper;
import com.allthing.wheeledrescue.util.exception.DatabaseEntityNotFoundException;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class MyBatisEmployeeRepository implements EmployeeRepository {
    
    private final EmployeeMapper employeeMapper;
    private final EmployeeEntityMapper employeeEntityMapper;
    
    @Override
    public Optional<Employee> findById(UUID id) {
        return employeeEntityMapper.findById(id)
                .map(employeeMapper::map);
    }
    
    @Override
    public Optional<Employee> findByEmployeeNumber(Long number) {
        System.out.println("Here");
        return employeeEntityMapper.findByEmployeeNumber(number)
                .map(employeeMapper::map);
    }
    
    @Override
    public List<Employee> findAll() {
        return employeeEntityMapper.findAll()
                .stream().map(employeeMapper::map)
                .toList();
    }
    
    @Override
    public List<Employee> findActiveEmployees() {
        return employeeEntityMapper.findActiveEmployees()
                .stream().map(employeeMapper::map)
                .toList();
    }
    
    @Override
    public Employee create(Employee entity) throws DatabaseEntityNotFoundException {
        return null;
    }
    
    @Override
    public Employee update(Employee entity) throws DatabaseEntityNotFoundException {
        return null;
    }
}
