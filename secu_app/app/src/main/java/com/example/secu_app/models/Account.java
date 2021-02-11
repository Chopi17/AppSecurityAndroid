package com.example.secu_app.models;

import java.math.BigDecimal;

public class Account {

    private String id;
    private String account_name;
    private String amount;
    private String iban;
    private String currency;

    //CONSTRUCTOR

    public Account(String id, String account_name, String amount, String iban, String currency){
        this.id = id;
        this.account_name = account_name;
        this.amount = amount;
        this.iban = iban;
        this.currency = currency;
    }

    //GETTERS
    public String getId(){
        return id;
    }

    public String getAmount(){
        return amount;
    }

    public String getAccount_name(){
        return account_name;
    }

    public String getIban(){
        return iban;
    }

    public String getCurrency() {
        return currency;
    }

    //SETTERS

    public void setId(String id) {
        this.id = id;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String AccountToString(){
        return "Account{" +
                "id" + id +
                "account_name" + account_name +
                "amount" + amount +
                "currency" + currency + "}";
    }

}
