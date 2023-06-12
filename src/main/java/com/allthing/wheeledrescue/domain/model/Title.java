package com.allthing.wheeledrescue.domain.model;

import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Title {
    private UUID id;
    private Employee employee;
    private String title;
    private LocalDate fromDate;
    private LocalDate toDate;
}
