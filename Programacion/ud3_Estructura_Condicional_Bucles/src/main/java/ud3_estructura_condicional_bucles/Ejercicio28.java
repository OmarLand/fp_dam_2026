package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Sacar por pantalla la suma, la media y el producto de los números pares 
 * comprendidos entre dos números enteros tecleados previamente. 
 * No sabemos si el que introduce primero es menor que el segundo. 
 * No incluir en los cálculos los números introducidos, solo los intermedios.
 */

public class Ejercicio28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1, num2, menor, mayor;
        int suma = 0, contador = 0;
        long producto = 1;
        double media;

        System.out.println("Introduce el primer número entero:");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número entero:");
        num2 = sc.nextInt();

        // Determinamos cuál es el menor y cuál el mayor
        if (num1 < num2) {
            menor = num1;
            mayor = num2;
        } else {
            menor = num2;
            mayor = num1;
        }

        // Recorremos únicamente los números intermedios
        for (int i = menor + 1; i < mayor; i++) {

            if (i % 2 == 0) {
                suma += i;
                producto *= i;
                contador++;
            }
        }

        // Mostramos los resultados
        if (contador > 0) {
            media = (double) suma / contador;

            System.out.println("Suma de los pares: " + suma);
            System.out.println("Media de los pares: " + media);
            System.out.println("Producto de los pares: " + producto);
        } else {
            System.out.println("No hay números pares intermedios.");
        }

        sc.close();
    }
}
