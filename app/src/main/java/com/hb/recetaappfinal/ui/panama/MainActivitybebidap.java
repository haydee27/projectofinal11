package com.hb.recetaappfinal.ui.panama;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.nicaragua.bebidan1;
import com.hb.recetaappfinal.ui.nicaragua.bebidan2;
import com.hb.recetaappfinal.ui.nicaragua.bebidan3;
import com.hb.recetaappfinal.ui.nicaragua.bebidan4;
import com.hb.recetaappfinal.ui.nicaragua.bebidan5;

public class MainActivitybebidap extends AppCompatActivity {

    Button btnpb1, btnpb2, btnpb3, btnpb4, btnpb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitybebidap);

        btnpb1 = findViewById(R.id.btnpb1);
        btnpb2 = findViewById(R.id.btnpb2);
        btnpb3 = findViewById(R.id.btnpb3);
        btnpb4 = findViewById(R.id.btnpb4);
        btnpb5 = findViewById(R.id.btnpb5);
    }

    public void bebidap1(View view) {
        Intent btnpb1= new Intent(this, bebidap1.class);
        startActivity(btnpb1);
    }

    public void bebidap2(View view) {
        Intent btnpb2= new Intent(this, bebidap2.class);
        startActivity(btnpb2);
    }

    public void bebidap3(View view) {
        Intent btnpb3= new Intent(this, bebidap3.class);
        startActivity(btnpb3);
    }

    public void bebidap4(View view) {
        Intent btnpb4= new Intent(this, bebidap4.class);
        startActivity(btnpb4);
    }

    public void bebidap5(View view) {
        Intent btnpb5= new Intent(this, bebidap5.class);
        startActivity(btnpb5);
    }


};


