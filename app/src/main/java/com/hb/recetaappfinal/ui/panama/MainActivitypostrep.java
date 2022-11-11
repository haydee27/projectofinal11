package com.hb.recetaappfinal.ui.panama;

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

public class MainActivitypostrep extends AppCompatActivity {

    Button btnpo1, btnpo2, btnpo3, btnpo4, btnpo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypostrep);

        btnpo1 = findViewById(R.id.btnpo1);
        btnpo2 = findViewById(R.id.btnpo2);
        btnpo3 = findViewById(R.id.btnpo3);
        btnpo4 = findViewById(R.id.btnpo4);
        btnpo5 = findViewById(R.id.btnpo5);
    }

    public void postrep1(View view) {
        Intent btnpo1= new Intent(this, postrep1.class);
        startActivity(btnpo1);
    }

    public void postrep2(View view) {
        Intent btnpo2= new Intent(this, postrep2.class);
        startActivity(btnpo2);
    }

    public void postrep3(View view) {
        Intent btnpo3= new Intent(this, postrep3.class);
        startActivity(btnpo3);
    }

    public void postrep4(View view) {
        Intent btnpo4= new Intent(this, postrep4.class);
        startActivity(btnpo4);
    }

    public void postrep5(View view) {
        Intent btnpo5= new Intent(this, postrep5.class);
        startActivity(btnpo5);
    }


};