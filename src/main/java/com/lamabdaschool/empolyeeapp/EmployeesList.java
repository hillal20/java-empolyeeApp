package com.lamabdaschool.empolyeeapp;

import java.util.ArrayList;

public class EmployeesList {
    public  ArrayList<Employee> empArrList = new ArrayList<Employee>();
    public EmployeesList (){
        empArrList.add(new Employee("steve", "john", 46.006, true, 1,1));
        empArrList.add(new Employee("bill", "hill", 80.006, true, 1,1));
        empArrList.add(new Employee("Ali", "ais", 76.006, true, 1,1));
        empArrList.add(new Employee("mach", "rof", 90.006, true, 1,1));
        empArrList.add(new Employee("pool", "james", 25.006, true, 1,1));
        empArrList.add(new Employee("aach", "rof", 90.006, true, 1,1));
        empArrList.add(new Employee("apool", "james", 25.006, true, 1,1));




    }
            // return single emp after scanning within the interface if it is a real emp via test method
    public  Employee findEmployee(CheckEmployee testEmpInterface ){

       for ( Employee  emp: empArrList){
               // we need to check if it is an employee or not
           if (  testEmpInterface.test(emp) ){
                // test passed for this employee we need to return it
               return emp;
           }
       }
       return null;
    }
     // return array of emp
    public ArrayList<Employee>findEmployees(CheckEmployee testEmp ){

        ArrayList<Employee> tempEmpArrList = new ArrayList<>();

        for ( Employee  emp: empArrList){
            if (  testEmp.test(emp) ){
                tempEmpArrList.add(emp);
            }
        }
        return tempEmpArrList;
    }
}
