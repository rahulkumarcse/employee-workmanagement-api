package com.devrahul.employeeworkmanagementapi.model;

public class EmployeeLoginDTO {
    private String emailId;
    private  String password;

    public EmployeeLoginDTO() {
    }

    public EmployeeLoginDTO(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
