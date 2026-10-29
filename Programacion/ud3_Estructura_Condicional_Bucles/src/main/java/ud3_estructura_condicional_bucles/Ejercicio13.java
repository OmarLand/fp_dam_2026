package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Programa al que le introduzcas un numero y que garantice que es positivo,
 * es decir, si lo introducimos menor o igual que cero nos obligará a volver
 * a introducirlo las veces que sea necesario hasta que se introduzca uno positivo
 * 
 * Nota: Cuando tenemos que hacer algo una o más veces, pero por lo menos una,
 * el do...while puede ser mejor opción que el while.
*/

public class Ejercicio13 {
    public static void main(String[] args) {
        
        // Inicializamos variables:
        int value;
        Scanner sc = new Scanner(System.in);

        // Hacemos el ciclo do..while()
        do { 
        
            // Pedimos los datos al usuario
            System.out.println("Por favor introduzca un numero: ");
            value = sc.nextInt();

            // Validamos que el numero no sea mayor de Cero
            if ( value <= 0 ) {
                System.out.println("Error al ingresar el numero. Debe ser Positivo.\nIntentelo de nuevo");
            }

        } while (value <= 0);

        System.out.println("Numero positivo introducido ha sido: " + value);


    }
}
