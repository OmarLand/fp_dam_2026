package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * Ejercicio1a:
 * Mostrar por pantalla el contenido de la cadena pasada a mayusculas
 * y minusculas.
*/

public class Ejercicio1a {
    public static void main(String[] args) {
        
        // Inicializamos las variables:
        String text, mayus, minus;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que convierte de Mayusculas y Minusculas un texto dado por el usuario #");
        
        // Pedimos la cadena al usuario:
        System.out.println("Por favor, ingrese el texto.");
        text = sc.nextLine();

        // Hacemos el proceso de conversión Minusculas y Mayusculas:
        mayus = text.toUpperCase();
        minus = text.toLowerCase();

        // Mostramos resultados:
        System.out.println("Texto en Mayusculas: " + mayus); 
        System.out.println("Texto en Minusculas: " + minus); 

        sc.close();
    }
}