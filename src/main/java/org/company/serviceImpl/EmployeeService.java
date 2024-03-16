package org.company.serviceImpl;

import org.company.entity.Employee;
import org.company.repository.EmployeeRepository;
import org.company.service.IEmployeeService;

import java.util.List;

public class EmployeeService implements IEmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService() {
        this.employeeRepository = new EmployeeRepository();
    }

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee getEmployeeByID(int employeeId) {
        return employeeRepository.retriveEmployeeById(employeeId);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.retriveAllEmployees();
    }
}
