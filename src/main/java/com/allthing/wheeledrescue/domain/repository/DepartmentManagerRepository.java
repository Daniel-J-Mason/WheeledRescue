package com.allthing.wheeledrescue.domain.repository;

import com.allthing.wheeledrescue.domain.model.DepartmentManager;
import com.allthing.wheeledrescue.util.exception.DatabaseEntityNotFoundException;

import java.util.List;
import java.util.Optional;

public interface DepartmentManagerRepository {
    Optional<DepartmentManager> findById();
    
    List<DepartmentManager> findAll();
    
    DepartmentManager create(DepartmentManager entity) throws DatabaseEntityNotFoundException;
}
