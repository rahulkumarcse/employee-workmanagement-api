package com.devrahul.employeeworkmanagementapi.controller;

import com.devrahul.employeeworkmanagementapi.model.EmployeeSignUpDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @PostMapping(value = "/signup")
    ResponseEntity<?> registerEmployee(@RequestBody EmployeeSignUpDto employeeSignUpDto){

    }
}
