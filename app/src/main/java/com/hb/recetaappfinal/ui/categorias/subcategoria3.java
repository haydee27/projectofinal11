package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.costarica.platoc1;
import com.hb.recetaappfinal.ui.costarica.platoc2;
import com.hb.recetaappfinal.ui.costarica.platoc3;
import com.hb.recetaappfinal.ui.costarica.platoc4;
import com.hb.recetaappfinal.ui.costarica.platoc5;
import com.hb.recetaappfinal.ui.panama.platop5;
import com.hb.recetaappfinal.ui.sv.plato1;
import com.hb.recetaappfinal.ui.sv.plato2;
import com.hb.recetaappfinal.ui.sv.plato3;

public class subcategoria3 extends AppCompatActivity {

    Button btncp1, btncp2, btncp3, btncp4, btncp5,  btnpp5, b31, btnp1, btnp2, btnp3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategoria3);

        btnpp5 = findViewById(R.id.btnpp5);
        btncp1 = findViewById(R.id.btncp1);
        btncp2 = findViewById(R.id.btncp2);
        btncp3 = findViewById(R.id.btncp3);
        btncp4 = findViewById(R.id.btncp4);
        btncp5 = findViewById(R.id.btncp5);
        b31 = findViewById(R.id.b31);
        btnp1 = findViewById(R.id.btnp1);
        btnp2 = findViewById(R.id.btnp2);
        btnp3 = findViewById(R.id.btnp3);
    }

    public void platop5(View view) {
        Intent btnpp5= new Intent(this, platop5.class);
        startActivity(btnpp5);
    }

    public void platoc1(View view) {
        Intent btnpp1= new Intent(this, platoc1.class);
        startActivity(btnpp1);
    }

    public void platoc2(View view) {
        Intent btncp2= new Intent(this, platoc2.class);
        startActivity(btncp2);
    }

    public void platoc3(View view) {
        Intent btncp3= new Intent(this, platoc3.class);
        startActivity(btncp3);
    }

    public void platoc4(View view) {
        Intent btncp4= new Intent(this, platoc4.class);
        startActivity(btncp4);
    }

    public void platoc5(View view) {
        Intent btncp5= new Intent(this, platoc5.class);
        startActivity(btncp5);
    }

    public void subcategoria31(View view) {
        Intent m31 = new Intent(this, subcategoria31.class);
        startActivity(m31);
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


};