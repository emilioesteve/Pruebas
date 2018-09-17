package com.example.emilio.myapplication;

import java.util.ArrayList;

public class Persona {

    private String nombre = "";
    private String apellido = "";

    private ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

    public Persona ( String Nombre, String Apellido ){
        this.nombre = Nombre;
        this.apellido = Apellido;
    }

    public void anyadir( Telefono a ){
        telefonos.add( a );
    }

    public void mostrarTelefonos( ){
        for( int i = 0; i < telefonos.size(); i++ ){
            System.out.println(telefonos.get(i).getDescripcion());
            System.out.println(telefonos.get(i).getNumero());
        }
    }

    public String getNombre(){
        return this.nombre;
    }

}
