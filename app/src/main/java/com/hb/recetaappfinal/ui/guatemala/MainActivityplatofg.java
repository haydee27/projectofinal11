package com.hb.recetaappfinal.ui.guatemala;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.nicaragua.platon1;
import com.hb.recetaappfinal.ui.nicaragua.platon2;
import com.hb.recetaappfinal.ui.nicaragua.platon3;
import com.hb.recetaappfinal.ui.nicaragua.platon4;
import com.hb.recetaappfinal.ui.nicaragua.platon5;

public class MainActivityplatofg extends AppCompatActivity {

    Button btngp1, btngp2, btnplatoguate3, btngp4, btngp5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityplatofg);

        btngp1 = findViewById(R.id.btngp1);
        btngp2 = findViewById(R.id.btngp2);
        btnplatoguate3 = findViewById(R.id.btnplatoguate3);
        btngp4 = findViewById(R.id.btngp4);
        btngp5 = findViewById(R.id.btngp5);
    }

    public void platog1(View view) {
        Intent btngp1= new Intent(this, platog1.class);
        startActivity(btngp1);
    }

    public void platog2(View view) {
        Intent btngp2= new Intent(this, platog2.class);
        startActivity(btngp2);
    }

    public void MainActivityplatoguate3(View view) {
        Intent btnplatoguate3= new Intent(this, MainActivityplatoguate3.class);
        startActivity(btnplatoguate3);
    }

    public void platog4(View view) {
        Intent btngp4= new Intent(this, platog4.class);
        startActivity(btngp4);
    }

    public void platog5(View view) {
        Intent btngp5= new Intent(this, platog5.class);
        startActivity(btngp5);
    }


};