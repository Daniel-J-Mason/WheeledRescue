package com.allthing.wheeledrescue.domain.repository;

import com.allthing.wheeledrescue.domain.model.Salary;
import com.allthing.wheeledrescue.util.exception.DatabaseEntityNotFoundException;

import java.util.List;
import java.util.Optional;

public interface SalaryRepository {
    Optional<Salary> findById();
    
    List<Salary> findAll();
    
    Salary create(Salary entity) throws DatabaseEntityNotFoundException;
    
    Salary update(Salary entity) throws DatabaseEntityNotFoundException;
}
