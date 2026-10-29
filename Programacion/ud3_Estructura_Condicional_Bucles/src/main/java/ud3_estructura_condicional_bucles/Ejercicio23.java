package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Programa que permita introducir números y nos muestre el resultado de sumamos, 
 * hasta que introduzca un numero mayor que 1000. Si no se introduce un 
 * numero mayor que 1000 el programa finalizará después de introducidos 15 números.
 * (OJO: es fácil equivocarse y hacer que solicite un numero de más 
 * o bien nos sume correctamente.)
 */

public class Ejercicio23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        while (contador < 15) {

            System.out.println("Introduce un número:");
            numero = sc.nextInt();

            if (numero > 1000) {
                break;
            }

            suma += numero;
            contador++;
        }

        System.out.println("La suma de los números es: " + suma);
        System.out.println("Cantidad de números sumados: " + contador);

        sc.close();
    }
}
