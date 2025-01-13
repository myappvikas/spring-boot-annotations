package com.spring.boot.annotations.service;

import com.spring.boot.annotations.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee getEmployee(Integer employeeId);

    Iterable<Employee> getAllEmployee();
}
