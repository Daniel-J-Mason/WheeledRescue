package com.allthing.wheeledrescue.application.dto;

import com.allthing.wheeledrescue.domain.model.util.Gender;
import lombok.Builder;
import lombok.Value;

import java.time.LocalDate;
import java.util.UUID;

@Value
@Builder
public class EmployeeResponse {
    UUID id;
    Long number;
    LocalDate birthDate;
    String firstName;
    String lastName;
    String gender;
    LocalDate hireDate;
    LocalDate leaveDate;
}
