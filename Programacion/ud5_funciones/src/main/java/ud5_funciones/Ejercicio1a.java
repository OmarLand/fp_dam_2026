package ud5_funciones;

import java.util.Scanner;

/**
 * Realizar funciones que realicen los siguientes supuestos, y un main()
 * desde el que se llame a dichas funciones:
 * 
 * a)  Función llamada par() que se le pasa un entero y devuelve true si es par, 
 *     false si no lo es.
 */

public class Ejercicio1a {
    
    public static void main(String[] args) {
        // Inicializamos variables:
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un numero entero a evaluar: ");
        numero = sc.nextInt();
        
        if( par(numero) ){
            System.out.println("El numero es Par.");
        } else {
            System.out.println("El numero es Impar");
        }
        
        sc.close();
    }  
    
    // Creamos la función PAR que comprueba si un numero es PAR
    public static boolean par(int numero){
    
        if( numero % 2 == 0 ){
            return true;
        }   else {
            return false;
        }
    }
    
}
