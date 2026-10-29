package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * j) Si se encuentra con en su interior con "prueva" sustituir por "prueba"  
 *   
 * */

public class Ejercicio1j {

    public static void main(String[] args) {
        
        //Inicializamos variables:
        String text, check;
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que Sustituyela palabra 'prueva' por 'prueba' ");

        //Pedimos una cadena de texto al usuario:
        System.out.println("Por favor agregue el texto: ");
        text = sc.nextLine();

        check = text.replace("prueva", "prueba");

        System.out.println("Texto ingresado: " + text);
        System.out.println("Texto corregido: " + check);
        
        sc.close();
        
    }

}
