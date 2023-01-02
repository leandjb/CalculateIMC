package com.leandjb.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

    @Test()
    void calcularImcNormal(){

        Calc calc = new Calc();
        double imc = calc.calcularIMC(80, 1.80);

        Assertions.assertAll(
                () -> Assertions.assertEquals(24.69, imc, 0.01),
                () -> Assertions.assertTrue(imc > 0)
        );
    }
    @Test
    void calcularImcLeandro(){

        Calc calc = new Calc();
        double imc = calc.calcularIMC(90, 1.64);

        Assertions.assertEquals(33.46, imc, 0.01);
    }
}
