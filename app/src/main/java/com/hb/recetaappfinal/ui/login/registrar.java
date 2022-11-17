package com.hb.recetaappfinal.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.hb.recetaappfinal.MySingleton;
import com.hb.recetaappfinal.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class registrar extends AppCompatActivity {

   // private EditText nombre, apellido, correo, user, clave;
   // private TextView fecha_registro;
    // private Button btnRegistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        //nombre = (EditText) findViewById(R.id.nombre);
        //apellido = (EditText) findViewById(R.id.apellidos);
        // correo = (EditText) findViewById(R.id.correo);
        // user = (EditText) findViewById(R.id.edt_usuario);
        //clave = (EditText) findViewById(R.id.contraseñau);
        //btnRegistrar =  (Button) findViewById(R.id.btn_registrar);
        //fecha_registro = (TextView) findViewById(R.id.tv_fechaRegistro);
        //fecha_registro.setText(timedate());

        //btnRegistrar.setOnClickListener(new View.OnClickListener() {
        // @Override
        //public void onClick(View view) {
                //Toast.makeText(getContext(), "Clic en botón Guardar", Toast.LENGTH_SHORT).show();
                //recibirJson(getContext());
        // String nombreUser = nombre.getText().toString();
        //   String apellUser = apellido.getText().toString();
        //String emailUser = correo.getText().toString();
                String usuario = user.getText().toString();
                String claveU = clave.getText().toString();

                String dato = "";

               /*  if(nombreUser.length()==0) {
                    nombre.setError("Campo obligatorio");
                }else if(apellUser.length()==0){
                    apellido.setError("Campo obligatorio");
                }else if(emailUser.length()==0){
                    correo.setError("Campo obligatorio");
                }else if(usuario.length()==0){
                    user.setError("Campo obligatorio");
                }else if(claveU.length()==0){
                    clave.setError("Campo obligatorio");
                }else{
                    guardarUser(registrar.this, Integer.parseInt(iduser), nombreUser, apellUser, emailUser, usuario, claveU);
                }
            }
        });

    }/*

    private String timedate() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String fecha = sdf.format(cal.getTime());
        return fecha;
    }
    private void guardarUser(final Context context, final int id_user, final String nombreUser,
                             final String apellUser, final String emailUser, final String usuario,
                             final String claveU, final String pregunta, final String respuestaU, final int tipo, final int estado) {
        //  String url = "https://abithaaareyes.000webhostapp.com/ws/guardar_usuario.php";
        //String url = "http://localhost/service/guardar_categorias.php";
        //  StringRequest request = new StringRequest(Request.Method.POST,url, new Response.Listener<String>() {
//     @Override
        //     public void onResponse(String response) {
        //        JSONObject requestJSON = null;
                try {
                    requestJSON = new JSONObject(response.toString());
                    String estado = requestJSON.getString("estado");
                    String mensaje = requestJSON.getString("mensaje");
                    if(estado.equals("1")){
                        Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(context, "Registro almacenado en MySQL.", Toast.LENGTH_SHORT).show();
                    }else if(estado.equals("2")){
                        Toast.makeText(context, ""+mensaje, Toast.LENGTH_SHORT).show();
        //          }
        //      } catch (JSONException e) {
        //          e.printStackTrace();
        //      }
        //   }
//  }, new Response.ErrorListener() {
//      @Override
        //  //     public void onErrorResponse(VolleyError volleyError) {
                Toast.makeText(context, "No se puedo guardar. \n" +"Intentelo más tarde.", Toast.LENGTH_SHORT).show();
            }
        }) {
        // protected Map<String, String> getParams() throws AuthFailureError {
        //     //En este método se colocan o se setean los valores a recibir por el fichero *.php
        //    Map<String, String> map = new HashMap<>();
        //  map.put("Content-Type", "application/json; charset=utf-8");
        //  map.put("Accept", "application/json");
        // map.put("id_usuario", String.valueOf(id_user));
                map.put("nom_usuario", nombreUser);
                map.put("apellido_usuarios", apellUser);
                map.put("correo", emailUser);
        //       map.put("usuario", usuario);
        //      map.put("clave", claveU);
        //      map.put("tipo", String.valueOf(tipo));
        //       map.put("estado", String.valueOf(estado));
        // map.put("pregunta", String.valueOf(pregunta));
        //   map.put("respuesta", respuestaU);
        //   return map;
        //   }
        //   };
        //   MySingleton.getInstance(context).addToRequestQueue(request);
        // }//

//}*/





