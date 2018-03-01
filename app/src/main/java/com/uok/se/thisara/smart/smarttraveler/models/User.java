package com.uok.se.thisara.smart.smarttraveler.models;

/**
 * Created by malware on 3/1/18.
 */

public class User {

    private String userId;
    private String email;
    private String idToken;
    private String userName;


    public User(String userId, String email, String idToken, String userName) {
        this.userId = userId;
        this.email = email;
        this.idToken = idToken;
        this.userName = userName;
    }

    public String getuserId() {
        return userId;
    }

    public void setuserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdToken() {
        return idToken;
    }

    public void setIdToken(String idToken) {
        this.idToken = idToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
