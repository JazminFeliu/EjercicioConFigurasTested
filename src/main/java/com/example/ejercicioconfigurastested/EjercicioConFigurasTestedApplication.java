package com.example.ejercicioconfigurastested;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.Console;
import java.util.Scanner;

@SpringBootApplication
public class EjercicioConFigurasTestedApplication {


    public static void main(String[] args) {

       // SpringApplication.run(EjercicioConFigurasTestedApplication.class, args);


        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al juego de las Figuras!");
        System.out.print("Ingrese el diametro de un lado: ");

        Double lado = sc.nextDouble();

        sc.nextLine();
        System.out.print("Ingrese un color: ");
        String color = sc.nextLine();

        Cuadrado cua = new Cuadrado(lado, color);
        Triangulo tri = new Triangulo(lado, color);
        Circulo cir = new Circulo(lado, color);

        System.out.println("El perimetro del "+cua.getClass().getSimpleName()+" "+color+" es: "+cua.getPerimetro());
        System.out.println("El área del "+cua.getClass().getSimpleName()+" es: "+cua.getArea());
        System.out.println();
        System.out.println("El perimetro del "+tri.getClass().getSimpleName()+" "+color+" es: "+tri.getPerimetro());
        System.out.println("El área del "+tri.getClass().getSimpleName()+" es: "+tri.getArea());
        System.out.println();
        System.out.println("El perimetro del "+cir.getClass().getSimpleName()+" "+color+" es: "+cir.getPerimetro());
        System.out.println("El área del "+cir.getClass().getSimpleName()+" es: "+cir.getArea());

    }
}
