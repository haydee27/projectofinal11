package com.hb.recetaappfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


public class MainActivityplatof extends AppCompatActivity {

    Button btnp1, btnp2, btnp3, btnp4, btnp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypostres);

        btnp1 = findViewById(R.id.btnp1);
        btnp2 = findViewById(R.id.btnp2);
        btnp3 = findViewById(R.id.btnp3);
        btnp4 = findViewById(R.id.btnp4);
        btnp5 = findViewById(R.id.btnp5);
    }

    public void plato1(View view) {
        Intent btnp1= new Intent(this, plato1.class);
        startActivity(btnp1);
    }

    public void plato2(View view) {
        Intent btnp2= new Intent(this, plato2.class);
        startActivity(btnp2);
    }

    public void plato3(View view) {
        Intent btnp3= new Intent(this, plato3.class);
        startActivity(btnp3);
    }

    public void plato4(View view) {
        Intent btnp4= new Intent(this, plato4.class);
        startActivity(btnp4);
    }

    public void plato5(View view) {
        Intent btnp5= new Intent(this, plato5.class);
        startActivity(btnp5);
    }


};