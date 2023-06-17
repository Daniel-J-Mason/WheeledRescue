package com.allthing.wheeledrescue.application.service;

import com.allthing.wheeledrescue.application.dto.EmployeeResponse;
import com.allthing.wheeledrescue.application.mappers.EmployeeResponseMapper;
import com.allthing.wheeledrescue.domain.service.EmployeeService;
import com.allthing.wheeledrescue.domain.usecase.EmployeeFindingUseCase;
import lombok.RequiredArgsConstructor;

import java.util.Optional;
import java.util.UUID;

@RequiredArgsConstructor
public class DefaultEmployeeService implements EmployeeService {
    
    private final EmployeeFindingUseCase employeeFindingUseCase;
    private final EmployeeResponseMapper employeeResponseMapper;
    
    @Override
    public Optional<EmployeeResponse> findById(UUID id) {
        return employeeFindingUseCase.findById(id)
                .map(employeeResponseMapper::map);
    }
}
