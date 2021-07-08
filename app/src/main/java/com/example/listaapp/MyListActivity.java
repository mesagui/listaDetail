package com.example.listaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;


import com.example.listaapp.adapters.ContactoAdapter;
import com.example.listaapp.entities.Contacto;
import com.example.listaapp.services.ContactService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        Retrofit retrofit = new Retrofit.Builder()
                //.baseUrl("https://run.mocky.io/")
                .baseUrl("https://webhook.site/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();



        ContactService service = retrofit.create(ContactService.class);//

        //Call<Void> contactCall = service.testGet("Mike", "sdsd");//llamada asyncronada

        Contacto contacto = new Contacto("Mike","4444");

        Call<Void> contactCall = service.testPOST(contacto);

        contactCall.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                //esperar a la respuesta

                Log.i("MAIN_APP", String.valueOf(response.code()));


            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                //
            }
        });

        List<Contacto> contactos = GetContactos();

        //vinculas con el activity _mylist
        RecyclerView rv = findViewById(R.id.rvPalabra);
        rv.setLayoutManager(new LinearLayoutManager( MyListActivity.this )); // esto es obligatorio por defecto

        ContactoAdapter adapter = new ContactoAdapter(contactos);
        rv.setAdapter(adapter);


    }

    //Crear contactos
    private List<Contacto> GetContactos(){

        List<Contacto> contactos = new ArrayList<>();

            contactos.add(new Contacto("Hola","1111111"));
            contactos.add(new Contacto("Hola2","222222"));
            contactos.add(new Contacto("Hola3","333333"));
            contactos.add(new Contacto("Hola4","444444"));
            contactos.add(new Contacto("Hola6","666666"));
            contactos.add(new Contacto("Hola5","555555"));

            return contactos;
    }

}