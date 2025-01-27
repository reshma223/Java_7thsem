package com.innovator.user;  // Corrected package

public class LoginBean {
    private String name, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Simple validation logic
    public boolean validate() {
        return password.equals("saugat");
    }
}
