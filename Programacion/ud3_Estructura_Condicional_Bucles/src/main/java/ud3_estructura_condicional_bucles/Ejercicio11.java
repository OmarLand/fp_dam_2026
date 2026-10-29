package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Diseñar un algoritmo capaz de leer dos valores enteros, m y n,
 * y nos muestre los numeros comprendidos entre ellos ordenados ascendentemente,
 * junto con el valor de elevar cada uno de esos números  al cuadrado.
 * No se sabe si m > n, pero se desea utilizar una sola sentencia
 * repetitiva tanto si m > n como si m < n
*/

public class Ejercicio11 {
    public static void main(String[] args) {
        
        // Declaramos las variables
        int m, n, inicio, fin;
        Scanner sc = new Scanner(System.in);

        // Pedimos los dos números al usuario
        System.out.println("Introduce el valor de m:");
        m = sc.nextInt();

        System.out.println("Introduce el valor de n:");
        n = sc.nextInt();

        // Determinamos el menor y el mayor
        if (m < n) {
            inicio = m;
            fin = n;
        } else {
            inicio = n;
            fin = m;
        }

        // Mostramos los números ordenados ascendentemente
        for (int i = inicio; i <= fin; i++) {
            System.out.println(i + " elevado al cuadrado = "
                    + (i * i));
        }

        sc.close();
    }
}
