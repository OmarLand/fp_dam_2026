package ud4_cadenas;

import java.util.Scanner;

/**
 * Realizar un programa al que se le introduzca una cadena por teclado, 
 * que la convierta a StringBuilder, y aplicando metodos de esa clase
 * haga lo siguiente:
 * 
 * a - Borrar el caracter que haya en la posicion 3.
 * b - Insertar una 'x' en la posicion 5.
 * c - Sustituir el caracter de la posicion 1 por una 'z'.
 * d - Borrar los caracteres entre la posicion 5 y 10.
 * e - Darles la vuelta a todos los caracteres del StringBuilder
 * f - Convertir el StringBuilder en cadena.
 * 
 * Nota: Habrá que verificar en algunos casos que la cadena 
 * tiene una longitud mayor que la de posicion indicada, sino
 * producira errores. 
*/

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        // Convertir String a StringBuilder
        StringBuilder sb = new StringBuilder(cadena);

        // a) Borrar el carácter de la posición 3
        if (sb.length() > 3) {
            sb.deleteCharAt(3);
        } else {
            System.out.println("No hay carácter en la posición 3.");
        }
        System.out.println("a) " + sb);

        // b) Insertar una 'x' en la posición 5
        if (sb.length() >= 5) {
            sb.insert(5, 'x');
        } else {
            System.out.println("No se puede insertar en la posición 5.");
        }
        System.out.println("b) " + sb);

        // c) Sustituir el carácter de la posición 1 por una 'z'
        if (sb.length() > 1) {
            sb.setCharAt(1, 'z');
        } else {
            System.out.println("No hay carácter en la posición 1.");
        }
        System.out.println("c) " + sb);

        // d) Borrar los caracteres entre las posiciones 5 y 10
        if (sb.length() >= 10) {
            sb.delete(5, 10);
        } else {
            System.out.println("No hay suficientes caracteres para borrar hasta la posición 10.");
        }
        System.out.println("d) " + sb);

        // e) Dar la vuelta a todos los caracteres
        sb.reverse();
        System.out.println("e) " + sb);

        // f) Convertir StringBuilder en String
        String resultado = sb.toString();
        System.out.println("f) " + resultado);

        sc.close();
        
    }

}
