package com.hb.recetaappfinal.ui.guatemala;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;

public class MainActivitypostreg extends AppCompatActivity {

    Button btngo1, btngo2, btngo3, btngo4, btngo5;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypostreg);

        btngo1 = findViewById(R.id.btngo1);
        btngo2 = findViewById(R.id.btngo2);
        btngo3 = findViewById(R.id.btngo3);
        btngo4 = findViewById(R.id.btngo4);
        btngo5 = findViewById(R.id.btngo5);
    }

    public void postreg1(View view) {
        Intent btngo1= new Intent(this, postreg1.class);
        startActivity(btngo1);
    }

    public void postreg2(View view) {
        Intent btngo2= new Intent(this, postreg2.class);
        startActivity(btngo2);
    }

    public void postreg3(View view) {
        Intent btngo3= new Intent(this, postreg3.class);
        startActivity(btngo3);
    }

    public void postreg4(View view) {
        Intent btngo4= new Intent(this, postreg4.class);
        startActivity(btngo4);
    }

    public void postreg5(View view) {
        Intent btngo5= new Intent(this, postreg5.class);
        startActivity(btngo5);
    }


};