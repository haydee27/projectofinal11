package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.panama.bebidap4;
import com.hb.recetaappfinal.ui.panama.bebidap5;

public class subactegoria21 extends AppCompatActivity {

    Button btnpb4, btnpb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subactegoria21);

        btnpb4 = findViewById(R.id.btnpb4);
        btnpb5 = findViewById(R.id.btnpb5);
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
