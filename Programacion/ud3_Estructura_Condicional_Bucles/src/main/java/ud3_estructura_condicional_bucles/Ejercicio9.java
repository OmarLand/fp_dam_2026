package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Sumar una cantidad de números que se van introduciendo por teclado,
 * hasta que la suma de los mismos valga más de 100
*/

public class Ejercicio9 {

    public static void main(String[] args) {

        // Inicializamos los valores:
        int sumatorio = 0, value;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que suma numeros hasta que el valor sea mas de 100 #");

        // Aplicamos el bucle do{} while()
        do { 
            
            // Pedimos el dato al usuario
            System.out.println("Por favor ingrese el valor que requiere sumar: ");
            value = sc.nextInt();

            // Acumulamos los valores y los vamos sumando conforme se vaya introduciendo
            sumatorio += value;

            //Condición que indica si la sumatoria supera los 100 termina el programa
        } while (sumatorio < 100);

        // Mostramos mensaje al usuario indicando que excedio la suma y el total.
        System.out.println("Ha pasado la suma de 100, programa finalizado. " + sumatorio);
        
        sc.close();
    }
}