package com.example.basededatosdeestudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Ingreso_de_Edad extends AppCompatActivity {
    //boton par volver a pantalla anterior
    Button Vuelta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso_de_edad);

        //codigo para ingresar datos de activity
        final EditText eNombre=(EditText) findViewById(R.id.tvNombre);
        final EditText eEdad=(EditText) findViewById(R.id.tvEdad);
        Button bEnviar=(Button) findViewById(R.id.btEnviar);
        //Procedimiento para enviar datos a otra activity
        bEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = eNombre.getText().toString();
                String edad = eEdad.getText() .toString();
                Bundle pasarDatos = new Bundle();
                pasarDatos.putString("pNombre",nombre);
                pasarDatos.putString("pEdad",edad);
                Intent siga = new Intent(Ingreso_de_Edad.this, Vista_de_Datos.class);
                siga.putExtras(pasarDatos);
                startActivity(siga);

            }
        });
        Vuelta=(Button) findViewById(R.id.btvolver);
        Vuelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Vuelta = new Intent(Ingreso_de_Edad.this, MainActivity.class);
                startActivity(Vuelta);
            }
        });
    }
}