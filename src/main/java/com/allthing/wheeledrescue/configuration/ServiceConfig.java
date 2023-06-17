package com.allthing.wheeledrescue.configuration;

import com.allthing.wheeledrescue.application.mappers.EmployeeResponseMapper;
import com.allthing.wheeledrescue.application.service.DefaultEmployeeService;
import com.allthing.wheeledrescue.domain.service.EmployeeService;
import com.allthing.wheeledrescue.domain.usecase.EmployeeFindingUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("ServiceConfig")
public class ServiceConfig {
    
    @Bean
    public EmployeeService employeeService(EmployeeFindingUseCase employeeFindingUseCase, EmployeeResponseMapper employeeResponseMapper){
        return new DefaultEmployeeService(employeeFindingUseCase, employeeResponseMapper);
    }
    
}
