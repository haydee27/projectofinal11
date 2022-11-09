package com.hb.recetaappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.ui.sv.bebida1;
import com.hb.recetaappfinal.ui.sv.bebida2;
import com.hb.recetaappfinal.ui.sv.bebida3;

public class MainActivitybebidas extends AppCompatActivity {
    Button btnb1, btnb2, btnb3, btnb4, btnb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitybebidas);

        btnb1 = findViewById(R.id.btnb1);
        btnb2 = findViewById(R.id.btnb2);
        btnb3 = findViewById(R.id.btnb3);
        btnb4 = findViewById(R.id.btnb4);
        btnb5 = findViewById(R.id.btnb5);
    }

    public void bebida1(View view) {
        Intent btnb1= new Intent(this, bebida1.class);
        startActivity(btnb1);
    }

    public void bebida2(View view) {
        Intent btnb2= new Intent(this, bebida2.class);
        startActivity(btnb2);
    }

    public void bebida3(View view) {
        Intent btnb3= new Intent(this, bebida3.class);
        startActivity(btnb3);
    }

    public void bebida4(View view) {
        Intent btnb4= new Intent(this, bebida4.class);
        startActivity(btnb4);
    }

    public void bebida5(View view) {
        Intent btnb5= new Intent(this, bebida5.class);
        startActivity(btnb5);
    }


};


