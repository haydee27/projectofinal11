package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.nicaragua.bebidan1;
import com.hb.recetaappfinal.ui.nicaragua.bebidan2;
import com.hb.recetaappfinal.ui.nicaragua.bebidan3;
import com.hb.recetaappfinal.ui.nicaragua.bebidan4;
import com.hb.recetaappfinal.ui.sv.bebida1;
import com.hb.recetaappfinal.ui.sv.bebida2;
import com.hb.recetaappfinal.ui.sv.bebida3;
import com.hb.recetaappfinal.ui.sv.bebida4;
import com.hb.recetaappfinal.ui.sv.bebida5;

public class MainActivitymcategorias2 extends AppCompatActivity {

    Button btnb1, btnb2, btnb3, btnb4, btnb5, btnib1, btnib2, btnib3, btnib4, bm1 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymcategorias2);

        btnb1 = findViewById(R.id.btnb1);
        btnb2 = findViewById(R.id.btnb2);
        btnb3 = findViewById(R.id.btnb3);
        btnb4 = findViewById(R.id.btnb4);
        btnb5 = findViewById(R.id.btnb5);
        btnib1 = findViewById(R.id.btnib1);
        btnib2 = findViewById(R.id.btnib2);
        btnib3 = findViewById(R.id.btnib3);
        btnib4 = findViewById(R.id.btnib4);
        bm1 = findViewById(R.id.bm1);
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

    public void subcategoria2 (View view) {
        Intent bm1= new Intent(this, subcategoria2.class);
        startActivity(bm1);
    }


};


