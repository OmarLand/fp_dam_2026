package com.example;
/**
 * Queremos realizar un pequeño programa para introducirlo en el ordenador de a bordo de
   nuestro coche y que nos informe del consumo medio del coche cada km Diseña un 100 .
   programa al que le introduzcamos el kilometraje de la última vez que se repostó el kilometraje ,
   actual los litros de gasolina que tenía al finalizar la última vez que repostó y la cantidad de ,
   gasolina actual . 
 */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        
        // Inicializamos las variables
        Scanner sc = new Scanner(System.in);
        float distancia, combustible, kmAntes, kmActual, combusAntes, combusActual, km100;


        System.out.println("# Calculo de Consumo promedio de Gasolina Ltrs/100 kilometros #");

        // Solicitamos los datos por Teclado al usuario
        System.out.println("Por favor ingrese el registro de kilometraje Pasado:");
        kmAntes = sc.nextInt();

        System.out.println("Ahora, ingrese el registro de kilometraje Actual:");
        kmActual = sc.nextInt();

        System.out.println("Por favor, digame cuantos litros de gasolina tenía antes:  ");
        combusAntes = sc.nextInt();

        System.out.println("Ahora, indiquenos cuanto combustible tiene actualmente: ");
        combusActual = sc.nextInt();

        // Hacemos los calculos respectivos:
        distancia = kmActual - kmAntes;
        combustible = combusActual - combusAntes; 

        // System.out.println("Distancia: " + distancia);
        // System.out.println("Combustible: " + combustible);

        // Aqui sacamos el total consumido por cada 100 kilometros aproximadamente
        km100 = (combustible / distancia) * 100.0f;

        System.out.println("El consumo medio del coche cada 100 km es aproximadamente de: " + km100 + " Litros de Combustible.\n");
        System.out.println("### Gracias por usar nuestra Red de Software 1.0 ###");



        
    }
}