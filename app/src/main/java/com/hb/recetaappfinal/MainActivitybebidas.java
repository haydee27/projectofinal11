package com.hb.recetaappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivitybebidas extends AppCompatActivity {
    Button btnb1, btnb2, btnb3, btnb4, btnb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypostres);

        btnb1 = findViewById(R.id.btnb1);
        btnb2 = findViewById(R.id.btnb2);
        btnb3 = findViewById(R.id.btnb3);
        btnb4 = findViewById(R.id.btnb4);
        btnb5 = findViewById(R.id.btnb5);
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
}

