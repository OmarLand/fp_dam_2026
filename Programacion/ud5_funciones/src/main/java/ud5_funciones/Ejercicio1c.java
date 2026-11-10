package ud5_funciones;

import java.util.Scanner;

/**
 * Realizar funciones que realicen los siguientes supuestos, y un main()
 * desde el que se llame a dichas funciones:
 * 
 * c) Función llamada sumaIntervalo() que le pasan dos long y devuelve 
 *    otro long con la suma de los números comprendidos 
 *    entre los números pasados (el primero es menor que el segundo, 
 *    y ambos son mayores que cero, en caso contrario devuelve -1)
 * 
 */

public class Ejercicio1c {
    
    // Función que suma los números comprendidos en un intervalo
    public static long sumaIntervalo(long num1, long num2) {

        if (num1 <= 0 || num2 <= 0 || num1 >= num2) {
            return -1;
        }

        long suma = 0;

        for (long i = num1; i <= num2; i++) {
            suma += i;
        }

        return suma;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        long num1 = sc.nextLong();

        System.out.println("Introduce el segundo número:");
        long num2 = sc.nextLong();

        long resultado = sumaIntervalo(num1, num2);

        if (resultado == -1) {
            System.out.println("Intervalo incorrecto.");
        } else {
            System.out.println("La suma del intervalo es: " + resultado);
        }

        sc.close();
    }
    
}
