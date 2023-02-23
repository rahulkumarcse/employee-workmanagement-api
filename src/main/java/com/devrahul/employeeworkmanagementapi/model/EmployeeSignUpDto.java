package com.devrahul.employeeworkmanagementapi.model;


public class EmployeeSignUpDto {
    private String employeeName;
    private String emailId;
    private String password;

    private String cPassword;

    public EmployeeSignUpDto() {
    }

    public EmployeeSignUpDto(String employeeName, String emailId, String password, String cPassword) {
        this.employeeName = employeeName;
        this.emailId = emailId;
        this.password = password;
        this.cPassword = cPassword;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public String getcPassword() {
        return cPassword;
    }

    public void setcPassword(String cPassword) {
        this.cPassword = cPassword;
    }
}
