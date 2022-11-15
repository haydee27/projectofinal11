package com.hb.recetaappfinal.ui.panama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;

public class MainActivityplatofp extends AppCompatActivity {

    Button btnpp1, btnpp2, btnpp3, btnpp4, btnpp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityplatofp);

        btnpp1 = findViewById(R.id.btnpp1);
        btnpp2 = findViewById(R.id.btnpp2);
        btnpp3 = findViewById(R.id.btnpp3);
        btnpp4 = findViewById(R.id.btnpp4);
        btnpp5 = findViewById(R.id.btnpp5);
    }

    public void platop1(View view) {
        Intent btnpp1= new Intent(this, platop1.class);
        startActivity(btnpp1);
    }

    public void platopana2(View view) {
        Intent btnpp2= new Intent(this, platopana2.class);
        startActivity(btnpp2);
    }

    public void platop3(View view) {
        Intent btnpp3= new Intent(this, platop3.class);
        startActivity(btnpp3);
    }

    public void platop4(View view) {
        Intent btnpp4= new Intent(this, platop4.class);
        startActivity(btnpp4);
    }

    public void platop5(View view) {
        Intent btnpp5= new Intent(this, platop5.class);
        startActivity(btnpp5);
    }


};