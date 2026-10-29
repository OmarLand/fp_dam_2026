package ud4_cadenas;

import java.util.Scanner;

/**
 * Por Defecto usar Clase String. Se especificará cuando 
 * se deba usar la clase StringBuilder.
 * 
 * Realizar un programa al que se le introduzca una cadena por teclado 
 * y haga lo siguiente:
 * 
 * i)  Convertir la cadena de entrada a una variable de tipo int
 * suponiendo que dicha cadena es un numero hexadecimal, esto es,
 * contiene solo digitos decimales (del 0 a 9) y letras de la A a F.
 * 
 * */

public class Ejercicio1i {
    public static void main(String[] args) {
        
        //Inicialiamos variables:
        String valueHexa;
        int valueConverted;
        Scanner sc = new Scanner(System.in);

        System.out.println("Programa que convierte una cadena de tipo int [Hexadecimal] a [Decimal]");
        
        // Pedimos los datos al usuario:
        System.out.println("# Ingrese el numero Hexadecimal #");
        valueHexa = sc.nextLine();

        // Evaluamos y convertimos el dato:
        valueConverted = Integer.parseInt(valueHexa, 16);

        //Mostramos resultado:
        System.out.println("Dato Original Hecadecimal: " + valueHexa);
        System.out.println("Dato convertido Entero: " + valueConverted);

        sc.close();

    }
}
