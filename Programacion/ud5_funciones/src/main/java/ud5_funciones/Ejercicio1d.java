package ud5_funciones;

import java.util.Scanner;

/**
* Función llamada contarCeros() que se le pasa una cadena y devuelve
* la cantidad de ceros que tiene
 */

// Función que cuenta los ceros de una cadena

public class Ejercicio1d {

    public static int contarCeros(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        int resultado = contarCeros(cadena);

        System.out.println("La cadena contiene " + resultado + " ceros.");

        sc.close();

    }
    
}
