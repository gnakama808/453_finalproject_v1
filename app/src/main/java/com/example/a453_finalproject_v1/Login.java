package com.example.a453_finalproject_v1;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import java.util.Set;

public class Login extends AppCompatActivity {

    private EditText username;
    private EditText password;
    Button btnLogin;
    Button btnSignup;

    SQLiteDatabase userDatabase;
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.edtText_username);
        password = findViewById(R.id.edtText_password);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);

        userDatabase = openOrCreateDatabase("userDatabase.db", Context.MODE_PRIVATE,null);
        dbHelper = new DBHelper(getApplicationContext());


        //Button that sends the user to the sign up screen/User Registration
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Signup.class);
                startActivity(intent);
            }
        });

        //Button that validates the user and sends the user in to the Setting screen
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                //Cursor to check that the last person added (the most recent person) is added to the database (successful)
                /*
                Cursor resultSet = userDatabase.rawQuery("Select * from users",null);
                resultSet.moveToLast();
                String data1 = resultSet.getString(1); //Gets the username from the database table
                Toast.makeText(getApplicationContext(),"Welcome, "+data1+"!",Toast.LENGTH_LONG).show();
                resultSet.close();
                 */



                //If user exists
                if (true) {
                    Toast.makeText(getApplicationContext(),"Welcome, "+user+"!",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), Setting.class);
                    startActivity(intent);
                }
                //Else if user does not exist
                else {
                    Toast.makeText(getApplicationContext(),"Woops! Please try logging in again.",Toast.LENGTH_LONG).show();
                }


            }
        });

    }


    //Function for checking if the user exists in the database, causes the app to crash if no user exists
    /*
    public boolean findUser(String table, String column, String value) {
        boolean exists = false;

        SQLiteDatabase db = userDatabase;


        String query = "Select * from " + table + " where " + column + " = " + value;
        Cursor resultSet = db.rawQuery(query, null);


        if (resultSet.getCount() <= 0) {
            resultSet.close();
        } else {
            exists = true;
        }

        resultSet.close();
        return exists;
    }



     */


}