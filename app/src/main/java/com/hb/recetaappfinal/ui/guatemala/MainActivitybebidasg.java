package com.hb.recetaappfinal.ui.guatemala;

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

public class MainActivitybebidasg extends AppCompatActivity {

    Button btngb1, btngb2, btngb3, btngb4, btngb5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitybebidasg);

        btngb1 = findViewById(R.id.btngb1);
        btngb2 = findViewById(R.id.btngb2);
        btngb3 = findViewById(R.id.btngb3);
        btngb4 = findViewById(R.id.btngb4);
        btngb5 = findViewById(R.id.btngb5);
    }

    public void bebidag1(View view) {
        Intent btngb1= new Intent(this, bebidag1.class);
        startActivity(btngb1);
    }

    public void bebidag2(View view) {
        Intent btngb2= new Intent(this, bebidag2.class);
        startActivity(btngb2);
    }

    public void bebidag3(View view) {
        Intent btngb3= new Intent(this, bebidag3.class);
        startActivity(btngb3);
    }

    public void bebidag4(View view) {
        Intent btngb4= new Intent(this, bebidag4.class);
        startActivity(btngb4);
    }

    public void bebidag5(View view) {
        Intent btngb5= new Intent(this, bebidag5.class);
        startActivity(btngb5);
    }


};


