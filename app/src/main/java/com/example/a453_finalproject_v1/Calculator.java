package com.example.a453_finalproject_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {

    private EditText numerator, denominator;
    private Button btnAdd, btnSubtract, btnMultiply, btnDivide;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        numerator = findViewById(R.id.edtText_numerator);
        denominator = findViewById(R.id.edtText_denominator);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);
        result = findViewById(R.id.txtView_result);

        btnAdd.setOnClickListener(new View.OnClickListener() { //RESULTS IN ERROR
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"ADDING",Toast.LENGTH_SHORT).show();
                int num = Integer.parseInt(numerator.getText().toString());
                int den = Integer.parseInt(denominator.getText().toString());
                int sum = num + den;
                result.setText(sum);
            }
        });
        btnSubtract.setOnClickListener(new View.OnClickListener() { //RESULTS IN ERROR
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"SUBTRACTING",Toast.LENGTH_SHORT).show();
                int num = Integer.parseInt(numerator.getText().toString());
                int den = Integer.parseInt(denominator.getText().toString());
                int diff = num - den;
                result.setText(diff);
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() { //RESULTS IN ERROR
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"MULTIPLYING",Toast.LENGTH_SHORT).show();
                int num = Integer.parseInt(numerator.getText().toString());
                int den = Integer.parseInt(denominator.getText().toString());
                int prod = num * den;
                result.setText(prod);
            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() { //RESULTS IN ERROR
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"DIVIDING",Toast.LENGTH_SHORT).show();
                int num = Integer.parseInt(numerator.getText().toString());
                int den = Integer.parseInt(denominator.getText().toString());
                int quo = num / den;
                result.setText(quo);
            }
        });

    }
}