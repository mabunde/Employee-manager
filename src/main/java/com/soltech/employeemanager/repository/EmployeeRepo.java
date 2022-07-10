package com.soltech.employeemanager.repository;

import com.soltech.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
    void deleteEmployeeById(Long id);
    Optional <Employee> findEmployeeById(Long id);
}