package com.nenad.cruddemo.service;

import com.nenad.cruddemo.dao.EmployeeRepository;
import com.nenad.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Employee employee = null;

        if (employeeRepository.findById(id).isEmpty()){
           return null;
       }

       return employeeRepository.findById(id).get();
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public String deleteById(int id) {
        employeeRepository.deleteById(id);
        return "Deleted employee id - " + id;
    }
}
