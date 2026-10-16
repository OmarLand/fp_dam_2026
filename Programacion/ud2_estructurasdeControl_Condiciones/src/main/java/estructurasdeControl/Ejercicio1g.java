package estructurasdeControl;

import java.util.Scanner;

/**
 * Ejerciciog
 * Leer dos números enteros y diga si uno y solo uno es mayor de 10.
 */

public class Ejercicio1g {
    public static void main(String[] args) {
                
        //Inicializamos las variables:
        int valueA, valueB, evalu = 10;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que valida si al menos un numero y solo uno es mayor de 10 #");
        
        //Pedimos los datos al usuario
        System.out.println("Por favor ingrese el primer valor:");
        valueA = sc.nextInt();
        System.out.println("Por favor ingrese el segundo valor:");
        valueB = sc.nextInt();

        // Evaluamos:
        if ( valueA > evalu ^ valueB > evalu ) {
            System.out.println("Uno de los valores ingresados es mayor de: " + evalu);            
        } else {
            System.out.println("Ninguno de los números ingresados cumple la condición: " + evalu);            
        } 
        
        
    }
}
