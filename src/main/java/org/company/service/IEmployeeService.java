package org.company.service;

import org.company.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeByID(int employeeId);
}
