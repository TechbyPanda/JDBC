package com.bank_management.model;

public class AccountModel {
    private int acc;
    private String fatherName;
    private String gender;
    private String dob;
    private String address;
    private String mobile;
    private String email;
    private int amount;
    private String fname;
    private String lname;

    public AccountModel(int acc,String fatherName, String gender, String dob, String address, String mobile, String email, String fname, String lname) {
        this.acc=acc;
        this.fatherName = fatherName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.fname = fname;
        this.lname = lname;
    }
    
    public AccountModel(int acc, String fatherName, String gender, String dob, String address, String mobile, String email, int amount, String fname, String lname) {
        this.acc = acc;
        this.fatherName = fatherName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.amount = amount;
        this.fname = fname;
        this.lname = lname;
    }

    
    public AccountModel(String fatherName, String gender, String dob, String address, String mobile, String email, int amount, String fname, String lname) {
        this.fatherName = fatherName;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
        this.mobile = mobile;
        this.email = email;
        this.amount = amount;
        this.fname = fname;
        this.lname = lname;
    }

    public AccountModel() {
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAcc() {
        return acc;
    }

    public void setAcc(int acc) {
        this.acc = acc;
    }
    
    
    
}
