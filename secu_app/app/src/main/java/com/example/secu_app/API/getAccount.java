package com.example.secu_app.API;

import com.example.secu_app.models.User;

import retrofit2.Call;
import retrofit2.http.GET;

public interface getAccount {
    @GET("/Accounts/")
    Call<Account> getAccount(); // à checker
}
