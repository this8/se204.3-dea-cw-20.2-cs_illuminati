package com.phoenixairline.models;

public class User {

    private String username;
    private String password;
    private String full_name;
    private String email;
    private String user_type;

    public User(String full_name, String email, String username, String password, String user_type) {
        super();
        this.username = username;
        this.password = password;
        this.full_name = full_name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.user_type = user_type;
    }

    public User() {
        super();
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

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }
}
