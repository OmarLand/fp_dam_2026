package ud5_funciones;

import java.util.Scanner;

/**
 * Realiza una función llamada cantidadDivisores() al que se le pase 
 * como parámetro un numero entero y devuelva el número de divisores 
 * o bien cero si el numero es negativo, Usa dicha función en un main.
 */

public class Ejercicio6 {

    // Función que calcula la cantidad de divisores
    public static int cantidadDivisores(int numero) {

        if (numero < 0) {
            return 0;
        }

        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        return contador;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero entero:");
        int numero = sc.nextInt();

        int resultado = cantidadDivisores(numero);

        System.out.println("Cantidad de divisores: " + resultado);

        sc.close();
    }
    
}
