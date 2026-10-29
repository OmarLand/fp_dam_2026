package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Programa que se le introduzcan números por consola y que informe
 * si están ordenados ascendentemente o no. 
 * El Programa finaliza si se introduce cero o en cuanto se detecte 
 * que los numero no estan ordenados:
*/

public class Ejercicio19 {
    public static void main(String[] args) {
        
        // Inicializamos las variables
        Scanner sc = new Scanner(System.in);
        int numero, anterior;
        boolean ordenados = true;

        // Pedimos los datos al usuario y damos instrucciones:
        System.out.println("Introduce un número (0 para terminar):");
        anterior = sc.nextInt();

        // EValuamos las condiciones con un ciclo while
        while (anterior != 0 && ordenados) {

            System.out.println("Introduce otro número (0 para terminar):");
            numero = sc.nextInt();

            // Vamos comparando los numeros.
            if (numero != 0) {
                if (numero < anterior) {
                    ordenados = false;
                } else {
                    anterior = numero;
                }
            } else {
                break;
            }
        }
        
        if (ordenados) {
            System.out.println("Los números están ordenados ascendentemente.");
        } else {
            System.out.println("Los números NO están ordenados ascendentemente.");
        }

        sc.close();
    }
}
