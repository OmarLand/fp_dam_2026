package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * e) Crear una cadena formada por las 5 primeras posiciones de la cadena
 * 
 * */

public class Ejercicio1e {

    public static void main(String[] args) {
        //Inicializamos variables:
        String texto, textoRange;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que muestra solo las primeras 5 posiciones de una cadena dada por el usuario #");

        // Pedimos la informacion al usuario:
        System.out.println("Por favor, ingrese el texto: ");
        
        texto = sc.nextLine();

        // Usamos el .substring(begin, end) para mostrar solo las primeros 5 posiciones
        textoRange = texto.substring(0, 5); 

        //Mostramos el resultado:
        System.out.println("Texto original: " + texto);
        System.out.println("Texto primeras 5 posiciones: " + textoRange);

        sc.close();
    }

}
