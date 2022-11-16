package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.guatemala.MainActivityplatoguate3;
import com.hb.recetaappfinal.ui.guatemala.platog1;
import com.hb.recetaappfinal.ui.guatemala.platog2;
import com.hb.recetaappfinal.ui.guatemala.platog4;
import com.hb.recetaappfinal.ui.guatemala.platog5;
import com.hb.recetaappfinal.ui.panama.platop1;
import com.hb.recetaappfinal.ui.panama.platop3;
import com.hb.recetaappfinal.ui.panama.platop4;
import com.hb.recetaappfinal.ui.panama.platopana2;

public class MainActivitymcategorias3 extends AppCompatActivity {

    Button btngp1, btngp2, btnplatoguate3, btngp4, btngp5, btnpp1, btnpp2, btnpp3, btnpp4, bmc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitymcategorias3);



        btngp1 = findViewById(R.id.btngp1);
        btngp2 = findViewById(R.id.btngp2);
        btnplatoguate3 = findViewById(R.id.btnplatoguate3);
        btngp4 = findViewById(R.id.btngp4);
        btngp5 = findViewById(R.id.btngp5);
        btnpp1 = findViewById(R.id.btnpp1);
        btnpp2 = findViewById(R.id.btnpp2);
        btnpp3 = findViewById(R.id.btnpp3);
        btnpp4 = findViewById(R.id.btnpp4);
    }

    public void platog1(View view) {
        Intent btngp1= new Intent(this, platog1.class);
        startActivity(btngp1);
    }

    public void platog2(View view) {
        Intent btngp2= new Intent(this, platog2.class);
        startActivity(btngp2);
    }

    public void MainActivityplatoguate3(View view) {
        Intent btnplatoguate3= new Intent(this, MainActivityplatoguate3.class);
        startActivity(btnplatoguate3);
    }

    public void platog4(View view) {
        Intent btngp4= new Intent(this, platog4.class);
        startActivity(btngp4);
    }

    public void platog5(View view) {
        Intent btngp5= new Intent(this, platog5.class);
        startActivity(btngp5);
    }

    public void platop1(View view) {
        Intent btnpp1= new Intent(this, platop1.class);
        startActivity(btnpp1);
    }

    public void platopana2(View view) {
        Intent btnpp2= new Intent(this, platopana2.class);
        startActivity(btnpp2);
    }

    public void platop3(View view) {
        Intent btnpp3= new Intent(this, platop3.class);
        startActivity(btnpp3);
    }

    public void platop4(View view) {
        Intent btnpp4= new Intent(this, platop4.class);
        startActivity(btnpp4);
    }

    public void subcategoria3(View view) {
        Intent bmc= new Intent(this, subcategoria3.class);
        startActivity(bmc);
    }

};