package com.javaprojects.ems.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaprojects.ems.Entity.Employee;
import com.javaprojects.ems.Service.EmployeeService;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployeesHandler(){
        return ResponseEntity.status(200).body(employeeService.getAllEmployee());
    }

    // Build post request for the api to add employee 
    @PostMapping
    public ResponseEntity<Employee> addEmployeeHandler(@RequestBody Employee employee){
        
        return ResponseEntity.status(201).body(employeeService.addEmployee(employee));
    }
    
}
