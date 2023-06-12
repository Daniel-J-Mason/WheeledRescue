package com.allthing.wheeledrescue.domain.model;

import com.allthing.wheeledrescue.domain.model.util.Gender;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {
    private UUID id;
    private Long number;
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate hireDate;
    private LocalDate leaveDate;
}
