package com.student_management_system.model;

public class loginModel {
    private String username;
    private String password;

    public loginModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public loginModel() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
