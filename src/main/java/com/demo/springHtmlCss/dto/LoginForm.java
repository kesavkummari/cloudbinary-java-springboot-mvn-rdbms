package com.demo.springHtmlCss.dto;

public class LoginForm {
    private String name;
    private String password;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String gender;
    public String getDesigantion() {
        return desigantion;
    }

    public void setDesigantion(String desigantion) {
        this.desigantion = desigantion;
    }

    private String desigantion;
    // Getters and setters
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
}

