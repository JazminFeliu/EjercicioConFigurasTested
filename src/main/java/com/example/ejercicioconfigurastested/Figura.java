package com.example.ejercicioconfigurastested;

import com.example.ejercicioconfigurastested.Circulo;
import com.example.ejercicioconfigurastested.Cuadrado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public abstract class Figura {


    protected Double perimetro;
    protected Double area;
    protected Cuadrado cuadrado;
    protected Circulo circulo;
    protected Triangulo triangulo;
    protected String color;


    public Figura(){

    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figura{" +
                "perimetro=" + perimetro +
                ", area=" + area +
                ", cuadrado=" + cuadrado +
                ", circulo=" + circulo +
                ", triangulo=" + triangulo +
                ", color='" + color + '\'' +
                '}';
    }
}
