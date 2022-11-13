package com.hb.recetaappfinal.ui.costarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.nicaragua.postren1;
import com.hb.recetaappfinal.ui.nicaragua.postren2;
import com.hb.recetaappfinal.ui.nicaragua.postren3;
import com.hb.recetaappfinal.ui.nicaragua.postren4;
import com.hb.recetaappfinal.ui.nicaragua.postren5;

public class MainActivitypostresc extends AppCompatActivity {

    Button btnco1, btnco2, btnco3, btnco4, btnco5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypostresc);

        btnco1 = findViewById(R.id.btnco1);
        btnco2 = findViewById(R.id.btnco2);
        btnco3 = findViewById(R.id.btnco3);
        btnco4 = findViewById(R.id.btnco4);
        btnco5 = findViewById(R.id.btnco5);
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


};