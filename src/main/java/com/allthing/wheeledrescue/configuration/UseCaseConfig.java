package com.allthing.wheeledrescue.configuration;

import com.allthing.wheeledrescue.application.usecase.DefaultEmployeeFindingUseCase;
import com.allthing.wheeledrescue.domain.repository.EmployeeRepository;
import com.allthing.wheeledrescue.domain.usecase.EmployeeFindingUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("UseCaseConfig")
public class UseCaseConfig
{
    @Bean(name = "employeeFindingUseCase")
    public EmployeeFindingUseCase employeeFindingUseCase(EmployeeRepository employeeRepository){
        return new DefaultEmployeeFindingUseCase(employeeRepository);
    }
}
