package com.flipkart.bean;

/**
 * Here is the information required to identify the admin of the Flipfit application
 */

public class FlipFitAdmin  {
    private int userId;
    private String password;
    private String emailID;
    public void setUserID(int userId){
        this.userId=userId;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setEmailID(String emailID){this.emailID=emailID;}
    public int getUserID(){
        return this.userId;
    }
    public String getPassword() {
        return password;
    }
    public String getEmailID() {return emailID;}
}
