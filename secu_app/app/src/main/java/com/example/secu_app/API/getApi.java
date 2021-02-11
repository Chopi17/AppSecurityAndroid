package com.example.secu_app.API;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class getApi {

    static final String BASE_URL = "https://6007f1a4309f8b0017ee5022.mockapi.io/api/m1/";

    private static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    interfaceApi service = retrofit.create(interfaceApi.class);
    Call<JsonObject> User = service.getUser("1");
    public static Retrofit getClient() {
        return retrofit;
    }

}
