package estructurasdeControl;


import java.util.Scanner;

/**
 * Ejercicio1j
 * Leer dos números enteros y diga si el menor de ellos es divisor del mayor (prevenir divisiones por
 */

public class Ejercicio1j {

    public static void main(String[] args) {

        // Inicializamos Variables:
        int valueA, valueB;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Sistema que valida si el menor de dos numeros es divisor del mayor #");

        //Pedimos los datos al usuario:
        System.out.println("Ingrese el primer numero: ");
        valueA = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        valueB = sc.nextInt();

        // Evaluamos las condiciones:
        if ((valueA < valueB && valueA != 0 && valueB % valueA == 0) || (valueB < valueA && valueB != 0 && valueA % valueB == 0)) {
            System.out.println("El menor de los numeros es divisor del mayor.");
        } else {
            System.out.println("El menor de los numeros NO es divisor del mayor.");
        }
        
        sc.close();
    }

}
