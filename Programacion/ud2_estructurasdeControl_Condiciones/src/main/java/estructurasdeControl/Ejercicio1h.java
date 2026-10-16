package estructurasdeControl;

import java.util.Scanner;

/**
 *  Ejercicioh
 *  Leer dos números y decir si el primero es mayor que el segundo, si es menor o si los dos números son
 *  iguales
 */

public class Ejercicio1h {
    public static void main(String[] args) {
        
        //Inicializamos las variables
        int valueA, valueB;
        Scanner sc = new Scanner(System.in);

        System.out.println(" # Programa que evalua dos numeros e indica: Si el primero es mayor, si es menor o si ambos numeros son iguales # ");

        //Pedimos los datos al usuario:
        System.out.println("Por favor ingrese el primero valor: ");
        valueA = sc.nextInt();
        System.out.println("Por favor ingrese el segundo valor: ");
        valueB = sc.nextInt();

        // Hacemos la evaluamos del caso punto por punto:
        if ( valueA > valueB ) {
            System.out.println("El primer numero es MAYOR que el segundo: " + valueA + " > " + valueB);
        } else if( valueA < valueB ) {
            System.out.println("El primer numero es MENOR que el segundo: " + valueA + " < " + valueB);
        } else if ( valueA == valueB ) {
            System.out.println("Los dos números son IGUALES: " + valueA + " = " + valueB);
        } else {
            System.out.println("No se cumple ninguna condicion de las planteadas.");
        }

    }
}
