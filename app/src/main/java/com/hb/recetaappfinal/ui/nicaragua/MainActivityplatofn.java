package com.hb.recetaappfinal.ui.nicaragua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;

public class MainActivityplatofn extends AppCompatActivity {

    Button btnip1, btnip2, btnip3, btnip4, btnip5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityplatof);

        btnip1 = findViewById(R.id.btnip1);
        btnip2 = findViewById(R.id.btnip2);
        btnip3 = findViewById(R.id.btnip3);
        btnip4 = findViewById(R.id.btnip4);
        btnip5 = findViewById(R.id.btnip5);
    }

    public void platon1(View view) {
        Intent btnip1= new Intent(this, platon1.class);
        startActivity(btnip1);
    }

    public void platon2(View view) {
        Intent btnip2= new Intent(this, platon2.class);
        startActivity(btnip2);
    }

    public void platon3(View view) {
        Intent btnip3= new Intent(this, platon3.class);
        startActivity(btnip3);
    }

    public void platon4(View view) {
        Intent btnip4= new Intent(this, platon4.class);
        startActivity(btnip4);
    }

    public void platon5(View view) {
        Intent btnip5= new Intent(this, platon5.class);
        startActivity(btnip5);
    }


};