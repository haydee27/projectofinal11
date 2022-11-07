package com.hb.recetaappfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

public class MainActivitypostres extends AppCompatActivity {

    Button btno1, btno2, btno3, btno4, btno5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activitypostres);

        btno1 = findViewById(R.id.btno1);
        btno2 = findViewById(R.id.btno2);
        btno3 = findViewById(R.id.btno3);
        btno4 = findViewById(R.id.btno4);
        btno5 = findViewById(R.id.btno5);
    }

    public void MainActivity3(View view) {
        Intent btno1= new Intent(this, postre1.class);
        startActivity(btno1);
    }


};