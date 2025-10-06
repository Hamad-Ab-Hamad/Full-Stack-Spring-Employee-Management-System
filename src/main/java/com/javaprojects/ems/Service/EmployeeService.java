package com.javaprojects.ems.Service;

import org.springframework.stereotype.Service;

import com.javaprojects.ems.Entity.Employee;
import com.javaprojects.ems.Repository.EmployeeRepository;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
