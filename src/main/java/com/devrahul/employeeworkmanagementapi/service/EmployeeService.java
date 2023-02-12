package com.devrahul.employeeworkmanagementapi.service;

import com.devrahul.employeeworkmanagementapi.model.EmployeeSignUpDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;
    List<Object> registerUser(EmployeeSignUpDto employeeSignUpDto){

    }
}
