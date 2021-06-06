package com.nyash.spring.mvc.dao;

import com.nyash.spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);
}
