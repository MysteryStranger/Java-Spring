package com.example.lec_1_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // קומפוננטה מנהולת על ידי ספרינג
public class EmployeeService {

    @Autowired // ingection of Manager
    private  EmployeeManager employeeManager;

    //add some methods
    public void addWorker(String employee){
        employeeManager.addEmployee(employee);
    }

    public List<String> getAllWorkers(){
        return employeeManager.getEmployees();
    }

}
