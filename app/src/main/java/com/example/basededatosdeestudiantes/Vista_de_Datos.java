package com.example.basededatosdeestudiantes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vista_de_Datos extends AppCompatActivity {
//variable para determinar edad
    Integer estado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_de_datos);

        TextView Nombre = (TextView)findViewById(R.id.tvNombreReci);
        TextView Edad = (TextView)findViewById(R.id.tvEdadReci);
        TextView Estado = (TextView)findViewById(R.id.tvResultado);
        Button bVolver = (Button)findViewById(R.id.btvolver);

        Bundle datosRecibidos = this.getIntent().getExtras();
        String nombre = datosRecibidos.getString("pNombre");
        String edad = datosRecibidos.getString("pEdad");

        Nombre.setText("Tu nombre es: "+nombre);
        Edad.setText("Tu edad es: "+edad);
//Aquí usa un si o no para determinar si es mayor de edad en pocas palabras lo que hace
// declarar que si es mayor de edad este saldrá en la pantalla eres mayor de edad de
//lo contrario dirá eres menor de edad.
        estado = Integer.parseInt(edad);
        if(estado < 18){
            Estado.setText("Eres menor de edad");
        }else{
            Estado.setText("Eres mayor de edad");
        }
        bVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vuelva = new
                        Intent(Vista_de_Datos.this,Ingreso_de_Edad.class);
                startActivity(vuelva);
            }
        });

    }
}