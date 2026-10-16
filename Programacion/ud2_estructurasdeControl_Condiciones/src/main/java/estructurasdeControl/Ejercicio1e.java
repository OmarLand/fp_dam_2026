package estructurasdeControl;

import java.util.Scanner;

/**
 * Ejercicio1r:
 * Leer dos números enteros y diga si al menos uno de los dos es mayor de 10.
 *  
*/

public class Ejercicio1e {
    public static void main(String[] args) {
        
        //Inicializamos las variables:
        int valueA, valueB, evalu = 10;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que valida si al menos uno de los numeros dados son mayores que 10 #");
        
        //Pedimos los datos al usuario
        System.out.println("Por favor ingrese el primer valor:");
        valueA = sc.nextInt();
        System.out.println("Por favor ingrese el segundo valor:");
        valueB = sc.nextInt();

        // Evaluamos:
        if ( valueA > evalu || valueB > evalu ) {
            System.out.println("Uno de los valores ingresados es mayor de: " + evalu);            
        } else {
            System.out.println("Ninguno de los números ingresados son mayor que: " + evalu);            
        } 
        
    }
}
