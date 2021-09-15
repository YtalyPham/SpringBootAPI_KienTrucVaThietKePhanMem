package com.example.StudentLab.service;

import com.example.StudentLab.entity.Employee;
import com.example.StudentLab.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> books= new ArrayList<Employee>();
        employeeRepository.findAll().forEach(book1->books.add(book1));
        return books;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public void deleteById(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee updateEmployeeById(Long id, Employee employee) {
        Employee employeeDB= employeeRepository.findById(id).get();
        if(Objects.nonNull(employee.getFirstName()) &&
                !"".equalsIgnoreCase(employee.getFirstName())){
            employeeDB.setFirstName(employee.getFirstName());
        }
        if(Objects.nonNull(employee.getLastName()) &&
                !"".equalsIgnoreCase(employee.getLastName())){
            employeeDB.setLastName(employee.getLastName());
        }
        if(Objects.nonNull(employee.getEmail()) &&
                !"".equalsIgnoreCase(employee.getEmail())){
            employeeDB.setEmail(employee.getEmail());
        }
        if(Objects.nonNull(employee.getPhone()) &&
                !"".equalsIgnoreCase(employee.getPhone())){
            employeeDB.setPhone(employee.getPhone());
        }
        return employeeRepository.save(employeeDB);
    }
}
