package ud5_funciones;

import java.util.Scanner;

/**
 * Programa que calcule el factorial de números menores de 20. 
 * El programa permite al usuario meter los números que desee y 
 * finalizará cuando meta un numero menor que 1 o mayor que 20. 
 * Crea las funciones que consideres útiles y que puedas reutilizar 
 * en otros programas.
 */
public class Ejercicio5 {

    // Función que comprueba si el número es válido
    public static boolean esValido(int numero) {
        return numero >= 1 && numero <= 20;
    }

    // Función que calcula el factorial
    public static long factorial(int numero) {

        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Introduce un numero entre 1 y 20:");
        numero = sc.nextInt();

        while (esValido(numero)) {

            System.out.println("El factorial de " + numero + " es: " + factorial(numero));

            System.out.println("\nIntroduce otro numero entre 1 y 20:");
            numero = sc.nextInt();
        }

        System.out.println("Numero fuera del intervalo. Fin del programa.");

        sc.close();
    }
    
}
