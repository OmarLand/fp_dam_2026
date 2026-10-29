package ud4_cadenas;

import java.util.Scanner;

/**
 * Realizar un programa que solicite la entrada de 10 cadenas de caracteres 
 * y construya una cadena con el primer caracter de cada cadena. Finalmente mostrará
 * dicha cadena por pantalla 
*/

public class Ejercicio9 {

    public static void main(String[] args) {
        
        // Inicializamos las variables:
        Scanner sc = new Scanner(System.in);
        String resultado="", cadena;

        // Usamos un Ciclo for para ir pidiendo la cadena y tomar el primer caracter de cada una:
        for ( int i = 1; i <= 10; i++ ) {
            System.out.println("Por favor introduzca la cadena " + i + " : " );
            cadena = sc.nextLine();

            resultado += cadena.charAt(0);
        }

        System.out.println("La cadena resultante es: " + resultado);

        sc.close();

    }    

}
