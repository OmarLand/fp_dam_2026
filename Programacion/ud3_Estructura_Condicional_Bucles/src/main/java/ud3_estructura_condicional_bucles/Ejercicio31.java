package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 *
 * @author OmarjLand
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[30];
        int suma = 0;

        // Introducimos los 30 números y validamos cada uno
        for (int i = 0; i < 30; i++) {

            System.out.println("Introduce el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();

            while (numeros[i] < 0 || numeros[i] > 1000) {
                System.out.println(
                        "Error. El número debe estar entre 0 y 1000.");
                System.out.println("Introduce de nuevo el número:");
                numeros[i] = sc.nextInt();
            }

            suma += numeros[i];
        }

        // Comprobamos si la suma es par o impar
        if (suma % 2 == 0) {

            System.out.println("La suma es par.");
            System.out.println("Los tres primeros números son:");

            for (int i = 0; i < 3; i++) {
                System.out.println(numeros[i]);
            }

        } else {

            System.out.println("La suma es impar.");
            System.out.println("Los tres últimos números son:");

            for (int i = 27; i < 30; i++) {
                System.out.println(numeros[i]);
            }
        }

        sc.close();

    }
}
