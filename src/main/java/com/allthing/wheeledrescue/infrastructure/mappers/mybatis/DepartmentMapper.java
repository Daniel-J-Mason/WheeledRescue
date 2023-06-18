package com.allthing.wheeledrescue.infrastructure.mappers.mybatis;

import com.allthing.wheeledrescue.infrastructure.entity.DepartmentEntity;
import com.allthing.wheeledrescue.util.mybatis.UuidTypeHandler;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import java.time.LocalDate;
import java.util.Optional;
import java.util.UUID;

public interface DepartmentMapper {
    
    @Results(id = "employeeResultMap", value = {
            @Result(property = "id", column = "id", javaType = UUID.class, typeHandler = UuidTypeHandler.class),
            @Result(property = "number", column = "number", javaType = Long.class),
            @Result(property = "birthDate", column = "birth_date", javaType= LocalDate.class),
            @Result(property = "firstName", column = "first_name", javaType = String.class),
            @Result(property = "lastName", column = "last_name",javaType = String.class),
            @Result(property = "gender", column = "gender", javaType = String.class),
            @Result(property = "hireDate", column = "hire_date", javaType = LocalDate.class),
            @Result(property = "leaveDate", column = "leave_date", javaType = LocalDate.class)
    })
    @Select("Select * FROM employee WHERE #{id} = id")
    Optional<DepartmentEntity> findById(@Param("id") UUID id);
}
