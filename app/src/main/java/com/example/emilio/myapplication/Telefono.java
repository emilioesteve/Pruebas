package com.example.emilio.myapplication;

public class Telefono {

    private String descripcion = "";
    private int numeroTelf = 0;

    public Telefono( String Descripcion, int NumeroTelf ){
        this.descripcion = Descripcion;
        this.numeroTelf = NumeroTelf;
    }

    public int getNumero( ){
        return this.numeroTelf;
    }

    public String getDescripcion( ){
        return this.descripcion;
    }

}
