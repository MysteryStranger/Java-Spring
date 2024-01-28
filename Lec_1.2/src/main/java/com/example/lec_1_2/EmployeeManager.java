package com.example.lec_1_2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component //Spring build DI
public class EmployeeManager {
    private List<String> employees = new ArrayList<>();

    public void addEmployee(String employee){
        employees.add(employee);
    }

    public List<String> getEmployees() {
        return employees;
    }
}
