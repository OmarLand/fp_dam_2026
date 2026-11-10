package ud5_funciones;

import java.util.Scanner;

/**
 * Realizar un programa al que se le introduzcan dos números enteros 
 * positivos y nos diga cual de los dos tiene mas divisores 
 * (usar función previa)
 */

public class Ejercicio8 {

    // Inicializamos la funcion y pasamos numero por parametro
    public static int cantidadDivisores(int numero) {

        if (numero < 0) {
            return 0;
        }

        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }

        return contador;
    }
    
    
    // Comprueba si un número es positivo
    public static boolean esPositivo(int numero) {
        return numero > 0;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;

        // Pedimos el primer número hasta que sea positivo
        do {
            System.out.print("Introduce el primer numero positivo: ");
            num1 = sc.nextInt();

            if (!esPositivo(num1)) {
                System.out.println("Error: el numero debe ser positivo.");
            }

        } while (!esPositivo(num1));

        // Pedimos el segundo número hasta que sea positivo
        do {
            System.out.print("Introduce el segundo numero positivo: ");
            num2 = sc.nextInt();

            if (!esPositivo(num2)) {
                System.out.println("Error: el numero debe ser positivo.");
            }

        } while (!esPositivo(num2));

        // Calculamos la cantidad de divisores
        int divisores1 = cantidadDivisores(num1);
        int divisores2 = cantidadDivisores(num2);

        // Comparamos los resultados
        if (divisores1 > divisores2) {
            System.out.println(num1 + " tiene más divisores que " + num2);
        } else if (divisores2 > divisores1) {
            System.out.println(num2 + " tiene mas divisores que " + num1);
        } else {
            System.out.println("Los dos numeros tienen el mismo numero de divisores.");
        }

        sc.close();
    }
    
}
