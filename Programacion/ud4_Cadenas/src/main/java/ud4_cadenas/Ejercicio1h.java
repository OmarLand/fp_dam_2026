package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * h) Convertir la cadena de entrada a una variable de tipo int, suponiendo
 * que dicha cadena es un numero, esto es, contiene solo digitos decimales
 * (del 0 al 9). 
 * 
 * */

public class Ejercicio1h {
    public static void main(String[] args) {
        
        //Inicializamos variables:
        String valueNum;
        int entero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa qwue convierte una Cadena de Tipo int -\n Y suponiendo que dicha cadena es un numero:");
        
        //Pedimos el dato al usuario:
        System.out.println("Ingrese la cantidad a convertir: ");
        valueNum = sc.nextLine(); 

        // Hacemos el proceso de cambio de String a int con el parseInt()
        entero = Integer.parseInt(valueNum);

        // Mostramos el resultado al usuario
        // Aunque imperceptible, en cuanto a código se cumple la funcion
        System.out.println("Cadena convertida a tipo int: " + entero);

        sc.close();

    }
}
