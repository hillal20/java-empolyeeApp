package com.lamabdaschool.empolyeeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeApplication {

    static EmployeesList employeeList;


    public static void main(String[] args) {
       employeeList = new EmployeesList();




        SpringApplication.run(EmployeeApplication.class, args);
    }

}
