package com.allthing.wheeledrescue.application.dto;

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
