package estructurasdeControl;

import java.util.Scanner;

/**
 * Ejercicio3c
 * Leer un numero entero y determinar si se trata de un numero par o impar.
*/

public class Ejercicio1c {
    public static void main(String[] args) {

        // Inicializamos las variables:
        int value;
        Scanner sc = new Scanner(System.in);

        //Pedimos el dato al usuario:
        System.out.println("Por favor ingrese el numero a evaluar:");
        value = sc.nextInt();

        // Evaluamos el valor y damos resultados
        if ( value%2 == 0 ) {
            System.out.println("El valor ingresado es número Par: " + value);
        } else {
            System.out.println("El valor ingresado es número Impar: " + value);
        }

        
    }
}
