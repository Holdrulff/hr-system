package com.hr_system.project.services;

import com.hr_system.project.dtos.CreateEmployeeDTO;
import com.hr_system.project.entities.Employee;
import com.hr_system.project.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    public Employee postEmployee(CreateEmployeeDTO input){
        Employee employee = new Employee();
        employee.setName(input.name());
        employee.setInitDate(input.initDate());
        employee.setSalary(input.salary());
        employee.setPosition(input.position());
        employee.setTeam(input.team());

        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Long id, CreateEmployeeDTO input){
        Optional<Employee employee = employeeRepository.findById(id);

        if(employee.isEmpty()) throw new RuntimeException("Employee not found");

        employee.setName(input.name());
        employee.setInitDate(input.initDate());
        employee.setSalary(input.salary());
        employee.setPosition(input.position());
        employee.setTeam(input.team());
    }

}
