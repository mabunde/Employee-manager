package com.soltech.employeemanager.service;

import com.soltech.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeService {
Employee addEmployee(Employee employee);
List<Employee> findAllEmployee();
Employee updateEmployee(Employee employee);
Employee findEmployeeById(Long id);
void deleteEmployeeById(Long id);
}
