package com.example.ejercicioconfigurastested;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CuadradoTest {

    @Test
    public void puedeCalcularBienElPerimetroDelCuadrado(){

        //Arrange
        Double lado = 15.0;
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(lado);
        boolean resultado = true;

        //Act

        resultado = (lado*4 == cuadrado.getPerimetro());

        //Assert
        assertEquals(true,resultado);

    }

    @Test
    public void puedeCalcularBienElAreaDelCuadrado(){

        //Arrange
        Double lado = 18.5;
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(lado);
        boolean resultado = true;

        //Act
        resultado = (lado*lado == cuadrado.getArea());

        //Assert
        assertTrue(resultado);
    }
}
