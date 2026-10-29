package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que permita introducir números positivos 
 * y nos vaya informando uno a uno si es par o impar.
 * El programa finalizará cuando se introduzca un número negativo.
 * Hacer dos versiones, una primera con una lectura de teclado 
 * adelantada (antes de entrar en el bucle) y otra vesión en la que 
 * la lectura de datos se haga únicamente al principio del bucle.
*/

// [VERSION 2 - LECTURA DE DATOS SOLO AL PRINCIPIO DEL BUCLE]
public class Ejercicio3b {
    public static void main(String[] args) {
 
        // Declaramos valores
        int value;
        Scanner sc = new Scanner(System.in);
        
        do {     
            System.out.println("### Programa que evalua si un numero es Par o Impar ###");
            System.out.println("Ingrese el valor a Evaluar");
            value = sc.nextInt();

            if ( value%2 == 0 ) {
                System.out.println("El número ingresado es Par: " + value);
            } else {
                System.out.println("El número ingresado es  Impar: " + value);                
            }

        }while ( value > 0 );

        System.out.println("Ha ingresado un numero negativo, el programa se finaliza.");        
    }
}
