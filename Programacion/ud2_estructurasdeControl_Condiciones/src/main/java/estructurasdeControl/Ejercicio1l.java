package estructurasdeControl;

import java.util.Scanner;

/**
 * Ejercicio1l
 * Leer tres números enteros y decir si hay alguno mayor que cero.
 */

public class Ejercicio1l {

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

        // Comprobamos si alguno es mayor que cero
        if (valueA > 0 || valueB > 0 || valueC > 0) {
            System.out.println("Hay al menos un numero mayor que cero.");
        } else {
            System.out.println("Ningun numero es mayor que cero.");
        }

        sc.close();
    }
}
