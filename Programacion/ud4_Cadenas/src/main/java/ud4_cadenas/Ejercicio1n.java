package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * n) Crear una cadena que sea igual a la introducida, 
 *    pero con la primera y ultima posición intercambiadas:
 *    Ejemplo: Si introducen "abcde", obtendria "ebcda"
 *     
 * */

public class Ejercicio1n {

    public static void main(String[] args) {
        // Inicializamos las variables
        Scanner sc = new Scanner(System.in);

        // Pedimos una cadena al usuario:
        System.out.println("Introduce una cadena:");
        String texto = sc.nextLine();

        // Evaluamos que tenga al menos 2 caracteres la cadena:
        if (texto.length() >= 2) {
            String resultado = texto.charAt(texto.length() - 1)
                    + texto.substring(1, texto.length() - 1)
                    + texto.charAt(0);

            System.out.println("Cadena intercambiada: " + resultado);
        } else {
            System.out.println("La cadena debe tener al menos 2 caracteres.");
        }

        sc.close();
    }

}
