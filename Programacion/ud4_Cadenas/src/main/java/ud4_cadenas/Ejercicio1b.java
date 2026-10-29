package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * b) Decir si en la cadena aparece el carácter 'X'
 * 
 * */

public class Ejercicio1b {

    public static void main(String[] args) {

        // Inicializamos variables
        String text;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("# Programa que Muestra si en una Cadena está el Caracter [X] #");
        
        // Pedimos la Cadena String al usuario:
        System.out.println("Por favor ingrese un texto para analizar: ");
        text = sc.nextLine();

        // Evaluamos el texto:
        if ( text.indexOf('x') != -1 || text.indexOf('X') != -1 ) {
            System.out.println("Encontramos la letra X en la palabra: " + text);
        } else {
            System.out.println("No se encuentra la letra en la palabra: " + text);
        }

        sc.close();
        
    }

}
