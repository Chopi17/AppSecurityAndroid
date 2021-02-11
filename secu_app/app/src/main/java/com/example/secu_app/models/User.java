package com.example.secu_app.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {

    private int id;
    private String name;
    private String lastname;
    private List<Account> accounts = new ArrayList<>();
    private String password;

    //CONSTRUCTOR
    public User(int id, String name, String lastname, List<Account> accounts, String password) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.accounts = accounts;
        this.password = password;
    }

    //GETTERS

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    //SETTERS


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String UserToString(){
        return "User{" +
                "id" + id +
                "name" + name +
                "lastname" + lastname +
                "password" + password +
                "accounts" + accounts +
                "}";
    }

}
