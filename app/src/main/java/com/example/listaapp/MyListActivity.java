package com.example.listaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.listaapp.adapters.ContactoAdapter;
import com.example.listaapp.entities.Contacto;

import java.util.ArrayList;
import java.util.List;

public class MyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        //vinculas con el activity _mylist
        RecyclerView rv = findViewById(R.id.rvPalabra);

        rv.setLayoutManager(new LinearLayoutManager( MyListActivity.this )); // esto es obligatorio por defecto

        List<Contacto> contactos = GetContactos();


        ContactoAdapter adapter = new ContactoAdapter(contactos);

        rv.setAdapter(adapter);

    }



    //Crear contactos
    private List<Contacto> GetContactos(){

        List<Contacto> contactos = new ArrayList<>();

            contactos.add(new Contacto("Hola","11111", "direccion", "email"));
            contactos.add(new Contacto("Hola2","222222", "direccion1", "email1"));
            contactos.add(new Contacto("Hola3","33333", "direccion2", "email2"));
            contactos.add(new Contacto("Hola4","44444", "direccion3", "email3"));
            contactos.add(new Contacto("Hola5","55555", "direccion4", "email4"));
            contactos.add(new Contacto("Hola6","666666", "direccion5", "email5"));


            return contactos;
    }

}