package estructurasdeControl;

import java.util.Scanner;

/**
 * Leer tres números enteros y decir si hay alguno mayor que cero,
 * pero no todos.
 */

public class Ejercicio1m {

    public static void main(String[] args) {

        // Inicializamos variables
        int valueA, valueB, valueC;
        Scanner sc = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.println("Ingrese el primer numero: ");
        valueA = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        valueB = sc.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        valueC = sc.nextInt();

        // Comprobamos la condicion
        if ((valueA > 0 || valueB > 0 || valueC > 0)
                && !(valueA > 0 && valueB > 0 && valueC > 0)) {

            System.out.println("Hay algun numero mayor que cero, pero no todos.");

        } else {

            System.out.println("No se cumple la condicion.");

        }

        sc.close();
    }
}
