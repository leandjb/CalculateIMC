package com.leandjb.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test
    void pruebaCalcularImc(){

        Calc calc = new Calc();
        double imc = calc.calcularIMC(70, 1.8);

        Assertions.assertEquals(21.6, imc, 0.1);
    }
}
