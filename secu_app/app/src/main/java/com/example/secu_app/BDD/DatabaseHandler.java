package com.example.secu_app.BDD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHandler extends SQLiteOpenHelper {
    public static final String ACCOUNT_KEY = "id";
    public static final String ACCOUNT_NAME = "NomAccount";
    public static final String USER_NAME = "Prénom";
    public static final String USER_LASTNAME = "Nom";
    public static final String BANKACCOUNT = "Account";
    public static final String DATABASE = "bankAccount.db";

    public static final String BANKACCOUNT_TABLE_CREATE =
            "CREATE TABLE " + BANKACCOUNT + " (" +
                    ACCOUNT_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    ACCOUNT_NAME + " TEXT, " +
                    USER_NAME + " TEXT, " +
                    USER_LASTNAME + " TEXT)";

    private static final String BANKACCOUNT_TABLE_DROP = "DROP TABLE IF EXISTS " + BANKACCOUNT + ";";

    public DatabaseHandler(@Nullable Context context) {
        super(context, DATABASE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(BANKACCOUNT_TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(BANKACCOUNT_TABLE_DROP);
        onCreate(db);
    }
}

