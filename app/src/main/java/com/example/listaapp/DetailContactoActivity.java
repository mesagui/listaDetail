package com.example.listaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailContactoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_contact);

        // llamar metodo
        GetDatosIntent();

    }

    private void GetDatosIntent(){

        String nombre = getIntent().getStringExtra("nombre"); //pasamos las variables creadas en el Contacto adapter
        String numero = getIntent().getStringExtra("numero"); //pasamos las variables creadas en el Contacto adapter


        //traer los id del detail contact xml.
        TextView textViewName = findViewById(R.id.nameContact);
        TextView textViewNumero = findViewById(R.id.numberContact);



        //pasamos los valores de los a las variables creadas del intent del contacto adapter
        textViewName.setText(nombre);
        textViewNumero.setText(numero);




    }






}