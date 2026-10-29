package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * k) Decir si la primera posicion de la cadena es igual a la ultima:
 *   
 * */

public class Ejercicio1k {
    public static void main(String[] args) {
        
        //Inicializamos variables:
        String texto;
        char primera, ultima;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que Compara Primera y Ultima posición de una cadena #");

        //Pedimos los datos al usuario:
        System.out.println("Por favor, ingrese un texto a evaluar: ");
        texto = sc.nextLine();

        // Recojo las posiciones 1 y ultima y las almaceno en is variables:
        // Además, lo convierto a minusculas para validar sean efectivamente iguales las letras
        primera = texto.toLowerCase().charAt(0);
        ultima = texto.toLowerCase().charAt( texto.length()-1 );
        
        // Hice esto solo por comprobar he tomado las posiciones indicadas
        // System.out.println("Primera letra > " + primera);
        // System.out.println("Ultima letra > " + ultima);

        if ( primera == ultima ) {
            System.out.println("La primera posición de la cadena [" + primera + "] es igual a la ultima [" + ultima +"] ");
        }else {
            System.out.println("La primera posición de la cadena [" + primera + "] NO es igual a la ultima [" + ultima +"] ");
        }

    }
}
