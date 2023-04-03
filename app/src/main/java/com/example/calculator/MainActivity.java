package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,
            btnzero,btnadd,btnsubstract,btndivide,
            btnmultiply,btnequal,btnclear;

    TextView tvcontrol,tvresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnzero = findViewById(R.id.btn_zero);
        btnone = findViewById(R.id.btn_1);
        btntwo = findViewById(R.id.btn_2);
        btnthree = findViewById(R.id.btn_3);
        btnfour = findViewById(R.id.btn_4);
        btnfive = findViewById(R.id.btn_5);
        btnsix = findViewById(R.id.btn_6);
        btnseven = findViewById(R.id.btn_7);
        btneight = findViewById(R.id.btn_8);
        btnnine = findViewById(R.id.btn_9);
        btnadd = findViewById(R.id.btn_add);
        btnsubstract = findViewById(R.id.btn_substract);
        btnmultiply = findViewById(R.id.btn_multiply);
        btndivide = findViewById(R.id.btn_divide);
        btnequal = findViewById(R.id.btn_equal);
        btnclear = findViewById(R.id.btn_clear);

        tvcontrol = findViewById(R.id.tv_control);
        tvresult = findViewById(R.id.tv_result);
    }
}