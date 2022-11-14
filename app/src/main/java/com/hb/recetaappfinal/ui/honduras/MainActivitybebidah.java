package com.hb.recetaappfinal.ui.honduras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.panama.bebidap1;
import com.hb.recetaappfinal.ui.panama.bebidap2;
import com.hb.recetaappfinal.ui.panama.bebidap3;
import com.hb.recetaappfinal.ui.panama.bebidap4;
import com.hb.recetaappfinal.ui.panama.bebidap5;

public class MainActivitybebidah extends AppCompatActivity {

    Button btnhb1, btnhb2, btnhb3, btnhb4, btnhb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitybebidah);

        btnhb1 = findViewById(R.id.btnhb1);
        btnhb2 = findViewById(R.id.btnhb2);
        btnhb3 = findViewById(R.id.btnhb3);
        btnhb4 = findViewById(R.id.btnhb4);
        btnhb5 = findViewById(R.id.btnhb5);
    }

    public void bebidah1(View view) {
        Intent btnhb1= new Intent(this, bebidah1.class);
        startActivity(btnhb1);
    }

    public void bebidah2(View view) {
        Intent btnhb2= new Intent(this, bebidah2.class);
        startActivity(btnhb2);
    }

    public void bebidah3(View view) {
        Intent btnhb3= new Intent(this, bebidah3.class);
        startActivity(btnhb3);
    }

    public void bebidah4(View view) {
        Intent btnhb4= new Intent(this, bebidah4.class);
        startActivity(btnhb4);
    }

    public void bebidah5(View view) {
        Intent btnhb5= new Intent(this, bebidah5.class);
        startActivity(btnhb5);
    }


};


