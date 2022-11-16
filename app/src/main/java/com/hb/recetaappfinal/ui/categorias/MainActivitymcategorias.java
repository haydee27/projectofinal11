package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.guatemala.postreg1;
import com.hb.recetaappfinal.ui.guatemala.postreg3;
import com.hb.recetaappfinal.ui.guatemala.postreg4;
import com.hb.recetaappfinal.ui.guatemala.postreguate2;
import com.hb.recetaappfinal.ui.sv.postre1;
import com.hb.recetaappfinal.ui.sv.postre2;
import com.hb.recetaappfinal.ui.sv.postre3;
import com.hb.recetaappfinal.ui.sv.postre4;
import com.hb.recetaappfinal.ui.sv.postre5;

public class MainActivitymcategorias extends AppCompatActivity {

    Button btngo1, btnguate2, btngo3, btngo4, btno1, btno2, btno3, btno4, btno5, btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymcategorias);

        btno1 = findViewById(R.id.btno1);
        btno2 = findViewById(R.id.btno2);
        btno3 = findViewById(R.id.btno3);
        btno4 = findViewById(R.id.btno4);
        btno5 = findViewById(R.id.btno5);
        btngo1 = findViewById(R.id.btngo1);
        btnguate2 = findViewById(R.id.btnguate2);
        btngo3 = findViewById(R.id.btngo3);
        btngo4 = findViewById(R.id.btngo4);
        btn = findViewById(R.id.button);


    }
    public void postre1(View view){
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

    public void postreg1(View view) {
        Intent btngo1= new Intent(this, postreg1.class);
        startActivity(btngo1);
    }

    public void postreguate2 (View view){
        Intent btngo2 = new Intent(this, postreguate2.class);
        startActivity(btngo2);
    }

    public void postreg3(View view) {
        Intent btngo3= new Intent(this, postreg3.class);
        startActivity(btngo3);
    }

    public void postreg4(View view) {
        Intent btngo4= new Intent(this, postreg4.class);
        startActivity(btngo4);
    }

    public void btnmas(View view) {
        Intent btn = new Intent(this, subcategorias.class);
        startActivity(btn);
    }
}