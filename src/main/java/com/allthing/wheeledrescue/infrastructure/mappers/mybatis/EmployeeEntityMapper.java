package com.allthing.wheeledrescue.infrastructure.mappers.mybatis;

import com.allthing.wheeledrescue.infrastructure.entity.EmployeeEntity;
import com.allthing.wheeledrescue.util.mybatis.UuidTypeHandler;
import org.apache.ibatis.annotations.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeEntityMapper {
    
    @Results(id = "employeeResultMap", value = {
            @Result(property = "id", column = "id", javaType = UUID.class, typeHandler = UuidTypeHandler.class),
            @Result(property = "number", column = "number", javaType = Long.class),
            @Result(property = "birthDate", column = "birth_date", javaType= LocalDateTime.class),
            @Result(property = "firstName", column = "first_name", javaType = String.class),
            @Result(property = "lastName", column = "last_name",javaType = String.class),
            @Result(property = "gender", column = "gender", javaType = String.class),
            @Result(property = "hireDate", column = "hire_date", javaType = LocalDateTime.class),
            @Result(property = "leaveDate", column = "leave_date", javaType = LocalDateTime.class)
    })
    @Select("Select * FROM employee WHERE #{id} = id")
    Optional<EmployeeEntity> findById(@Param("id") UUID id);
    
    @ResultMap(value = "employeeResultMap")
    @Select("SELECT * FROM employee")
    List<EmployeeEntity> findAll();
}
