package ud4_cadenas;

import java.util.Scanner;

/**
 * Un algoritmo de encriptado monoalfabético consiste en la sustitución d euna letra por otra
 * a lo largo de todo el mensaje, por ejemplo: Las A por F, las B por X, las X por M.
 * Obviamente si la A pasa a ser F, ninguna otra letra pasará F. Hacer un programa, que le
 * introduzca una cadena en mayúsculas y muestre la cadena encriptada 
 * (todo lo que no sean letras mayusculas se deja intacto: numeros, espacios en blanco, etc.).
 * Hacer una segunda versión que funcione con mayusculas y minusculas.
 * 
 * [Version 1]
*/

public class Ejercicio6a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String clave =    "FXMABCDEFGHIJKLMNOPQRSTUVW";

        System.out.println("Introduce un mensaje en mayúsculas:");
        String texto = sc.nextLine();

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            int posicion = alfabeto.indexOf(caracter);

            if (posicion != -1) {
                resultado += clave.charAt(posicion);
            } else {
                resultado += caracter;
            }
        }

        System.out.println("Mensaje encriptado: " + resultado);

        sc.close();
    }
}
