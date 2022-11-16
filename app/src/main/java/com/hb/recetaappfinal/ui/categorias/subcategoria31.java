package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.honduras.platoh1;
import com.hb.recetaappfinal.ui.honduras.platoh2;
import com.hb.recetaappfinal.ui.nicaragua.platon1;
import com.hb.recetaappfinal.ui.nicaragua.platon2;
import com.hb.recetaappfinal.ui.nicaragua.platon3;
import com.hb.recetaappfinal.ui.nicaragua.platon4;
import com.hb.recetaappfinal.ui.nicaragua.platon5;
import com.hb.recetaappfinal.ui.sv.plato4;
import com.hb.recetaappfinal.ui.sv.plato5;

public class subcategoria31 extends AppCompatActivity {

    Button btnp4, btnp5, btnip1, btnip2, btnip3, btnip4, btnip5, btnhp1, btnhp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategoria31);

        btnp4 = findViewById(R.id.btnp4);
        btnp5 = findViewById(R.id.btnp5);
        btnip1 = findViewById(R.id.btnip1);
        btnip2 = findViewById(R.id.btnip2);
        btnip3 = findViewById(R.id.btnip3);
        btnip4 = findViewById(R.id.btnip4);
        btnip5 = findViewById(R.id.btnip5);
        btnhp1 = findViewById(R.id.btnhp1);
        btnhp2 = findViewById(R.id.btnhp2);
    }

    public void plato4(View view) {
        Intent btnp4= new Intent(this, plato4.class);
        startActivity(btnp4);
    }

    public void plato5(View view) {
        Intent btnp5= new Intent(this, plato5.class);
        startActivity(btnp5);
    }

    public void platon1(View view) {
        Intent btnip1= new Intent(this, platon1.class);
        startActivity(btnip1);
    }

    public void platon2(View view) {
        Intent btnip2= new Intent(this, platon2.class);
        startActivity(btnip2);
    }

    public void platon3(View view) {
        Intent btnip3= new Intent(this, platon3.class);
        startActivity(btnip3);
    }

    public void platon4(View view) {
        Intent btnip4= new Intent(this, platon4.class);
        startActivity(btnip4);
    }

    public void platon5(View view) {
        Intent btnip5= new Intent(this, platon5.class);
        startActivity(btnip5);
    }
    public void platoh1(View view) {
        Intent btnhp1= new Intent(this, platoh1.class);
        startActivity(btnhp1);
    }

    public void platoh2(View view) {
        Intent btnhp2= new Intent(this, platoh2.class);
        startActivity(btnhp2);
    }
}