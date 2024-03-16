package org.company.repository;

import org.company.entity.Employee;

import java.util.HashMap;
import java.util.List;

public class EmployeeRepository {
    private HashMap<Integer, Employee> DB;

    public EmployeeRepository() {
        DB = new HashMap<>();

        Employee employee1 = new Employee(
                 1
                ,"Mohamed Ehab"
                ,"21/10/2000"
                ,"01124694966"
                ,"IT"
        );
        Employee employee2 = new Employee(
                2
                ,"Mahmoud Ali"
                ,"23/11/2000"
                ,"01124694966"
                ,"DATA"
        );
        Employee employee3 = new Employee(
                3
                ,"Eman Ahmed"
                ,"25/1/2000"
                ,"01124694966"
                ,"ANALYTICS"
        );

        DB.put(1,employee1);
        DB.put(2,employee2);
        DB.put(3,employee3);
    }

    public List<Employee> retriveAllEmployees(){
        return DB.values().stream().toList();
    }

    public Employee retriveEmployeeById(int employeeId){
        return DB.get(employeeId);
    }
}
