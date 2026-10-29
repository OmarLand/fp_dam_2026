package ud4_cadenas;

import java.util.Scanner;

/**
 * Realiza un programa que solicite que se le introduzcan una cadena y un carácter y nos
 * muestre cuantas veces está contenido el carácter en la cadena . 
*/

public class Ejercicio3 {

    public static void main(String[] args) {
        
        // Inicializamos variables:
        Scanner sc = new Scanner(System.in);
        String cadena=""; 
        char caracter;
        int cont = 0;

        // Pedimos los datos al usuario:
        System.out.println("Ingrese una cadena de Texto: ");
        cadena = sc.nextLine();
        
        System.out.println("El caracter que desea buscar en la cadena anterior ingresada. ");
        caracter = sc.nextLine().charAt(0);

        for ( int i = 0; i < cadena.length(); i++ ) {
            if ( cadena.charAt(i) == caracter ) {
                cont++;
            }
        }

        System.out.println("El caracter [" + caracter + "] aparece ('" + cont + "') veces en la cadena ingresada.");

        sc.close();

    }

}
