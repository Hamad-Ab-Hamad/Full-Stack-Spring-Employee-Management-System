package com.javaprojects.ems.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaprojects.ems.Entity.Employee;
import com.javaprojects.ems.Exception.ResourceNotFoundException;
import com.javaprojects.ems.Repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();

    }

    public Employee getEmployeeById(Integer id){
        return employeeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("No employee exsits for the given id: " + id));
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}
