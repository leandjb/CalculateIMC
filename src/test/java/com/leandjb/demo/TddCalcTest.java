package com.leandjb.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TddCalcTest {

    @Test
    public void calcularCentimetros(){

        double Altura = 1.75;

        double cm = new Calc().convertirMetrosACentimetros(Altura);

        Assertions.assertEquals(175,cm,0.01);
    }

    @Test
    public void calcularMetros(){

        double Altura = 175;

        double m = new Calc().convertirCentimetrosAMetros(Altura);

        Assertions.assertEquals(1.75,m,0.01);
    }
    @Test
    public void calcularImcTdd(){

        //Given
        double altura = 175;
        double peso = 72;

        //When
        double alturaCm = new Calc().convertirCentimetrosAMetros(altura);
        double imc = new Calc().calcularIMC(peso,alturaCm);

        //Then
        Assertions.assertEquals(23.51,imc,0.01);
    }
}
