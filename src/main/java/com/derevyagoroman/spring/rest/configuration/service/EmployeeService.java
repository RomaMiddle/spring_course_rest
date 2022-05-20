package com.derevyagoroman.spring.rest.configuration.service;

import com.derevyagoroman.spring.rest.configuration.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees ();


    public Employee getEmployee (int id);

    public void deleteEmployee (int id);

     public void saveEmployee(Employee employee);
}

