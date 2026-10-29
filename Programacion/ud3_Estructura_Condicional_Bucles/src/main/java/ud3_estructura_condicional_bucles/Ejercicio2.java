package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Ejercicio 2
 * Mostrar por pantalla los n  primeros numeros naturales, 
 * siendo n el valor tecleado previamente
 * 
*/

public class Ejercicio2 {
    public static void main(String[] args) {

        // Inicializamos variables:
        int valueN;
        Scanner sc = new Scanner(System.in);

        // Pedimos la n Cantidad al usuario:
        System.out.println("Ingrese la cantidad a comprobar: ");
        valueN = sc.nextInt();

        // Aplicamos ciclo FOR y mostramos datos:
        for (int i = 1; i <= valueN; i++) {
            System.out.println("> " + i);
        }
        
        sc.close();
    }
}
