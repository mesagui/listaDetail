package com.example.listaapp.entities;

public class Frutas {

    public int Id;
    public int Codigo;
    public String Nombre;
    public String Vitaminas;
    public String Me_gusta;


    public Frutas(String nombre, String vitaminas) {
        Nombre = nombre;
        Vitaminas = vitaminas;
    }


    public Frutas(String nombre, String vitaminas, String me_gusta) {
        Nombre = nombre;
        Vitaminas = vitaminas;
        Me_gusta = me_gusta;
    }


    public Frutas(int id, int codigo, String nombre, String vitaminas, String me_gusta) {
        Id = id;
        Codigo = codigo;
        Nombre = nombre;
        Vitaminas = vitaminas;
        Me_gusta = me_gusta;
    }
}
