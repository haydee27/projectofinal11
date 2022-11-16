package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.guatemala.bebidag1;
import com.hb.recetaappfinal.ui.guatemala.bebidag2;
import com.hb.recetaappfinal.ui.guatemala.bebidag3;
import com.hb.recetaappfinal.ui.guatemala.bebidag5;
import com.hb.recetaappfinal.ui.honduras.bebidah1;
import com.hb.recetaappfinal.ui.honduras.bebidah2;
import com.hb.recetaappfinal.ui.honduras.bebidah4;
import com.hb.recetaappfinal.ui.panama.bebidap4;
import com.hb.recetaappfinal.ui.panama.bebidap5;
import com.hb.recetaappfinal.ui.panama.platop1;

public class subactegoria21 extends AppCompatActivity {

    Button btnpb4, btnpb5, btngb1, btngb2, btngb3, btngb5, btnhb1, btnhb2, btnhb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactegoria21);

        btnpb4 = findViewById(R.id.btnpb4);
        btnpb5 = findViewById(R.id.btnpb5);
        btngb1 = findViewById(R.id.btngb1);
        btngb2 = findViewById(R.id.btngb2);
        btngb3 = findViewById(R.id.btngb3);
        btngb5 = findViewById(R.id.btngb5);
        btnhb1 = findViewById(R.id.btnhb1);
        btnhb2 = findViewById(R.id.btnhb2);
        btnhb4 = findViewById(R.id.btnhb4);

    }

    public void bebidap4(View view) {
        Intent btnpb4= new Intent(this, bebidap4.class);
        startActivity(btnpb4);
    }

    public void bebidap5(View view) {
        Intent btnpb5= new Intent(this, bebidap5.class);
        startActivity(btnpb5);
    }

    public void bebidag1(View view) {
        Intent btngb1= new Intent(this, bebidag1.class);
        startActivity(btngb1);
    }

    public void bebidag2(View view) {
        Intent btngb2= new Intent(this, bebidag2.class);
        startActivity(btngb2);
    }

    public void bebidag3(View view) {
        Intent btngb3= new Intent(this, bebidag3.class);
        startActivity(btngb3);
    }

    public void bebidag5(View view) {
        Intent btngb5= new Intent(this, bebidag5.class);
        startActivity(btngb5);
    }

    public void bebidah1(View view) {
        Intent btnhb1= new Intent(this, bebidah1.class);
        startActivity(btnhb1);
    }

    public void bebidah2(View view) {
        Intent btnhb2= new Intent(this, bebidah2.class);
        startActivity(btnhb2);
    }
    public void bebidah4(View view) {
        Intent btnhb4= new Intent(this, bebidah4.class);
        startActivity(btnhb4);
    }



};
