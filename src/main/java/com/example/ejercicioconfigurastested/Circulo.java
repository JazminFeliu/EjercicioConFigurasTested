package com.example.ejercicioconfigurastested;

public class Circulo extends Figura{

    private Double radio;

    public Circulo(Double radio, String color){
        this.radio = radio;
        this.color = color;
    }

    @Override
    public Double getPerimetro(){
        return radio * 3.14 * 2;
    }

    @Override
    public Double getArea(){
        return Math.sqrt(radio*3.14);
    }
}
