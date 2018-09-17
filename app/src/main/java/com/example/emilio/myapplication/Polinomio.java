package com.example.emilio.myapplication;

import java.util.ArrayList;

public class Polinomio implements Funcion{

    ArrayList<Double> coeficientes;

    public Polinomio(){

        coeficientes = new ArrayList<Double>();

    }

    public void anyadir ( double x ){
        this.coeficientes.add(x);
    }

    public double calcular( double x ){
        String res = "";
        double resu = 0;
        for( int i = 0; i < this.coeficientes.size(); i++ ) {
            res = res + "x^" + i + " * " + this.coeficientes.get(i);
            resu = resu + Math.pow(x, i) * this.coeficientes.get(i);
        }
        System.out.println(res);
        return resu;
    }

}
