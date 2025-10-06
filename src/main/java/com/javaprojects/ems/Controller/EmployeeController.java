package com.javaprojects.ems.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaprojects.ems.Entity.Employee;
import com.javaprojects.ems.Service.EmployeeService;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Build get all employees REST API
    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployeesHandler(){
        return ResponseEntity.status(200).body(employeeService.getAllEmployee());
    }

    // Build get employee by ID REST API
    @GetMapping("{id}")
    public ResponseEntity<Employee> getEmployeebyIdHandler(@PathVariable("id") Integer id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }
    
    // Build delete employee by ID REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployeebyIdHandler(@PathVariable("id") Integer id){
        employeeService.deleteEmployeeById(id);
        return ResponseEntity.ok("Employee deleted successfully");
    }

    // Build post request for the api to add employee 
    @PostMapping
    public ResponseEntity<Employee> addEmployeeHandler(@RequestBody Employee employee){
        
        return ResponseEntity.status(201).body(employeeService.addEmployee(employee));
    }
    
}
