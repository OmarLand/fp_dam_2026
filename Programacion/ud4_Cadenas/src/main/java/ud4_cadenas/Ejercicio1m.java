package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * m) Decir si la cadena es un palíndromo
 *    (se lee igual hacia adelante como hacia atrás).
 *   
 * */

public class Ejercicio1m {

    public static void main(String[] args) {
        
        // Inicializamos variables:
        String texto, textoInvertido="";
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que evalua si una cadena ingresada es o no Palindromo #");

        //Pedimos el texto al usuario:
        System.out.println("Ingrese el texto:");
        texto = sc.nextLine();

        for ( int i = texto.length() -1; i >=0; i-- ) {
            textoInvertido += texto.charAt(i);
        }

        if (texto.equalsIgnoreCase(textoInvertido)) {
            System.out.println("Es una Palabra Palindroma: [" + texto + "] Texto invertido: " + textoInvertido);
        } else{
            System.out.println("NO es una Palabra Palindroma: [" + texto + "] Texto invertido: " + textoInvertido);

        }


    }

}
