package com.hr_system.project.controllers;

import com.hr_system.project.dtos.CreateEmployeeDTO;
import com.hr_system.project.entities.Employee;
import com.hr_system.project.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //~spring~ controller entrypoint do server
@RequestMapping("/employee") //~spring~ classe da rota employee
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployess(){
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @PostMapping
    public ResponseEntity<Employee> postEmployee(@RequestBody CreateEmployeeDTO input){
        Employee employee = employeeService.postEmployee(input);
        return ResponseEntity.ok(employee);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Employee> putEmployee(@PathVariable Long id, @RequestBody CreateEmployeeDTO input){

    }
}
