package estructurasdeControl;


import java.util.Scanner;

/**
 * Ejercicio1d
 * Leer dos números enteros y diga si los dos son mayores de 10 o no lo son
 */

public class Ejercicio1d {
    public static void main(String[] args) {

        //Inicializamos las variables:
        int valueA, valueB, evalu = 10;
        Scanner sc = new Scanner(System.in);

        System.out.println("# Programa que valida si dos numeros dados son mayores que 10 #");
        
        //Pedimos los datos al usuario
        System.out.println("Por favor ingrese el primer valor:");
        valueA = sc.nextInt();
        System.out.println("Por favor ingrese el segundo valor:");
        valueB = sc.nextInt();

        // Evaluamos:
        if ( valueA > evalu && valueB > evalu ) {
            System.out.println("Los dos números ingresados son mayor que: " + evalu);            
        } else {
            System.out.println("Los dos números ingresados NO son mayor que: " + evalu);            
        } 
        
    }
}
