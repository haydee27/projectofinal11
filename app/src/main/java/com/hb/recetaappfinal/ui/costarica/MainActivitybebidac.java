package com.hb.recetaappfinal.ui.costarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.sv.bebida1;
import com.hb.recetaappfinal.ui.sv.bebida2;
import com.hb.recetaappfinal.ui.sv.bebida3;
import com.hb.recetaappfinal.ui.sv.bebida4;
import com.hb.recetaappfinal.ui.sv.bebida5;

public class MainActivitybebidac extends AppCompatActivity {

    Button btncb1, btncb2, btncb3, btncb4, btncb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitybebidac);

        btncb1 = findViewById(R.id.btncb1);
        btncb2 = findViewById(R.id.btncb2);
        btncb3 = findViewById(R.id.btncb3);
        btncb4 = findViewById(R.id.btncb4);
        btncb5 = findViewById(R.id.btncb5);
    }

    public void bebidac1(View view) {
        Intent btncb1= new Intent(this, bebidac1.class);
        startActivity(btncb1);
    }

    public void bebidac2(View view) {
        Intent btncb2= new Intent(this, bebidac2.class);
        startActivity(btncb2);
    }

    public void bebidac3(View view) {
        Intent btncb3= new Intent(this, bebidac3.class);
        startActivity(btncb3);
    }

    public void bebidac4(View view) {
        Intent btncb4= new Intent(this, bebidac4.class);
        startActivity(btncb4);
    }

    public void bebidac5(View view) {
        Intent btncb5= new Intent(this, bebidac5.class);
        startActivity(btncb5);
    }


};




