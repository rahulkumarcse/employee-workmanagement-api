package com.devrahul.employeeworkmanagementapi.utils;

public class ValidatorUtility {
    public static boolean signupValidator(String name,String emailId, String password, String cPassword){
        if(name.length()<4 ){
            return false;
        }
        if(!password.equals(cPassword)){
            System.out.println(password + " "+ cPassword);
            return false;
        }
        return true;
    }

}
