package com.allthing.wheeledrescue.application.controller;

import com.allthing.wheeledrescue.application.dto.EmployeeResponse;
import com.allthing.wheeledrescue.domain.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/employee")
@RequiredArgsConstructor
public class EmployeeController {
    
    private final EmployeeService employeeService;
    
    @RequestMapping(value = "/{id}")
    public Optional<EmployeeResponse> findById(@PathVariable(value = "id") UUID id){
        return employeeService.findById(id);
    }
    
    @RequestMapping(value = "/query")
    public Optional<EmployeeResponse> findByEmployeeNumber(@RequestParam(value = "employeeNumber") Long employeeNumber){
        return employeeService.findByEmployeeNumber(employeeNumber);
    }
    
    @RequestMapping
    public List<EmployeeResponse> findAll(){
        return employeeService.findAll();
    }
    
    @RequestMapping(value = "/active")
    public List<EmployeeResponse> findActiveEmployees() {
        return employeeService.findActiveEmployees();
    }
}
