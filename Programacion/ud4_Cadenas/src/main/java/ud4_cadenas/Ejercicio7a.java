package ud4_cadenas;

import java.util.Scanner;

/**
 * Realizar un programa que solicite ua cadena, un numero que indica una posición de la cadena
 * y una letra. El Programa reemplazará sobre la misma cadena, el caracter que hubiera
 * en la posición indicada por la letra introducida. Hacer dos versiones, la primera con String
 * y otra con StringBuilder
 * [Version 1 - String]
*/

public class Ejercicio7a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String texto = sc.nextLine();

        System.out.println("Introduce la posición que quieres modificar:");
        int posicion = sc.nextInt();

        System.out.println("Introduce la nueva letra:");
        char letra = sc.next().charAt(0);

        if (posicion >= 0 && posicion < texto.length()) {
            texto = texto.substring(0, posicion)
                    + letra
                    + texto.substring(posicion + 1);

            System.out.println("Cadena modificada: " + texto);
        } else {
            System.out.println("La posición indicada no es válida.");
        }

    }
}
