package com.example.a453_finalproject_v1;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signup extends AppCompatActivity {

    private TextView title;
    private EditText new_username;
    private EditText new_password;
    private EditText retyped_password;
    private EditText new_email;
    Button btnRegister;

    SQLiteDatabase userDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        title = findViewById(R.id.signupTitle);
        new_username = findViewById(R.id.edtText_signup_username);
        new_password = findViewById(R.id.edtText_signup_password);
        retyped_password = findViewById(R.id.edtText_signup_password2);
        new_email = findViewById(R.id.edtText_email);
        btnRegister = findViewById(R.id.btnRegister);

        userDatabase = openOrCreateDatabase("userDatabase.db", Context.MODE_PRIVATE,null);



        //Button to send the user back to the Login screen
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = new_username.getText().toString();
                String password = new_password.getText().toString();
                String email = new_email.getText().toString();

                DBHelper dbHelper = new DBHelper(getApplicationContext());

                dbHelper.insertUser("galen", "abc123", "gnakama808@gmail.com");
                dbHelper.insertUser("galen2","123abc","gnak808@gmail.com");


                dbHelper.insertUser(username,password,email); //This will add the user to the database


                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });


    }
}