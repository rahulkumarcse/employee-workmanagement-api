package com.devrahul.employeeworkmanagementapi.entity;


import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "EMP_ID")
    private  Long empId;


    @Column(name = "EMP_EMAIL_ID",unique = true)
    private String email;

    @Column(name = "EMP_NAME")
    private  String name;

    @Column(name = "password")
    public String password;

    @Column(name = "IS_ADMIN")
    public String isAdmin;

    public Employee() {
    }

    public Employee(Long empId, String email, String name, String password, String isAdmin) {
        this.empId = empId;
        this.email = email;
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }
}
