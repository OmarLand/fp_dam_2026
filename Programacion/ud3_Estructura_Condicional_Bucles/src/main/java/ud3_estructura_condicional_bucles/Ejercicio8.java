package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Calcular la suma de los 100 numeros siguientes a uno tecleado previamente:
*/

public class Ejercicio8 {
    public static void main(String[] args) {
        
        // Inicializamos las variables
        int value, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("## Programa que suma los 100 números siguientes al tecleado ##");

        // Pedimos el dato al usuario:
        System.out.println("Por favor ingrese el número: ");
        value = sc.nextInt();

        for ( int i = 1; i <= 100; i++ ) {
            sum = sum + value + i;
        }

        System.out.println("La Suma de los siguientes 100 numeros es: " + sum);

        sc.close();

    }
}
