package com.example.secu_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.example.secu_app.BDD.DatabaseHandler;
//TODO import fichier qui contient les trucs

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eText;
    private String trueUserName= DatabaseHandler.;
    private String truePassword = DatabaseHandler.password;

    boolean isValid = false;
    private int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.Login);
        ePassword = findViewById(R.id.Password);
        eLogin = findViewById(R.id.buttonLog);
        eText = findViewById(R.id.remains);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputUserName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputUserName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "You're missing a thing", Toast.LENGTH_SHORT).show();
                }else {
                    //chercher les vrai pass et username
                    isValid = validate(inputUserName, inputPassword);
                    if (!isValid){
                        counter--;
                        Toast.makeText(MainActivity.this, "You're missing a thing", Toast.LENGTH_SHORT).show();
                        eText.setText("essaie restants : " + counter);
                        if(counter ==0){
                            eLogin.setEnabled(false);
                        }
                    }else{
                        Toast.makeText(MainActivity.this, "Logging Succes", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(MainActivity.this, MainPage.class);
                        startActivity(intent);

                    }
                }
            }
        });

    }

    private boolean validate(String name, String password){
        if(name.equals(trueUserName) && password.equals(truePassword))
        {
            return true;
        }
        return false;
    }
}