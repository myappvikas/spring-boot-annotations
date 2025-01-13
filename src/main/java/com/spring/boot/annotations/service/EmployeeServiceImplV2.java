package com.spring.boot.annotations.service;

import com.spring.boot.annotations.entity.Employee;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImplV2 implements EmployeeService{

    @Override
    public Employee saveEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee getEmployee(Integer employeeId) {
        return null;
    }

    @Override
    public Iterable<Employee> getAllEmployee() {
        return null;
    }
}
