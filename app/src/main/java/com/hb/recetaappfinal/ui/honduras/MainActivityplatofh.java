package com.hb.recetaappfinal.ui.honduras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.sv.plato1;
import com.hb.recetaappfinal.ui.sv.plato2;
import com.hb.recetaappfinal.ui.sv.plato3;
import com.hb.recetaappfinal.ui.sv.plato4;
import com.hb.recetaappfinal.ui.sv.plato5;

public class MainActivityplatofh extends AppCompatActivity {


    Button btnhp1, btnhp2, btnhp3, btnhp4, btnhp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityplatofh);

        btnhp1 = findViewById(R.id.btnhp1);
        btnhp2 = findViewById(R.id.btnhp2);
        btnhp3 = findViewById(R.id.btnhp3);
        btnhp4 = findViewById(R.id.btnhp4);
        btnhp5 = findViewById(R.id.btnhp5);
    }

    public void platoh1(View view) {
        Intent btnhp1= new Intent(this, platoh1.class);
        startActivity(btnhp1);
    }

    public void platoh2(View view) {
        Intent btnhp2= new Intent(this, platoh2.class);
        startActivity(btnhp2);
    }

    public void platoh3(View view) {
        Intent btnhp3= new Intent(this, platoh3.class);
        startActivity(btnhp3);
    }

    public void platoh4(View view) {
        Intent btnhp4= new Intent(this, platoh4.class);
        startActivity(btnhp4);
    }

    public void platoh5(View view) {
        Intent btnhp5= new Intent(this, platoh5.class);
        startActivity(btnhp5);
    }


};