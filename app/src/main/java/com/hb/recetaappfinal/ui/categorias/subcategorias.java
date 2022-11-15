package com.hb.recetaappfinal.ui.categorias;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.guatemala.postreg5;
import com.hb.recetaappfinal.ui.nicaragua.postren2;
import com.hb.recetaappfinal.ui.nicaragua.postren3;
import com.hb.recetaappfinal.ui.panama.postrep1;
import com.hb.recetaappfinal.ui.panama.postrep2;
import com.hb.recetaappfinal.ui.panama.postrep3;
import com.hb.recetaappfinal.ui.panama.postrep4;
import com.hb.recetaappfinal.ui.panama.postrep5;
import com.hb.recetaappfinal.ui.nicaragua.postren1;

public class subcategorias extends AppCompatActivity {

    Button btngo5;
    Button btnpo1, btnpo2, btnpo3, btnpo4, btnpo5;
    Button btnioo1, btnioo2, btnioo3, btnmass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subcategorias);

        btngo5 = findViewById(R.id.btngo5);
        btnpo1 = findViewById(R.id.btnpo1);
        btnpo2 = findViewById(R.id.btnpo2);
        btnpo3 = findViewById(R.id.btnpo3);
        btnpo4 = findViewById(R.id.btnpo4);
        btnpo5 = findViewById(R.id.btnpo5);
        btnioo1 = findViewById(R.id.btnioo1);
        btnioo2 = findViewById(R.id.btnioo2);
        btnioo3 = findViewById(R.id.btnioo3);
        btnmass = findViewById(R.id.button1);

    }

    public void postreg5(View view) {
        Intent btngo5= new Intent(this, postreg5.class);
        startActivity(btngo5);
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

    public void btnmass(View view) {
        Intent btnmass= new Intent(this, subcategoriasp2.class);
        startActivity(btnmass);
    }
}