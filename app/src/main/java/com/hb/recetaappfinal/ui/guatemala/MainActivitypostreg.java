package com.hb.recetaappfinal.ui.guatemala;

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

public class MainActivitypostreg extends AppCompatActivity {

    Button btnio1, btnio2, btnio3, btnio4, btnio5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypostresn);

        btnio1 = findViewById(R.id.btnio1);
        btnio2 = findViewById(R.id.btnio2);
        btnio3 = findViewById(R.id.btnio3);
        btnio4 = findViewById(R.id.btnio4);
        btnio5 = findViewById(R.id.btnio5);
    }

    public void postren1(View view) {
        Intent btnio1= new Intent(this, postren1.class);
        startActivity(btnio1);
    }

    public void postren2(View view) {
        Intent btnio2= new Intent(this, postren2.class);
        startActivity(btnio2);
    }

    public void postren3(View view) {
        Intent btnio3= new Intent(this, postren3.class);
        startActivity(btnio3);
    }

    public void postren4(View view) {
        Intent btnio4= new Intent(this, postren4.class);
        startActivity(btnio4);
    }

    public void postren5(View view) {
        Intent btnio5= new Intent(this, postren5.class);
        startActivity(btnio5);
    }


};