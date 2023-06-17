package com.allthing.wheeledrescue.configuration;

import com.allthing.wheeledrescue.domain.repository.EmployeeRepository;
import com.allthing.wheeledrescue.infrastructure.mappers.entity.EmployeeMapper;
import com.allthing.wheeledrescue.infrastructure.mappers.mybatis.EmployeeEntityMapper;
import com.allthing.wheeledrescue.infrastructure.repository.MyBatisEmployeeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("RepositoryConfig")
public class RepositoryConfig {
    
    @Bean
    public EmployeeRepository employeeRepository(EmployeeMapper employeeMapper, EmployeeEntityMapper employeeEntityMapper){
        return new MyBatisEmployeeRepository(employeeMapper, employeeEntityMapper);
    }
}
