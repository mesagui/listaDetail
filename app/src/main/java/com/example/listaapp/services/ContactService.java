package com.example.listaapp.services;

import com.example.listaapp.entities.Contacto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ContactService {

    @GET("v3/75ffb958-8692-436f-bdec-31248e1f2946")
    Call<List<Contacto>> getAll();


    @GET("92b6ef79-eaeb-4df3-a847-2084519129fe")
    Call<Void> testGet(@Query("name") String name, @Query("lastname") String lastname);


    @POST("92b6ef79-eaeb-4df3-a847-2084519129fe")
    Call<Void> testPOST(@Body Contacto contacto);

}
