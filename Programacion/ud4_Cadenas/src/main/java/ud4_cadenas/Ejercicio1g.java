package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * g) Decir si la cadena es igual a la cadena "hola"
 * 
 * */


public class Ejercicio1g {

    public static void main(String[] args) {
        
        // Inicializamos las variables
        String texto, cadena="hola";
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que compara lo ingresado por el usuario con la cade predefinida 'hola' ");

        //Pedimos los datos al usuario:
        System.out.println("Por favor, ingrese un texto a comparar: ");
        texto = sc.nextLine();

        if ( texto.equalsIgnoreCase( cadena ) ) {
            System.out.println("El texto ingresado: [" + texto + "] es igual a la cadena: " + cadena);
        } else {
            System.out.println("El texto ingresado: [" + texto + "] NO es igual a la cadena: " + cadena);
        }

        sc.close();

    }

}
