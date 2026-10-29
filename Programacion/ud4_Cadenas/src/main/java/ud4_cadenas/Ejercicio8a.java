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
 * [Version 1]
 * */ 

public class Ejercicio8a {
    public static void main(String[] args) {

        // Inicializamos las variables:
        Scanner sc = new Scanner(System.in);
        String nombre, mensaje;
        int edad;

        //Pedimos los datos al usuario:
        System.out.println("Por favor indiquenos el nombre de usuario:");
        nombre = sc.nextLine();
        System.out.println("Ahora, indiquenos la edad de usuario:");
        edad = sc.nextInt();

        // Procesamos en el String.format los datos
        mensaje = String.format("Hola, me llamo %s y tengo %d años", nombre, edad);

        // Mostramos el mensaje formateado:
        System.out.println( mensaje );

        sc.close();
    }
}
