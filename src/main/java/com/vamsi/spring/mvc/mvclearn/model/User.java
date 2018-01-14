package com.vamsi.spring.mvc.mvclearn.model;

public class User {
    int id;
    String name;
    String role;
    String eMail;

    public User(int id, String name, String eMail) {
        this.id = id;
        this.name = name;
        this.eMail = eMail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
