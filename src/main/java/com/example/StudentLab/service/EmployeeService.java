package com.example.StudentLab.service;

import com.example.StudentLab.entity.Employee;
import com.example.StudentLab.error.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(Long id) throws EmployeeNotFoundException;
    public void deleteById(Long id);
    public Employee updateEmployeeById(Long id,Employee employee);

}
