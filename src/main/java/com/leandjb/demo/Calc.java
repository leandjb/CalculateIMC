package com.leandjb.demo;

public class Calc {

    public double calcularIMC (double pesoKg, double alturaMetros){

        double imc = pesoKg/(alturaMetros * alturaMetros);

        return imc;
    }
}
