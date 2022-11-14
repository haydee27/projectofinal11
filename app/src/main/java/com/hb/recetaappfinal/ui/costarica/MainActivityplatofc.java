package com.hb.recetaappfinal.ui.costarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.panama.platop1;
import com.hb.recetaappfinal.ui.panama.platop2;
import com.hb.recetaappfinal.ui.panama.platop3;
import com.hb.recetaappfinal.ui.panama.platop4;
import com.hb.recetaappfinal.ui.panama.platop5;

public class MainActivityplatofc extends AppCompatActivity {

    Button btncp1, btncp2, btncp3, btncp4, btncp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityplatofc);

        btncp1 = findViewById(R.id.btncp1);
        btncp2 = findViewById(R.id.btncp2);
        btncp3 = findViewById(R.id.btncp3);
        btncp4 = findViewById(R.id.btncp4);
        btncp5 = findViewById(R.id.btncp5);
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


};