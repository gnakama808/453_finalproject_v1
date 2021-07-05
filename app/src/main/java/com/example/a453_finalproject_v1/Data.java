package com.example.a453_finalproject_v1;

public class Data {

    private String username;
    private String password;
    private String email;



    public Data(String username, String password, String email) { //Non-null constructor

        this.username = username;
        this.password = password;
        this.email = email;

    }
    public Data() {
        //Necessary null constructor
    }


    //Get username and set username
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }


    //Get password and set password
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    //Get email and set email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
