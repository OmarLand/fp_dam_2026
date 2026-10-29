package ud4_cadenas;

import java.util.Scanner;

/**
 * Realizar un programa en el que el usuario introduzca un texto y 
 * sustituya sus posiciones impares por asteriscos, por ejemplo:
 * "abcdefg" cambie las posiciones impares pasaria a: "a*b*e*g"
*/

public class Ejercicio12 {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un texto:");
        String texto = sc.nextLine();

        StringBuilder sb = new StringBuilder(texto);

        for (int i = 1; i < sb.length(); i += 2) {
            sb.setCharAt(i, '*');
        }

        System.out.println("Texto modificado: " + sb);

        sc.close();
    
    }
}
