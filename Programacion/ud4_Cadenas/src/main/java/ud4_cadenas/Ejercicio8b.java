package ud4_cadenas;

import java.util.Scanner;

/**
 * 
 * Escribe un programa que solicite que se introduzca por teclado un nombre completo 
 * y una edad y muestre el siguiente mensaje. Hacer una versión utilizando la clase Format
 * y otra versión con el metodo System.out.printf..:
 * "Hola, me llamo Pepe Perez Lopez y tengo 20 años"
 * suponiendo que se introduce Pepe Perez Lopez como nombre completo y 20 como edad.
 * 
 * [Version 2]
 * */ 

public class Ejercicio8b {
    public static void main(String[] args) {

        // Inicializamos las variables
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;

        // Pedimos los datos al usuario:
        System.out.println("Introduce tu nombre completo:");
        nombre = sc.nextLine();

        System.out.println("Introduce tu edad:");
        edad = sc.nextInt();

        System.out.printf(
                "Hola, me llamo %s y tengo %d años%n", nombre, edad
        );

        sc.close();
    }
}
