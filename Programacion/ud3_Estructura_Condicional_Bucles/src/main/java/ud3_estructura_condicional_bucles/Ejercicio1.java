package ud3_estructura_condicional_bucles;

/**
 * Ejercicio1
 * Mostrar por pantalla la frase "Esto es un Bucle" 10 veces.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        
        System.out.println("### Programa que imprimi un bucle de 10 Repeticiones ###");
        

        // Aplicamos ciclo for y declaramos solo la variable i dentro 
        // del ciclo.
        for (int i =1; i <= 10 ; i++) {
            System.out.println("Esto es un bucle: " + i);
        }

    }
}