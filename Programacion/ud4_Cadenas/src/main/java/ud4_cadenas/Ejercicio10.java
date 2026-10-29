package ud4_cadenas;

import java.util.Scanner;

/**
 * Realizar un programa que solicite la entrada de una cadena de  6 posiciones, 
 * que todas sean digitos y sin repetidos. Si no cumple esas condiciones, 
 * el usuario deberá introducirla d enuevo hasta que lo haga correctamente.
*/

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena;
        boolean valida;

        do {
            System.out.println("Introduce una cadena de 6 dígitos sin repetir:");
            cadena = sc.nextLine();

            valida = true;

            // Comprobar que tenga 6 caracteres
            if (cadena.length() != 6) {
                valida = false;
            } else {

                // Comprobar que todos sean dígitos
                for (int i = 0; i < cadena.length(); i++) {
                    if (cadena.charAt(i) < '0' || cadena.charAt(i) > '9') {
                        valida = false;
                    }
                }

                // Comprobar que no haya dígitos repetidos
                for (int i = 0; i < cadena.length(); i++) {
                    for (int j = i + 1; j < cadena.length(); j++) {
                        if (cadena.charAt(i) == cadena.charAt(j)) {
                            valida = false;
                        }
                    }
                }
            }

            if (!valida) {
                System.out.println("Cadena incorrecta. Inténtalo de nuevo.");
            }

        } while (!valida);

        System.out.println("Cadena válida: " + cadena);

        sc.close();
    }
}
