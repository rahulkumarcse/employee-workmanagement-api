package com.devrahul.employeeworkmanagementapi.repository;

import com.devrahul.employeeworkmanagementapi.entity.Employee;
import com.devrahul.employeeworkmanagementapi.model.EmployeeLoginDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeRepository {
    @PersistenceContext
    EntityManager entityManager;
    @Transactional
    public  boolean signUp(Employee employee){
        try{
            Query query= entityManager.createNativeQuery("select emp_id from employee where emp_email_id=?1");
            query.setParameter(1,employee.getEmail());
            List<Object[]> result= query.getResultList();
            if(result.size()>0){
                return false;
            }
            else {
                entityManager.persist(employee);
                return true;
            }
        }
        catch (Exception e){
            return  false;
        }
    }
    public int logIn(EmployeeLoginDTO employeeLoginDTO){
        try{
            Query query= entityManager.createNativeQuery("select password,emp_id from employee where emp_email_id=?1");
            query.setParameter(1,employeeLoginDTO.getEmailId());
            List<Object[]> result= query.getResultList();

            String validPass=result.size()>0?result.get(0)[0].toString():"";
            System.out.println(validPass);

            if(validPass.equals(employeeLoginDTO.getPassword())){
                System.out.println(result);
            int empId= Integer.parseInt(result.get(0)[1].toString());
                return empId;
            }
            else{

                return -1;
            }
        }
        catch (Exception e ){
            e.printStackTrace();
            return -1;
        }
    }
}
