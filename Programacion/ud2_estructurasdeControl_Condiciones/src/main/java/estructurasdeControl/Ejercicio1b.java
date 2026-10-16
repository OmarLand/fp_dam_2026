package estructurasdeControl;

import java.util.Scanner;

/**
 * Ejercicio1b
 * Leer dos numeros enteros y muestre si el primero es mayor que e segundo.
 */

public class Ejercicio1b {
    public static void main(String[] args) {
        
        // Inicializamos variables:
        Scanner sc = new Scanner(System.in);
        int valueA, valueB;

        System.out.println("# Programa que indica si el primer valor es mayor que el segundo: #");

        //Solicitamos los datos al usuario
        System.out.println("Por favor ingrese el PRIMER valor: ");
        valueA = sc.nextInt();

        System.out.println("Por favor ingrese el SEGUNDO valor: ");
        valueB = sc.nextInt();

        // Evaluamos los valores: Que el primer valor sea mayor que el segundo
        // Una vez evaluado mostramos resultado con mensaje
        if ( valueA > valueB ) {
            System.out.println("El primer número ingresado es el Mayor: " + valueA + " > " + valueB);
        } else{
            // Adicional añadi si el primero no es el mayor al menos indico que es menor que el segundo
            System.out.println("El primer número ingresado es Menor: " + valueA + " < " + valueB);
        }

    }
}
