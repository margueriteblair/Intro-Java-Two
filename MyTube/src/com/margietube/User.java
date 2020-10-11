package com.margietube;

public class User {
    private String email;


    //java constructor function
    public User(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}