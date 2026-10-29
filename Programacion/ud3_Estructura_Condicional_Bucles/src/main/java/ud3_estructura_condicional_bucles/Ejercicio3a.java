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

// [VERSIÓN 1 - LECTURA DE TECLADO ANTES DE ENTRAR AL BUCLE]
public class Ejercicio3a {
    public static void main(String[] args) {
        
        int valueN;
        Scanner sc = new Scanner(System.in);

        System.out.println("### Programa que comprueba si un numero es Par o Impar ###\n");
        System.out.println("Ingrese que cantidad de números desea evaluar:");
        valueN = sc.nextInt();

        // Aplicamos ciclo FOR
        for (int i = 1; i <= valueN; i++) {
            int value;
            System.out.println("Ahora, ingrese el valor: " + i);
            value = sc.nextInt();

            if ( value <= 0 ) {
                System.out.println("Ha ingresado un numero negativo, finaliza el programa.");
                break;
            } else if ( value > 0 ) {
                if ( value%2 == 0 ) {
                    System.out.println("Es un número PAR: " + value);
                } else {
                    System.out.println("Es un número IMPAR: " + value);
                }
            }
        }
        sc.close();
    }
}
