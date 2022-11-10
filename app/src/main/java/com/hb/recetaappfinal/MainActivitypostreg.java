package com.hb.recetaappfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.ui.guatemala.postreg1;
import com.hb.recetaappfinal.ui.guatemala.postreg2;
import com.hb.recetaappfinal.ui.guatemala.postreg3;
import com.hb.recetaappfinal.ui.guatemala.postreg4;
import com.hb.recetaappfinal.ui.guatemala.postreg5;


public class MainActivitypostreg extends AppCompatActivity {


        Button btngo1, btngo2, btngo3, btngo4, btngo5;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_activitypostreg);

            btngo1 = findViewById(R.id.btngo1);
            btngo2 = findViewById(R.id.btngo2);
            btngo3 = findViewById(R.id.btngo3);
            btngo4 = findViewById(R.id.btngo4);
            btngo5 = findViewById(R.id.btngo5);
        }

        public void postren1(View view) {
            Intent btngo1= new Intent(this, postreg1.class);
            startActivity(btngo1);
        }

        public void postren2(View view) {
            Intent btngo2= new Intent(this, postreg2.class);
            startActivity(btngo2);
        }

        public void postren3(View view) {
            Intent btngo3= new Intent(this, postreg3.class);
            startActivity(btngo3);
        }

        public void postren4(View view) {
            Intent btngo4= new Intent(this, postreg4.class);
            startActivity(btngo4);
        }

        public void postren5(View view) {
            Intent btngo5= new Intent(this, postreg5.class);
            startActivity(btngo5);
        }


    };