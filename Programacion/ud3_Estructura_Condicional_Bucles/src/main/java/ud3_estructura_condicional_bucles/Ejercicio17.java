
package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Diseñar un algoritmo al que se le introduzcan las notas de un alumno
 * en los nueve modulos de un ciclo y nos informe si puede ir a la FCT
 * (todos aprobados). ¿Habría que solicitarle al usuario siempre
 * las notas de los nueve modulos?
*/

public class Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double nota;
        boolean todosAprobados = true;

        for (int i = 1; i <= 9; i++) {
            System.out.println("Introduce la nota del módulo " + i + ":");
            nota = sc.nextDouble();

            if (nota < 5) {
                todosAprobados = false;
            }
        }

        if (todosAprobados) {
            System.out.println("El alumno puede ir a la FCT.");
        } else {
            System.out.println("El alumno no puede ir a la FCT.");
        }

        sc.close();
        
    }
}
