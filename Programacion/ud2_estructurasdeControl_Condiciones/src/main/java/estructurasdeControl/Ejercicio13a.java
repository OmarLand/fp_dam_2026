package estructurasdeControl;

import java.util.Scanner;

/**
* [VERSION: IF ANIDADOS]
* Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) 
* y nos muestre por pantalla la nota final en texto, con la siguiente equivalencia:
* - Muy deficiente (0,1,2)
* - Insuficiente   (3,4)
* - Aprobado       (5,6)
* - Notable        (7,8)
* - Sobresaliente  (9,10)
* Haz una versión con if anidados, otra con switch + "case:" y otra con switch + "case->".
*
*/

/**
 *
 * @author OmarjLand
 */

public class Ejercicio13a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.print("Introduce una nota (0-10): ");
        nota = sc.nextInt();

        if (nota >= 0 && nota <= 10) {
            if (nota <= 2) {
                System.out.println("Muy deficiente");
            } else if (nota <= 4) {
                System.out.println("Insuficiente");
            } else if (nota <= 6) {
                System.out.println("Aprobado");
            } else if (nota <= 8) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        } else {
            System.out.println("Nota no válida");
        }
        sc.close();
    } 
}
