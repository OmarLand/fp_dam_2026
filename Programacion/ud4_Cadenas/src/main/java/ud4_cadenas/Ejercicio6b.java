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
 * [Version 2]
*/

public class Ejercicio6b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String claveMayus = "FXMABCDEFGHIJKLMNOPQRSTUVWYZ";

        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String claveMinus = "fxmabcdefghijklmnopqrstuvwyz";

        System.out.println("Introduce un mensaje:");
        String texto = sc.nextLine();

        String resultado = "";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            int posMayus = mayusculas.indexOf(caracter);
            int posMinus = minusculas.indexOf(caracter);

            if (posMayus != -1) {
                resultado += claveMayus.charAt(posMayus);
            } else if (posMinus != -1) {
                resultado += claveMinus.charAt(posMinus);
            } else {
                resultado += caracter;
            }
        }

        System.out.println("Mensaje encriptado: " + resultado);

        sc.close();
    }
}
