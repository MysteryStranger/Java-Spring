package com.example.lec_1_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application implements CommandLineRunner {

    //Get the service from DI container 
@Autowired
EmployeeService employeeService;

    public static void main(String[] args) {
        var app = SpringApplication.run(Application.class, args);

        //Get the Service from DI Container
        var employeeService = app.getBean(EmployeeService.class);

        employeeService.addWorker("Dart Vlados");
        employeeService.addWorker("Katy Mystery");
        employeeService.addWorker("Lord Anderass");
        employeeService.addWorker("Toshiba killer");

        System.out.println(employeeService.getAllWorkers());

        System.out.println();
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
