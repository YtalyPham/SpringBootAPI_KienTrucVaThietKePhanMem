package com.example.StudentLab.controller;

import com.example.StudentLab.entity.Employee;
import com.example.StudentLab.service.EmployeeService;
import com.example.StudentLab.service.EmployeeServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        LOGGER.info("Inside getAllEmployee");
        return  employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long employeeId){
        LOGGER.info("Inside getEmployeeById");
        return employeeService.getEmployeeById(employeeId);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){
        LOGGER.info("Inside saveEmployee");
        return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable("id") Long employeeId,@Valid @RequestBody Employee employee){
        LOGGER.info("Inside updateEmployee");
        return new ResponseEntity<Employee>(employeeService.updateEmployeeById(employeeId,employee), HttpStatus.CREATED);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteById(@PathVariable("id") Long employeeId){
        LOGGER.info("Inside deleteEmployee");
        employeeService.deleteById(employeeId);
        return "Delete Sucessfully!";
    }

}
