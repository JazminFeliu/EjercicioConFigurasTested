package com.example.ejercicioconfigurastested;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cuadrado extends Figura {


    private Double lado;

    public Cuadrado(Double lado, String color){
        this.lado = lado;
        this.color = color;
    }

    @Override
    public Double getPerimetro() {
        return lado * 4;
    }

    @Override
    public Double getArea() {
        return lado * lado;
    }
}
