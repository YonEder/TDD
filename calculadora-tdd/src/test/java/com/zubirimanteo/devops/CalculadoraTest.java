package com.zubirimanteo.devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @Test
    void sumaTest() {
        Calculadora calc = new Calculadora();
        int resultado = calc.suma(2, 3);
        assertEquals(5, resultado, "La suma 2 + 3 debería ser 5");
    }

    @Test
    void restaTest() {
        Calculadora calc = new Calculadora();
        int resultado = calc.resta(10, 4);
        assertEquals(6, resultado, "La resta 10 - 4 debería ser 6");
    }

    @Test
    void multiplicacionTest() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicacion(5, 5);
        assertEquals(25, resultado, "La multiplicación 5 * 5 debería ser 25");
    }
}