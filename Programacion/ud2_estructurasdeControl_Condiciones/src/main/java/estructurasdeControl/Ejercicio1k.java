package estructurasdeControl;

import java.util.Scanner;

/**
 * Leer un número y decir si es múltiplo de 2, de 3 y/o de 10.
 * Si no es múltiplo de 2, ya no hay que mirar si lo es de 10.
 */

public class Ejercicio1k {

    public static void main(String[] args) {

        // Inicializamos variables
        int numero;
        Scanner sc = new Scanner(System.in);

        // Pedimos el número al usuario
        System.out.println("Ingrese un numero entero: ");
        numero = sc.nextInt();

        // Comprobamos si es multiplo de 2
        if (numero % 2 == 0) {

            System.out.println("Es multiplo de 2.");

            // Solo comprobamos el 10 si es multiplo de 2
            if (numero % 10 == 0) {
                System.out.println("Es multiplo de 10.");
            } else {
                System.out.println("No es multiplo de 10.");
            }

        } else {
            System.out.println("No es multiplo de 2.");
            System.out.println("No es multiplo de 10.");
        }

        // Comprobamos si es multiplo de 3
        if (numero % 3 == 0) {
            System.out.println("Es multiplo de 3.");
        } else {
            System.out.println("No es multiplo de 3.");
        }

        sc.close();
    }
}
