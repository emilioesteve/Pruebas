package com.example.emilio.myapplication;

public class SegundaClase {

    public static void haz_algo (String s) {

        s = s + " " + "adios";
        System.out.println(s);
    }
    public static void main ( String arg[]){

       String a = "Hola";
        haz_algo(a);
        System.out.println( a );

        String b = "Hola";
        for( int i = 0; i < b.length(); i++ ){
            System.out.println(b.charAt(i));
        }

        if ( a == "Hola" ){
            System.out.println("Sí");
        } else {
            System.out.println("No");
        }

        String c = "Adios";
        if ( b.equals(c) ){
            System.out.println("Sí son las dos cadenas iguales");
        } else {
            System.out.println("No son las dos cadenas iguales");
        }

        try{
            for( int i = 0; i < 10; i++ ){
                System.out.println(a.charAt(i));
            }

            System.out.println("Todo OK");

        } catch ( Exception e ){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Esto siempre se hace");
        }

    }
}
