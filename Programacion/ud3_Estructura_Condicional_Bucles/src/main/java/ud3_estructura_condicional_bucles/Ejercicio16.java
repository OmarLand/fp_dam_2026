package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * 
 * Programar el siguiente juego. El ordenador genera un numero al azar
 * entre 0 y 99 que habrá que adivinar. El Jugador intentará adivinar 
 * el número y el programa le responderá si es mayor, menor o si ha acertado.
 * Se dispone de un maximo de 5 intentos.
 * 
*/

public class Ejercicio16 {
    public static void main(String[] args) {

        // Inicializamos las variables
        int numeroSecreto, numeroJugador;
        int intentos = 0;
        final int MAX_INTENTOS = 5;
        boolean acertado = false;

        Scanner sc = new Scanner(System.in);

        // Generamos un número aleatorio entre 0 y 99
        numeroSecreto = (int) (Math.random() * 100);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("...Estoy pensando en un número entre 0 y 99...");
        System.out.println("Tienes " + MAX_INTENTOS + " intentos.");

        while (intentos < MAX_INTENTOS && !acertado) {

            System.out.println("Introduce un número:");
            numeroJugador = sc.nextInt();

            intentos++;

            if (numeroJugador == numeroSecreto) {
                acertado = true;
                System.out.println("¡Enhorabuena! Has acertado.");

            } else if (numeroJugador < numeroSecreto) {
                System.out.println("El número secreto es MAYOR.");

            } else {
                System.out.println("El número secreto es MENOR.");
            }

            if (!acertado && intentos < MAX_INTENTOS) {
                System.out.println("Te quedan "
                        + (MAX_INTENTOS - intentos) + " intentos.");
            }
        }

        if (!acertado) {
            System.out.println("¡Se acabaron los intentos!");
            System.out.println("El número secreto era: " + numeroSecreto);
        }

        sc.close();
        
    }
}
