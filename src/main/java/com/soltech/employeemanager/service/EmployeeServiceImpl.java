package com.soltech.employeemanager.service;

import com.soltech.employeemanager.exception.UserNotFoundException;
import com.soltech.employeemanager.model.Employee;
import com.soltech.employeemanager.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl  implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> findAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id).orElseThrow(
                ()-> new UserNotFoundException("User by id "+id+"was not found"));
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }
}
