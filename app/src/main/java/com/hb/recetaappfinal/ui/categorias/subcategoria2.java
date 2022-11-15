package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.costarica.bebidac1;
import com.hb.recetaappfinal.ui.costarica.bebidac2;
import com.hb.recetaappfinal.ui.costarica.bebidac3;
import com.hb.recetaappfinal.ui.costarica.bebidac4;
import com.hb.recetaappfinal.ui.costarica.bebidac5;
import com.hb.recetaappfinal.ui.nicaragua.bebidan5;
import com.hb.recetaappfinal.ui.panama.bebidap1;
import com.hb.recetaappfinal.ui.panama.bebidap2;
import com.hb.recetaappfinal.ui.panama.bebidap3;

public class subcategoria2 extends AppCompatActivity {

    Button btnib5, btncb1, btncb2, btncb3, btncb4, btncb5, btnpb1, btnpb2, btnpb3, bm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategoria2);

        btnib5 = findViewById(R.id.btnib5);
        btncb1 = findViewById(R.id.btncb1);
        btncb2 = findViewById(R.id.btncb2);
        btncb3 = findViewById(R.id.btncb3);
        btncb4 = findViewById(R.id.btncb4);
        btncb5 = findViewById(R.id.btncb5);
        btnpb1 = findViewById(R.id.btnpb1);
        btnpb2 = findViewById(R.id.btnpb2);
        btnpb3 = findViewById(R.id.btnpb3);
        bm2 = findViewById(R.id.bm2);
    }

    public void bebidan5(View view) {
        Intent btnib5= new Intent(this, bebidan5.class);
        startActivity(btnib5);
    }

    public void bebidac1(View view) {
        Intent btncb1= new Intent(this, bebidac1.class);
        startActivity(btncb1);
    }

    public void bebidac2(View view) {
        Intent btncb2= new Intent(this, bebidac2.class);
        startActivity(btncb2);
    }

    public void bebidac3(View view) {
        Intent btncb3= new Intent(this, bebidac3.class);
        startActivity(btncb3);
    }

    public void bebidac4(View view) {
        Intent btncb4= new Intent(this, bebidac4.class);
        startActivity(btncb4);
    }

    public void bebidac5(View view) {
        Intent btncb5= new Intent(this, bebidac5.class);
        startActivity(btncb5);
    }
    public void bebidap1(View view) {
        Intent btnpb1= new Intent(this, bebidap1.class);
        startActivity(btnpb1);
    }

    public void bebidap2(View view) {
        Intent btnpb2= new Intent(this, bebidap2.class);
        startActivity(btnpb2);
    }

    public void bebidap3(View view) {
        Intent btnpb3= new Intent(this, bebidap3.class);
        startActivity(btnpb3);
    }

    public void subactegoria21 (View view) {
        Intent bm2= new Intent(this, subactegoria21.class);
        startActivity(bm2);
    }



};

