package com.example.secu_app.models;
import com.example.secu_app.API.getApi;
import com.example.secu_app.API.interfaceApi;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.secu_app.BDD.DatabasAccount;
import com.example.secu_app.BDD.DatabaseHandler;

import java.math.BigDecimal;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.provider.SyncStateContract;
import android.util.Log;


public class ApiToBdd {
    public interface Reussite{
        void onSuccess(ArrayList<Account> accounts);
        void onError(String message);
    }
    DatabasAccount.onUpgrade(cd, 1 , 2);

    private RequestQueue queue;
    private static final String URL = "https://6007f1a4309f8b0017ee5022.mockapi.io/api/m1/accounts";
    private static final String TAG = "APP";

    public ApiToBdd(RequestQueue queue) {
        this.queue = queue;
    }
    public void getSongList(final Reussite callback){

        JsonArrayRequest request = new JsonArrayRequest(Request.Method.GET, URL, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Log.d(TAG, "onResponse: " + response);

                ArrayList<Account> accounts= new ArrayList<>();
                if(response.length() > 0){
                    for (int i = 0; i < response.length() ; i++) {
                        try {
                            //copie les données de l'API
                            JSONObject accountObject = response.getJSONObject(i);
                            String id = accountObject.getString("id");
                            String account_name = accountObject.getString("account_name");
                            String amount = accountObject.getString("amount");
                            String iban =accountObject.getString("iban");
                            String currency = accountObject.getString("currency");
                            Account account = new Account(id, account_name, amount, iban, currency);
                            accounts.add(account);
                            //Insert in the line contentValues
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(DatabasAccount.ACCOUNT_KEY, id);
                            contentValues.put(DatabasAccount.ACCOUNT_NAME, account_name);
                            contentValues.put(DatabasAccount.AMOUNT, amount);
                            contentValues.put(DatabasAccount.IBAN, iban);
                            contentValues.put(DatabasAccount.CURRENCY, currency);

                            // Insert the line in the database
                            long rowId = db.insert(DatabasAccount.BANKACCOUNT2, null, contentValues);

                        } catch (JSONException e) {
                            Log.d(TAG, "onResponse: " + e.getMessage());
                            callback.onError("Une erreur s'est produite");
                            e.printStackTrace();
                        }
                    }

                    callback.onSuccess(accounts);

                }else{
                    callback.onError("Aucune Donnée n'est trouver");
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG, "onResponse: " + error.getMessage());
                callback.onError("Une erreur s'est produite");
            }
        });

        queue.add(request);

    }


}
