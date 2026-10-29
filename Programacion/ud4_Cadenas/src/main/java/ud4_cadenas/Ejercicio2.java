package ud4_cadenas;

import java.util.Scanner;

/**
 * Diseña un algoritmo capaz de obtener la letra del NIF a partir del numero 
 * DNI. Consiste en dividir dicho numero entre 23 y tomar el resto de la división
 * asignandole la letra correspondiente según la siguiente tabla.
 * Almacena las letras del NIF en una cadena
 * */

public class Ejercicio2 {
    public static void main(String[] args) {
        
        //Inicializamos variables:
        String letrasNIF = "TRWAGMYFPDXBMJZSQVHLCKE";
        char letra;
        int dni, resto;
        Scanner sc = new Scanner(System.in);

        //Pedimos el DNI al usuario:
        System.out.println("Por favor ingrese los datos numericos de su NIF: ");
        dni = sc.nextInt();

        // Dividimos el DNI entre 23 y almacenamos en resto.
        resto = dni%23;

        // Ahora, usando el charAt con resto pasado como parametro
        // Calculamos la letra que le corresponda al NIF del DNI ingresado.
        letra = letrasNIF.charAt(resto);

        // Mostramos el resultado al usuario:
        System.out.println("El NIF del usuario es: " + dni + letra);

        sc.close();

    }
}
