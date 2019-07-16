package com.javatpoint;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class Login implements Action {
    //data members
    private String userName ;
    private String password;
    private String message;

    //Business Logic
    public String execute(){
        if(getUserName().equals("dragon") && getPassword().equals("j")){
            setMessage("Hello "+userName +" You are successfully logged in...");
            return "success";
        }
        setMessage("Sorry "+userName +" You can't log in with this credential");
        return "error";
    }

    //Getters and Setters
    public String getUserName() {
        return userName;
    }

    public void getPassword(int n){
        System.out.println("test in own pwd");
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
