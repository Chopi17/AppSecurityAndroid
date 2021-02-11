package com.example.secu_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.secu_app.BDD.DatabaseHandler;

public class MainPage extends AppCompatActivity {
    private TextView eFirstName;
    private TextView eLastName;
    private TextView eIban;
    private TextView eAmount;
    private TextView eCurrency;
    private TextView eAccountName;
    private Button erefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // chercher les donnnées
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        eFirstName = findViewById(R.id.FirstName);;
        eLastName = findViewById(R.id.LastName);
        eIban= findViewById(R.id.Iban);
        eAmount= findViewById(R.id.Amount);
        eCurrency= findViewById(R.id.Currency);
        eAccountName =findViewById(R.id.AccountName);
        erefresh = findViewById(R.id.refresh);

        // a remplacé par les données de l'API
        eFirstName.setText("Pierre");
        eLastName.setText("Pain");
        eIban.setText("300003");
        eAmount.setText("1220");
        eCurrency.setText("euro");
        eAccountName.setText("RB72");
        erefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eAmount.setText("1320");
                eCurrency.setText("dollars");
                eAccountName.setText("RB73");
                eIban.setText("400003");
            }
        });
    }
}