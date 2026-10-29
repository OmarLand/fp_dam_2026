package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Mostrar por pantalla alternativamente "hola" y "adiós" hasta completar x líneas,
 * siendo x un numero entero positivo tecleado previamente 
 * (ojo: el numero X puede ser par o impar).
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x;

        // Pedimos un número entero positivo
        do {
            System.out.println("Introduce un número entero positivo:");
            x = sc.nextInt();
        } while (x <= 0);

        // Mostramos hola y adiós alternativamente
        for (int i = 1; i <= x; i++) {

            if (i % 2 != 0) {
                System.out.println("hola");
            } else {
                System.out.println("adiós");
            }
        }

        sc.close();
    }
}
