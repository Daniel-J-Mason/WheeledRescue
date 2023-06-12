package com.allthing.wheeledrescue.domain.repository;

import com.allthing.wheeledrescue.domain.model.DepartmentEmployee;
import com.allthing.wheeledrescue.util.exception.DatabaseEntityNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentEmployeeRepository {
    Optional<DepartmentEmployee> findById();
    
    List<DepartmentEmployee> findAll();
    
    DepartmentEmployee create(DepartmentEmployee entity) throws DatabaseEntityNotFoundException;
    
    DepartmentEmployee update(DepartmentEmployee entity) throws DatabaseEntityNotFoundException;
}
