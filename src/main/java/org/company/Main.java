package org.company;

import org.company.entity.Employee;
import org.company.service.IEmployeeService;
import org.company.serviceImpl.EmployeeService;

public class Main {
    public static void main(String[] args) {
        IEmployeeService employeeService = new EmployeeService();

        for (Employee employee : employeeService.getAllEmployees()){
            System.out.println(employee);
        }
    }
}