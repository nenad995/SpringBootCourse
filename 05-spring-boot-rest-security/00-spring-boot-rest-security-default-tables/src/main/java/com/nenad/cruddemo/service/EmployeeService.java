package com.nenad.cruddemo.service;

import com.nenad.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    String deleteById(int id);
}
