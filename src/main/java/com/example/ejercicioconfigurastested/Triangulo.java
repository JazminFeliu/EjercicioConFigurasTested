package com.example.ejercicioconfigurastested;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Triangulo extends Figura{

    private Double lado;

    public Triangulo(Double lado, String color){
        this.lado = lado;
        this.color = color;
    }

    @Override
    public Double getPerimetro(){
        return lado+lado+lado;
    }

    @Override
    public Double getArea(){
        return (lado*lado)/2;
    }
}
