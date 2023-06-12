package com.allthing.wheeledrescue.domain.repository;

import com.allthing.wheeledrescue.domain.model.Department;
import com.allthing.wheeledrescue.util.exception.DatabaseEntityNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentRepository {
    Optional<Department> findById();
    
    List<Department> findAll();
    
    Department create(Department entity) throws DatabaseEntityNotFoundException;
}
