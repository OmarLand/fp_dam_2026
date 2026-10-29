package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * d) Decir si la cadena contiene el carácter 'X' a partir de la cuarta posición
 * 
 * */

public class Ejercicio1d {
    public static void main(String[] args) {
        // Inicializamos las variables:
        String texto, textoSub;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que a partir de la posición 4 Valida si existe la letra [X] #");

        // Pedimos los datos al usuario:
        System.out.println("Por favor, ingrese el texto a validar: ");
        texto = sc.nextLine();
        textoSub = texto.substring(3); // Aqui Validamos a partir de la posición 3  

        // Procedemos a evaluar si hay una X
        if ( textoSub.indexOf('x')!=-1 || textoSub.indexOf('X')!=-1 ) {
            System.out.println("Tenemos una letra [X] despues de la 4ta posicion del texto: " + texto);
        } else {
            System.out.println("No Tenemos una letra [X] despues de la 4ta posicion del texto: " + texto);           
        }

        sc.close();

    }
}
