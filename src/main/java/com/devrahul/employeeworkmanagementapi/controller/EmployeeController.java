package com.devrahul.employeeworkmanagementapi.controller;

import com.devrahul.employeeworkmanagementapi.model.EmployeeLoginDTO;
import com.devrahul.employeeworkmanagementapi.model.EmployeeSignUpDto;
import com.devrahul.employeeworkmanagementapi.service.EmployeeService;
import org.hibernate.type.IntegerType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/employee",consumes="application/json")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping(value = "/signup")
    public ResponseEntity<?> registerEmployee(@RequestBody EmployeeSignUpDto employeeSignUpDto){
        List<Object> result = employeeService.registerUser(employeeSignUpDto);
        if(result.get(0).toString().equals("TRUE")){
            return new ResponseEntity<>("SUCCESS", HttpStatus.OK);
        }
        else return new ResponseEntity<>("FAILED",HttpStatus.BAD_REQUEST);
    }
    @PostMapping(value = "/login")
    public ResponseEntity<?> loginEmployee(@RequestBody EmployeeLoginDTO employeeLoginDTO){
        List<Object> result = employeeService.logInUser(employeeLoginDTO);
        if(result.get(0).toString().equals("TRUE")){
            return new ResponseEntity<>(Integer.parseInt(result.get(1).toString()), HttpStatus.OK);
        }
        else return new ResponseEntity<>("FAILED",HttpStatus.BAD_REQUEST);
    }
}
