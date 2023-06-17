package com.allthing.wheeledrescue.configuration;

import com.allthing.wheeledrescue.application.mappers.EmployeeResponseMapper;
import com.allthing.wheeledrescue.infrastructure.mappers.entity.EmployeeMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("EntityMapperConfig")
public class EntityMapperConfig {
    
    @Bean
    public EmployeeMapper employeeMapper(){
        return new EmployeeMapper();
    }
    
    @Bean
    public EmployeeResponseMapper employeeResponseMapper() {
        return new EmployeeResponseMapper();
    }
}
