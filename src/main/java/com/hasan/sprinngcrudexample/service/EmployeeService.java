package com.hasan.sprinngcrudexample.service;

import com.hasan.sprinngcrudexample.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
}
