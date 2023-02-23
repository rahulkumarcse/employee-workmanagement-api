package com.devrahul.employeeworkmanagementapi.service;

import com.devrahul.employeeworkmanagementapi.entity.Employee;
import com.devrahul.employeeworkmanagementapi.model.EmployeeLoginDTO;
import com.devrahul.employeeworkmanagementapi.model.EmployeeSignUpDto;
import com.devrahul.employeeworkmanagementapi.repository.EmployeeRepository;
import com.devrahul.employeeworkmanagementapi.utils.ValidatorUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
   public List<Object> registerUser(EmployeeSignUpDto employeeSignUpDto){
        boolean signUpValidation = ValidatorUtility.signupValidator(employeeSignUpDto.getEmployeeName(),
                employeeSignUpDto.getEmailId(), employeeSignUpDto.getPassword(), employeeSignUpDto.getcPassword());
        if(signUpValidation){
            Employee newEmployee= new Employee();
            newEmployee.setEmail(employeeSignUpDto.getEmailId());
            newEmployee.setName(employeeSignUpDto.getEmployeeName());
            newEmployee.setPassword(employeeSignUpDto.getPassword());
            newEmployee.setIsAdmin("NO");
            boolean signUpStatus=employeeRepository.signUp(newEmployee);
            if(signUpStatus==false){
                return List.of("FALSE");
            }
            return List.of( "TRUE");
        }
        else return List.of("FALSE");
    }
    public List<Object> logInUser(EmployeeLoginDTO employeeLoginDTO) {
       int login= employeeRepository.logIn(employeeLoginDTO);
        if(login>-1){

            return List.of( "TRUE",login);
        }
        else{
            return List.of("FALSE");
        }
    }
}
