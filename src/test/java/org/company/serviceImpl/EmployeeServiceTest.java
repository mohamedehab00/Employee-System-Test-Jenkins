package org.company.serviceImpl;

import org.company.entity.Employee;
import org.company.repository.EmployeeRepository;
import org.company.service.IEmployeeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

class EmployeeServiceTest {
    IEmployeeService service = new EmployeeService();
    EmployeeRepository repository = new EmployeeRepository();

    @Test
    void getEmployeeByID() {
        Employee result = service.getEmployeeByID(1);

        Assertions.assertEquals(result.getName(),"Mohamed Ehab");
        Assertions.assertEquals(result.getPhone(),"01124694966");
        Assertions.assertEquals(result.getDOB(),"21/10/2000");
    }

    @Test
    void getAllEmployees() {
        List<Employee> result = service.getAllEmployees();

        Assertions.assertEquals(result.size(),3);
    }
}