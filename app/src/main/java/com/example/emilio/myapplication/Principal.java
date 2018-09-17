package com.example.emilio.myapplication;

import java.util.ArrayList;

public class Principal {

    public static void main ( String arg[] ) {

        /* Complejo a = new Complejo( 1 , 2 );
        Complejo b = new Complejo( 3 , 5 );
        Complejo c = new Complejo( 0 , 0 );
        c.suma( a , b );

        System.out.println(c.toString());

        //Creación de array, "array" nombre.
        ArrayList<Integer> array = new ArrayList<Integer>();

        for ( int i = 0; i < 10; i++){
            array.add(i);
        }

        array.remove(2);

        for ( int i = 0; i < array.size(); i++){
            System.out.println( array.get(i) );
        }

        System.out.println("siguiente");

        for ( int x: array){
            System.out.println(x);*/
/*
        Funcion f = new Seno();
        System.out.println(f.calcular(1.0));

        Funcion d = new Logaritmo();
        System.out.println(d.calcular(1.0));

        ArrayList<Funcion>fun = new ArrayList<Funcion>();
        fun.add(new Seno());
        fun.add(new Logaritmo());

        for ( int i = 0; i < fun.size(); i++ ){
            Funcion o = fun.get(i);
            System.out.println(o.calcular(1.0));
        }
*/
        Polinomio u = new Polinomio();
        u.anyadir(5.0);
        double resultat = u.calcular(3.0);
        System.out.println(resultat);

        ArrayList<Persona> personas = new ArrayList<Persona>();

        Persona yo = new Persona("Andres", "Tomas");
        personas.add(yo);

        yo.anyadir(new Telefono("Movil", 645645654));
        yo.anyadir(new Telefono("Trabajo", 962548716));

        Persona p = buscar(personas, "Andres");

        p.mostrarTelefonos();
    }

        public static Persona buscar( ArrayList<Persona> personas, String Nombre ){
            for( int i = 0; i < personas.size(); i++ ){
                if (personas.get(i).getNombre().equals(Nombre)){
                    return personas.get(i);
                }
            }
            return null;
        }


        }


