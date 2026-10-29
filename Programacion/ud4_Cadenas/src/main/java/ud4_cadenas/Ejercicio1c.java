package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * c) Decir si la cadena tiene mas de 10 posiciones
 * 
 * */

public class Ejercicio1c {
    public static void main(String[] args) {
        //Inicializamos las variables:
        String texto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que indica si un texto tiene más de 10 posiciones");

        // Pedimos al usuario la cadena:
        System.out.println("Por favor, ingrese el texto a validar:");
        texto = sc.nextLine();

        if (texto.length() > 10) {
            System.out.println("El Texto añadido tiene más de 10 posiciones: " + texto);
        } else {
            System.out.println("El texto no tiene más de 10 posiciones.");
        }

        sc.close();

    }
}
