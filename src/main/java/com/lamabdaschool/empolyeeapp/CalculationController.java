package com.lamabdaschool.empolyeeapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculationController {
@GetMapping(value = "/calculate/salary/{empId}/{raise}", produces = {"application/json"})
    public ResponseEntity<?> checkEmpRaise(@PathVariable long empId, @PathVariable double raise){
          Employee data = EmployeeApplication.employeeList.findEmployee(emp -> emp.getId() == empId);
              ///// making a  copy  of an employee using the second constructor in the Employee Class
           Employee temEmp = new Employee(data);
           //we will change the salary of the copy of the emp to avoid messing  with the original emp
              temEmp.setSalary(temEmp.getSalary() * (1.0 + raise) );

    return new ResponseEntity(temEmp, HttpStatus.OK);
}

}
