package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.sv.postre1;
import com.hb.recetaappfinal.ui.sv.postre2;
import com.hb.recetaappfinal.ui.sv.postre3;
import com.hb.recetaappfinal.ui.sv.postre4;
import com.hb.recetaappfinal.ui.sv.postre5;

public class MainActivitymcategorias extends AppCompatActivity {

    Button btno1, btno2, btno3, btno4, btno5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymcategorias);

        btno1 = findViewById(R.id.btno1);
        btno2 = findViewById(R.id.btno2);
        btno3 = findViewById(R.id.btno3);
        btno4 = findViewById(R.id.btno4);
        btno5 = findViewById(R.id.btno5);
    }

    public void postre1(View view) {
        Intent btno1= new Intent(this, postre1.class);
        startActivity(btno1);
    }

    public void postre2(View view) {
        Intent btno2= new Intent(this, postre2.class);
        startActivity(btno2);
    }

    public void postre3(View view) {
        Intent btno3= new Intent(this, postre3.class);
        startActivity(btno3);
    }

    public void postre4(View view) {
        Intent btno4= new Intent(this, postre4.class);
        startActivity(btno4);
    }

    public void postre5(View view) {
        Intent btno5= new Intent(this, postre5.class);
        startActivity(btno5);
    }


};