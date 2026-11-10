package ud5_funciones;

import java.util.Scanner;

/**
 * Función llamada aleatorio(), que se le pasan dos valores enteros devuelve 
 * un entero al azar comprendido entre esos dos valores 
 * (el primero es menor que el segundo, y ambos mayores que cero, 
 * en caso contrario devuelve -1)
 */

public class Ejercicio1e {
    
    // Función que devuelve un número aleatorio entre dos valores
    public static int aleatorio(int num1, int num2) {

        if (num1 <= 0 || num2 <= 0 || num1 >= num2) {
            return -1;
        }

        int numero = (int) (Math.random() * (num2 - num1 + 1)) + num1;

        return numero;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero:");
        int num2 = sc.nextInt();

        int resultado = aleatorio(num1, num2);

        if (resultado == -1) {
            System.out.println("Valores incorrectos.");
        } else {
            System.out.println("Numero aleatorio generado: " + resultado);
        }

        sc.close();
    }
 
}
