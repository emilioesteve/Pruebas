package com.example.emilio.myapplication;

import java.util.ArrayList;

public class Principal {

    public static void main ( String arg[] ){

        Complejo a = new Complejo( 1 , 2 );
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
            System.out.println(x);
        }


    }

}
