package com.shop.model;

public class User {
    public String username;
    public String email;
    public String password;
    public boolean isCustomer;
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isCustomer=" + isCustomer +
                '}';
    }
}
