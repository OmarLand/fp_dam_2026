package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * l) Decir cuantos dígitos numericos hay en la cadena.
 *   
 * */

public class Ejercicio1l {
    public static void main(String[] args) {
        
        //Inicializamos las variables:
        String cadena;
        int cont = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que indica cuantos dígitos numéricos hay en la cadena #");

        // Pedimos los datos al usuario:
        System.out.println("Ingrese la cadena a comprobar: ");
        cadena = sc.nextLine();

        for ( int i = 0; i < cadena.length(); i++) {
            if ( Character.isDigit(cadena.charAt(i)) ) {
                cont++;
            }
        }

        System.out.println("Existen [" + cont + "] digitos numericos en la cadena." );

        sc.close();

    }
}
