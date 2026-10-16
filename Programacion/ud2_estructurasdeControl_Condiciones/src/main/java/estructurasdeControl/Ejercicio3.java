package estructurasdeControl;

import java.util.Scanner;

/**
 * 
 * Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en clase 
 * y la nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna 
 * de las siguientes situaciones:
 * 
 * - Nota examen mayor o igual a 5
 * - Nota examen entre 4 y 5, trabajo en clase mayor qye cinco y trab. práctico mayor que 5
 * - Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la valoración del trabajo en clase.
 * 
 * Diseñar un algoritmo, al que se le introduzcan por consola la nota del examen, 
 * la valoración del trabajo en clase y la nota del trabajo práctico y que saque por pantalla 
 * si está aprobado o no, todo en una sola sentencia condicional.
 * 
 */

/**
 *
 * @author OmarjLand
 */
public class Ejercicio3 {
    public static void main(String[] args) {
                // Inicializamos variables
        double notaExamen, trabajoClase, trabajoPractico;
        Scanner sc = new Scanner(System.in);

        // Pedimos las notas al usuario
        System.out.println("Introduzca la nota del examen: ");
        notaExamen = sc.nextDouble();

        System.out.println("Introduzca la valoracion del trabajo en clase: ");
        trabajoClase = sc.nextDouble();

        System.out.println("Introduzca la nota del trabajo practico: ");
        trabajoPractico = sc.nextDouble();

        // Evaluamos las condiciones
        if (notaExamen >= 5
                || (notaExamen >= 4 && notaExamen < 5
                && trabajoClase > 5 && trabajoPractico > 5)
                || (notaExamen >= 4 && notaExamen < 5
                && (trabajoClase > 8 || trabajoPractico > 8))) {

            System.out.println("El alumno esta APROBADO.");

        } else {

            System.out.println("El alumno esta SUSPENSO.");

        }

        sc.close();
    }
}
