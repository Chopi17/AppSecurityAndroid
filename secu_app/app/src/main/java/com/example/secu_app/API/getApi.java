package com.example.secu_app.API;

import com.example.secu_app.API.interfaceApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getApi {


    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(interfaceApi.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static Retrofit getClient() {
        return retrofit;
    }

}
