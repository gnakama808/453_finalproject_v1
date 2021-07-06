package com.example.a453_finalproject_v1;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Setting extends AppCompatActivity {

    private TextView savings_annual, savings_daily, income_annual, income_daily, income_desired;
    Button btnReports, btnList, btnCalculator;

    SQLiteDatabase userDatabase, moneyDatabase; //Should just combine money and user databases together
    DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        savings_annual = findViewById(R.id.txtView_saving_annual);
        savings_daily = findViewById(R.id.txtView_saving_daily);
        income_annual = findViewById(R.id.txtView_annual);
        income_daily = findViewById(R.id.txtView_daily);
        income_desired = findViewById(R.id.txtView_desired);
        btnReports = findViewById(R.id.btnReport);
        btnList = findViewById(R.id.btnList);
        btnCalculator = findViewById(R.id.btnCalculator);

        userDatabase = openOrCreateDatabase("userDatabase.db", Context.MODE_PRIVATE,null);
        dbHelper = new DBHelper(getApplicationContext());


        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Go to the list of expenses activity
                Toast.makeText(getApplicationContext(),"List of Expenses",Toast.LENGTH_SHORT).show();
            }
        });
        btnReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Go to the reports activity
                Toast.makeText(getApplicationContext(),"Expense Reports",Toast.LENGTH_SHORT).show();
            }
        });
        btnCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Go to the calculator activity
                Toast.makeText(getApplicationContext(),"Calculator",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),Calculator.class);
                startActivity(intent);
            }
        });

    }

}