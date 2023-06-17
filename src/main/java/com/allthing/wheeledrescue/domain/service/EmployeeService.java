package com.allthing.wheeledrescue.domain.service;

import com.allthing.wheeledrescue.application.dto.EmployeeResponse;

import java.util.Optional;
import java.util.UUID;

public interface EmployeeService {
    
    Optional<EmployeeResponse> findById(UUID id);
}
