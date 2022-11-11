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

    Button btngo1, btngso2, btngo3, btngo4, btngo5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypostreg);

        btngo1 = findViewById(R.id.btngo1);
        btngso2 = findViewById(R.id.btngso2);
        btngo3 = findViewById(R.id.btngo3);
        btngo4 = findViewById(R.id.btngo4);
        btngo5 = findViewById(R.id.btngo5);
    }

    public void postreg1(View view) {
        Intent btngo1= new Intent(this, postreg1.class);
        startActivity(btngo1);
    }

    public void postresg2(View view) {
        Intent btngso2= new Intent(this, postresg2.class);
        startActivity(btngso2);
    }

    public void postreg3(View view) {
        Intent btngo3= new Intent(this, postreg3.class);
        startActivity(btngo3);
    }

    public void postreg4(View view) {
        Intent btngo4= new Intent(this, postreg4.class);
        startActivity(btngo4);
    }

    public void postreg5(View view) {
        Intent btngo5= new Intent(this, postreg5.class);
        startActivity(btngo5);
    }


};