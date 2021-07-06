package com.example.a453_finalproject_v1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "userDatabase.db";
    public static final String USER_TABLE_NAME = "users";
    public static final String USER_USERNAME = "username";
    public static final String USER_PASSWORD = "password";
    public static final String USER_EMAIL = "email";

    public static final String USER_TABLE_NAME_2 = "money";
    public static final int USER_ANNUAL_INCOME = 0;
    public static final int USER_DAILY_INCOME = 0;
    public static final int USER_DESIRED_INCOME = 0;
    public static final int USER_ANNUAL_SAVINGS = 0;
    public static final int USER_DAILY_SAVINGS = 0;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql;
        sql = "CREATE TABLE " + USER_TABLE_NAME
                + " (id integer primary key, username text, password text, email text) ";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS users";
        db.execSQL(sql);
    }

    public boolean insertUser(String username, String password, String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(USER_USERNAME, username);
        cv.put(USER_PASSWORD, password);
        cv.put(USER_EMAIL, email);

        db.insert(USER_TABLE_NAME, null, cv);

        return true;
    }

    //Here I edited the getData function to try and get the username instead for validation, still resulted in app crash
    /*
    public Cursor geUsername(String username) {
        String query = "Select * from users where username = " + username;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor curs = db.rawQuery(query,null);

        return curs;
    }
     */

}
