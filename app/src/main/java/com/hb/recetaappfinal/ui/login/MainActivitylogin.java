package com.hb.recetaappfinal.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.hb.recetaappfinal.MainActivity;
import com.hb.recetaappfinal.R;
import com.hb.recetaappfinal.ui.conexion.dto_registros;

public class MainActivitylogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylogin);
    }
    /*private Button btn_log;
    private EditText usuario, contraseña;
    private dto_registros usuario1= new dto_registros();
    private Switch mantener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylogin);

        btn_log = findViewById(R.id.btn_log);
        usuario = findViewById(R.id.etuser);
        contraseña = findViewById(R.id.etclave);
        btn_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usua = usuario.getText().toString();
                String contra = contraseña.getText().toString();

                if(usua.length()== 0){
                    usuario.setError("Campo Obligatorio");
                }else if(contra.length()== 0){
                    contraseña.setError("Campo obligatorio");
                } else{
                    if(usua.contains("@")){
                        usuario1.setCorreo(usua);
                    }else{
                        usuario1.setUsuario(usua);
                    }
                    usuario1.setContraseña(contra);

                    login(MainActivitylogin.this, usuario1, mantener);
                    dto_registros usuar = new dto_registros();
                    SharedPreferences sp = getSharedPreferences("usuario", Context.MODE_PRIVATE);
                    String estado = sp.getString("estado", "");
                    if(estado.equals("login")){
                        if(sp.contains("id")){
                            String id = sp.getString("id", "");
                            usuar.setId(Integer.parseInt(id));
                            if(usuar.getId() > 0){
                                Toast.makeText(MainActivitylogin.this, "Su id es: " + usuar.getId(), Toast.LENGTH_SHORT).show();
                            }
                        }
                        Intent nueva = new Intent(MainActivitylogin.this, MainActivity.class);
                        startActivity(nueva);

                    }
                }
            }
        });
    }

    public void Onclick(View view) {
        Intent miIntent = null;
        switch (view.getId()) {
            case R.id.btn_registrar:
                miIntent = new Intent(MainActivitylogin.this, registrar.class);
                break;
            case R.id.btn_log:
                miIntent = new Intent(MainActivitylogin.this, MainActivitylogin.class);
                final ProgressDialog progressDialog = new ProgressDialog(this);
                progressDialog.setMessage("Por favor espera...");
                progressDialog.show();
                break;
        }
        if(miIntent!=null){
            startActivity(miIntent);
        }
    }
    private void login(MainActivitylogin mainActivitylogin, dto_registros usuario1, Switch mantener) {
    }*/
}