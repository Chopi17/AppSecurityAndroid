package com.example.secu_app.API;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface interfaceApi {


    @GET("config/{id}")
    Call<JsonObject> getUser(@Path("id") String id);



    @GET("accounts")
    Call<JsonArray> getAccount();
}
