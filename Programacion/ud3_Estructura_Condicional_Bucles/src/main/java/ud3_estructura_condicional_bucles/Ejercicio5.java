package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Sumar una cantidad de números que se van introduciendo, siempre que sean
 * positivos hasta que se teclee el -1.
*/

public class Ejercicio5 {

    public static void main(String[] args) {
        
        // Inicializamos las variables Globales
        int value, acum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("### Programa que Suma números mientras se vaya ingresando ###");
        
        do{

            // Pedimos los valores al usuario:
            System.out.println("Ingrese el valor que desea sumar: ");
            value = sc.nextInt();

            if (value < 0) {
                System.out.println("Ha ingresado un valor negativo - Terminamos el programa.");
                break;
            } else {
                acum = (acum + value);
            }

        }while( value > 0 );
        System.out.println("La sumatoria de los números registrados es de: " + acum);
    }
}
