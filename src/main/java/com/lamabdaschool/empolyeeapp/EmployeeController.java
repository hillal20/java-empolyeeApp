package com.lamabdaschool.empolyeeapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/data")
public class EmployeeController {


   // get method for all employee
   @GetMapping(value = "/allEmployees", produces = {"application/json"} )
    public ResponseEntity<?> getAllEmployees(){
         ArrayList<Employee> data = EmployeeApplication.employeeList.empArrList;
         // we need to sort by the name ;
          data.sort((e1,e2)-> e1.getName().compareToIgnoreCase(e2.getName()) );
    return new ResponseEntity<>(data , HttpStatus.OK );

    }
     // get method for one employee by id
    @GetMapping(value = "/employee/{Id}", produces = {"application/json"} )
    public ResponseEntity<?> getEmployeeById (@PathVariable long Id){
          Employee emp = EmployeeApplication.employeeList.findEmployee(e -> e.getId() == Id );
           return new ResponseEntity<>(emp , HttpStatus.OK );

    }
    @GetMapping(value = "/employees/{letter}", produces = {"application/json"} )
    public ResponseEntity<?> getEmployeeById (@PathVariable String letter){
        System.out.println("letter ==> " + letter);
        ArrayList <Employee>  empArr = EmployeeApplication.employeeList.findEmployees(e -> e.getName().toLowerCase().charAt(0) == letter.toLowerCase().charAt(0) );
        return new ResponseEntity<>(empArr , HttpStatus.OK );

    }


}




