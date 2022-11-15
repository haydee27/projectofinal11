package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.costarica.postrec1;
import com.hb.recetaappfinal.ui.costarica.postrec2;
import com.hb.recetaappfinal.ui.costarica.postrec3;
import com.hb.recetaappfinal.ui.costarica.postrec4;
import com.hb.recetaappfinal.ui.costarica.postrec5;
import com.hb.recetaappfinal.ui.honduras.postreh1;
import com.hb.recetaappfinal.ui.honduras.postreh2;
import com.hb.recetaappfinal.ui.nicaragua.postren4;
import com.hb.recetaappfinal.ui.nicaragua.postren5;

public class subcategoriasp2 extends AppCompatActivity {

    Button btnio4, btnio5, btnco1, btnco2, btnco3, btnco4, btnco5, btnho1, btnho2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategoriasp2);

        btnio4 = findViewById(R.id.btnio4);
        btnio5 = findViewById(R.id.btnio5);
        btnco1 = findViewById(R.id.btnco1);
        btnco2 = findViewById(R.id.btnco2);
        btnco3 = findViewById(R.id.btnco3);
        btnco4 = findViewById(R.id.btnco4);
        btnco5 = findViewById(R.id.btnco5);
        btnho1 = findViewById(R.id.btnhho1);
        btnho2 = findViewById(R.id.btnho2);

    }

    public void postren4(View view) {
        Intent btnio4= new Intent(this, postren4.class);
        startActivity(btnio4);
    }

    public void postren5(View view) {
        Intent btnio5= new Intent(this, postren5.class);
        startActivity(btnio5);
    }

    public void postrec1(View view) {
        Intent btnco1= new Intent(this, postrec1.class);
        startActivity(btnco1);
    }

    public void postrec2(View view) {
        Intent btnco2= new Intent(this, postrec2.class);
        startActivity(btnco2);
    }

    public void postrec3(View view) {
        Intent btnco3= new Intent(this, postrec3.class);
        startActivity(btnco3);
    }

    public void postrec4(View view) {
        Intent btnco4= new Intent(this, postrec4.class);
        startActivity(btnco4);
    }

    public void postrec5(View view) {
        Intent btnco5= new Intent(this, postrec5.class);
        startActivity(btnco5);
    }

    public void postreh1(View view) {
        Intent btnho1= new Intent(this, postreh1.class);
        startActivity(btnho1);
    }

    public void postreh2(View view) {
        Intent btnho2= new Intent(this, postreh2.class);
        startActivity(btnho2);
    }
}