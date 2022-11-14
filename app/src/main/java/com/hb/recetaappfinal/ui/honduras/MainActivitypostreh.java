package com.hb.recetaappfinal.ui.honduras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.panama.postrep1;
import com.hb.recetaappfinal.ui.panama.postrep2;
import com.hb.recetaappfinal.ui.panama.postrep3;
import com.hb.recetaappfinal.ui.panama.postrep4;
import com.hb.recetaappfinal.ui.panama.postrep5;

public class MainActivitypostreh extends AppCompatActivity {

    Button btnho1, btnho2, btnho3, btnho4, btnho5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypostreh);

        btnho1 = findViewById(R.id.btnho1);
        btnho2 = findViewById(R.id.btnho2);
        btnho3 = findViewById(R.id.btnho3);
        btnho4 = findViewById(R.id.btnho4);
        btnho5 = findViewById(R.id.btnho5);
    }

    public void postreh1(View view) {
        Intent btnho1= new Intent(this, postreh1.class);
        startActivity(btnho1);
    }

    public void postreh2(View view) {
        Intent btnho2= new Intent(this, postreh2.class);
        startActivity(btnho2);
    }

    public void postreh3(View view) {
        Intent btnho3= new Intent(this, postreh3.class);
        startActivity(btnho3);
    }

    public void postreh4(View view) {
        Intent btnho4= new Intent(this, postreh4.class);
        startActivity(btnho4);
    }

    public void postreh5(View view) {
        Intent btnho5= new Intent(this, postreh5.class);
        startActivity(btnho5);
    }


};