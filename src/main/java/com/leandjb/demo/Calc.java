package com.leandjb.demo;

public class Calc {

    public double calcularIMC (double peso_kg, double altura_m){

        double imc = peso_kg/(altura_m * altura_m);

        return imc;
    }

    public double convertirMetrosACentimetros (double valorEnMetros){

       double valorEnCentimetros = valorEnMetros * 100;

        return valorEnCentimetros;
    }

    public double convertirCentimetrosAMetros (double valorEnCentimetros){

        double valorEnMetros = valorEnCentimetros/100;

        return valorEnMetros;
    }
}
