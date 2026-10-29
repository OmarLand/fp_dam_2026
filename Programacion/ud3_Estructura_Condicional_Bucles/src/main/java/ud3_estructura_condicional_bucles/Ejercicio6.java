package ud3_estructura_condicional_bucles;

/**
 * Diseñar un pograma que muestre los números pares comprendidos entre 100 y 1
 * en orden descendente.
*/

public class Ejercicio6 {

    public static void main(String[] args) {   
        System.out.println("### Programa de cuenta de numeros pares de forma regresiva desde 100 al 1 ###");
 
        // Evaluamos en un FOR los números pares desde el 100 es forma descendente:
        for(int i = 100; i>=1; i-=2 ){
            // Mostramos al usuario el conteo regresivo
            System.out.println("--> " + i);
        }
    }
}
