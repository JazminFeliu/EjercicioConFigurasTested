package com.example.ejercicioconfigurastested;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TrianguloTest {

    @Test
    public void puedeCalcularBienElPerimetroDelTriangulo() {

        //Arrange
        Double lado = 20.5;
        Triangulo triangulo = new Triangulo();
        triangulo.setLado(lado);
        boolean resultado = true;

        //Act
        resultado = (lado + lado + lado == triangulo.getPerimetro());

        //Assert
        assertTrue(resultado);
    }

    @Test
    public void testConstructor() {
        //Test automatico generado con Diffblue
        //Arrange & Act
        Triangulo actualTriangulo = new Triangulo(10.0, "Color");

        //Assert
        assertEquals(50.0, actualTriangulo.getArea().doubleValue());
        assertNull(actualTriangulo.triangulo);
        assertNull(actualTriangulo.cuadrado);
        assertNull(actualTriangulo.circulo);
        assertEquals("Triangulo(lado=10.0)", actualTriangulo.toString());
        assertEquals(30.0, actualTriangulo.getPerimetro().doubleValue());
        assertEquals(10.0, actualTriangulo.getLado().doubleValue());
        assertEquals("Color", actualTriangulo.getColor());
    }

    @Test
    public void testConstructor2() {
        Triangulo actualTriangulo = new Triangulo(10.0, "Color");

        assertEquals(50.0, actualTriangulo.getArea().doubleValue());
        assertNull(actualTriangulo.triangulo);
        assertNull(actualTriangulo.cuadrado);
        assertNull(actualTriangulo.circulo);
        assertEquals("Triangulo(lado=10.0)", actualTriangulo.toString());
        assertEquals(30.0, actualTriangulo.getPerimetro().doubleValue());
        assertEquals(10.0, actualTriangulo.getLado().doubleValue());
        assertEquals("Color", actualTriangulo.getColor());
    }

    @Test
    public void testGetPerimetro() {

        //Arrange  test automatico generado con Diffblue y modificado
        Triangulo triangulo = new Triangulo();
        triangulo.setLado(10.0);

        //Act
        boolean resultado = (triangulo.getLado() * 3 == triangulo.getPerimetro());

        //Assert
        assertEquals(resultado, true);
    }

    @Test
    public void testGetArea() {

        //Arrange & Act test automatico con Diffblue
        Triangulo triangulo = new Triangulo();
        triangulo.setLado(10.0);

        //Assert
        assertEquals(50.0, triangulo.getArea().doubleValue());
    }

    @Test
    public void puedeCalcularBienElAreaDelTriangulo() {
        //Arrange
        Double lado = 25.6;
        Triangulo triangulo = new Triangulo();
        triangulo.setLado(lado);
        boolean resultado = true;

        //Act
        resultado = (((lado * lado) / 2) == triangulo.getArea());

        //Assert
        assertTrue(resultado);

    }
}
