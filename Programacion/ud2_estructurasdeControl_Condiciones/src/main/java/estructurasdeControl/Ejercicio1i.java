package estructurasdeControl;

import java.util.Scanner;

/**
 * Ejercicio1i
 * Leer dos números enteros y diga si el segundo es divisor del primero (prevenir divisiones por cero,
 * que causan error) Repasar operadores en cortocircuito para hacer un solo if.
 */

public class Ejercicio1i {
    public static void main(String[] args) {

        // Inicializamos las variables.
        int valueA, valueB;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que divide dos numeros enteros y evalua si el segundo es divisor del primero #");
            
        // Pedimos los datos al usuario:
        System.out.println("Ingrese el primer numero: ");
        valueA = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        valueB = sc.nextInt();


        // Evaluamos las condiciones planteadas:

        // Primero evaluamos si el segundo valor es divisor del primero
        if ( valueB !=0 && valueA % valueB == 0 ) {
            System.out.println("El segundo numero es divisor del primero y es divisible entre el primero.");
        } else {
            System.out.println("El segundo numero NO es divisor del primero y no se puede dividir entre 0.");
        }
        
    }
}
