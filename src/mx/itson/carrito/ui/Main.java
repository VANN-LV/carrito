/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.enums.TipoMotor;

/**
 *
 * @author alumnog
 */
public class Main {
 public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese la distancia recorrida");
        double distancia = sc.nextDouble();
        
        System.out.println("Ingrese la velocisad a la quye viaja el carro ");
        double velocidad = sc.nextDouble();
        
        //Generamos una intsancia de la clase carro
        Carro bmw= new Carro();
        bmw.setModelo(" BMW");
        bmw.setColor("negro");
        bmw.setAnio(2022);
        bmw.setKilometraje(10000);
        bmw.setTipoMotor(TipoMotor.HÍBRIDO);
        
        double tiempo= bmw.calcularTiempo(distancia, velocidad);
        
        System.out.println("El tiempo que tomará al carro "
                + bmw.getModelo()+
                "de color" + bmw.getColor() +
                "y cuyo modelo es" + bmw.getAnio()+
                "y su kilometraje es de" + bmw.getKilometraje()
                +tiempo
        );
 }
}
