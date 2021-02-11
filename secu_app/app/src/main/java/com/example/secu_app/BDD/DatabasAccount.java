package com.example.secu_app.BDD;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
public class DatabasAccount extends SQLiteOpenHelper {
    public static final String ACCOUNT_KEY = "accountkey";
    public static final String ACCOUNT_NAME = "NomAccount";
    public static final String BANKACCOUNT2 = "Account";
    public static final String AMOUNT = "Amount";
    public static final String IBAN = "Iban";
    public static final String CURRENCY = "Currency";
    public static final String DATABASE = "bankAccount.db";

    public static final String BANKACCOUNT_TABLE_CREATE2 =
            "CREATE TABLE " + BANKACCOUNT2 + " (" +
                    ACCOUNT_KEY + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    ACCOUNT_NAME + " TEXT, " +
                    AMOUNT + " TEXT, " +
                    IBAN + " TEXT, " +
                    CURRENCY+ " TEXT)";

    private static final String BANKACCOUNT_TABLE_DROP = "DROP TABLE IF EXISTS " + BANKACCOUNT2 + ";";

    public DatabasAccount(@Nullable Context context) {
        super(context, DATABASE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(BANKACCOUNT_TABLE_CREATE2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(BANKACCOUNT_TABLE_DROP);
        onCreate(db);

    }
    private SQLiteDatabase db;

    public void open() throws SQLiteException {
        try {
            db = getWritableDatabase();
        } catch (SQLiteException ex) {
            db = getReadableDatabase();
        }
    }
}
