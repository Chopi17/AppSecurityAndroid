package com.example.secu_app.models;

import java.math.BigDecimal;

public class Account {

    private int id;
    private String account_name;
    private BigDecimal amount;
    private String iban;
    private String currency;

    //CONSTRUCTOR

    public Account(int id, String account_name, BigDecimal amount, String iban, String currency){
        this.id = id;
        this.account_name = account_name;
        this.amount = amount;
        this.iban = iban;
        this.currency = currency;
    }

    //GETTERS
    public int getId(){
        return id;
    }

    public BigDecimal getAmount(){
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

    public void setId(int id) {
        this.id = id;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public String AccountToString(){
        return "Account{" +
                "id" + id +
                "account_name" + account_name +
                "amount" + amount +
                "currency" + currency + "}";
    }

}
