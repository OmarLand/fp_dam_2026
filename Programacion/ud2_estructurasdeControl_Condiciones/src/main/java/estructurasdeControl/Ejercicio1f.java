package estructurasdeControl;

import java.util.Scanner;

/**
 * Ejercicio1f
 * Leer un número entero y decir si está comprendido entre 10 y 20 (ambos incluidos).
 */

public class Ejercicio1f {
    public static void main(String[] args) {

        //Inicializamos las variables:
        int value;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que valida si un numero dado está en el Rango de 10 y 20 (Ambos Incluidos) #");
        
        //Pedimos los datos al usuario
        System.out.println("Por favor ingrese el primer valor:");
        value = sc.nextInt();
        
        // Evaluamos:
        if ( value >= 10 && value <= 20 ) {
            System.out.println("El valor ingresado está en el rango de 10 y el 20 " + value);            
        } else {
            System.out.println("El numero ingresado no está en el ranro del 10 y el 20 " + value);            
        } 
        
        
    }
}