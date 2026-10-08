package ud1_conceptosbasicos;

import java.util.Scanner;

/**
 * Ejercicio8
 * Diseñar un programa al que se le introduzcan las edades de cuatro personas y nos calcule
 * la media de edad de los mismos.
 */

public class Ejercicio8 {
    public static void main(String[] args) {

        // Inicializamos variables
        int prom, per1, per2, per3, per4;
        Scanner sc = new Scanner(System.in);

        System.out.println(" - Promedio de edades de Cuatro Personas - ");
        
        // Solicitamos los datos por teclado al usuario:
        System.out.println("Ingrese la edad de la Persona - 1");
        per1 = sc.nextInt();
        System.out.println("Ingrese la edad de la Persona - 2");
        per2 = sc.nextInt();
        System.out.println("Ingrese la edad de la Persona - 3");
        per3 = sc.nextInt();
        System.out.println("Ingrese la edad de la Persona - 4");
        per4 = sc.nextInt();

        // Hacemos el calculo:
        prom = (per1 + per2 + per3 + per4)/4;

        // Mostramos resultados:
        System.out.println("El promedio de las edades introducidas es de: " + prom + " años de edad.");
        
    }
}
