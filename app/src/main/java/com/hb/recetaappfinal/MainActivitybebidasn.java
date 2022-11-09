package com.hb.recetaappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.ui.sv.bebida1;
import com.hb.recetaappfinal.ui.sv.bebida2;
import com.hb.recetaappfinal.ui.sv.bebida3;
import com.hb.recetaappfinal.ui.sv.bebida4;
import com.hb.recetaappfinal.ui.sv.bebida5;

public class MainActivitybebidasn extends AppCompatActivity {

    Button btnib1, btnib2, btnib3, btnib4, btnib5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitybebidas);

        btnib1 = findViewById(R.id.btnib1);
        btnib2 = findViewById(R.id.btnib2);
        btnib3 = findViewById(R.id.btnib3);
        btnib4 = findViewById(R.id.btnib4);
        btnib5 = findViewById(R.id.btnib5);
    }

    public void bebidan1(View view) {
        Intent btnib1= new Intent(this, bebidan1.class);
        startActivity(btnib1);
    }

    public void bebidan2(View view) {
        Intent btnib2= new Intent(this, bebidan2.class);
        startActivity(btnib2);
    }

    public void bebidan3(View view) {
        Intent btnib3= new Intent(this, bebidan3.class);
        startActivity(btnib3);
    }

    public void bebidan4(View view) {
        Intent btnib4= new Intent(this, bebidan4.class);
        startActivity(btnib4);
    }

    public void bebidan5(View view) {
        Intent btnib5= new Intent(this, bebidan5.class);
        startActivity(btnib5);
    }


};


