package estructurasdeControl;

import java.util.Scanner;

/**
 * 1 - Hacer programas sencillos que hagan lo siguiente: Explico en casa ejercicio lo que se pide
 * Ejercicio1a:
 * Leer un numero entero y determinar si es mayor de 10
 */

public class Ejercicio1a {
    public static void main(String[] args) {
        int value;
        Scanner sc = new Scanner(System.in);


        System.out.println("# Programa que determina si un numero es Mayor de 10 #");
        value = sc.nextInt();

        if (value > 10) {
            System.out.println("El numero ingresado es mayor de [10] - " + "número ingresado: " + value);
        } else {
            System.out.println("El numero ingresado NO es mayor de [10] - " + "número ingresado: " + value);
        }

        


    }
}