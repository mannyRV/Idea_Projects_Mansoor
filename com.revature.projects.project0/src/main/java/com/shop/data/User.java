package com.shop.data;

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

    private void register(String email, String username, String password) {
        this.username= username;
        this.password= password;
        this.email=email;
        isCustomer = true;
    }
}
