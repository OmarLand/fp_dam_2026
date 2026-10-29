package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * f) Crear una cadena formada por las 5 ultimas posiciones de la cadena:
 * 
 * */

public class Ejercicio1f {
    public static void main(String[] args) {

        //Inicialicamos variables:
        String texto;
        Scanner sc = new Scanner(System.in);
        
        //Pedimos los datos al usuario:
        System.out.println("Por favor, ingrese el texto a procesar:");
        texto = sc.nextLine();

        //Mostramos el resultado, las ultimas 5 posiciones de cualquier cadena:
        System.out.print("> " + texto.substring(texto.length() - 5) );

        sc.close();
    }
}
