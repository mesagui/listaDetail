package com.example.listaapp.entities;

public class Contacto {

    public String Nombre;
    public String Numero;
    public String Direccion;
    public String Email;

    public Contacto(String nombre, String numero, String direccion, String email) {
        this.Nombre = nombre;
        this.Numero = numero;
        this.Direccion = direccion;
        this.Email = email;
    }

    public Contacto(String nombre, String numero) {
        this.Nombre = nombre;
        this.Numero = numero;
    }
}
