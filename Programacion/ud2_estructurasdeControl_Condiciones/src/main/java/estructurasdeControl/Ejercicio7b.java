package estructurasdeControl;

import java.util.Scanner;

/***
 * VERSION SOFISTICADA:
 * Realizar un programa que informe si un año introducido previamente es bisiesto o no. 
 * Son bisiestos los años múltiplos de 4 que no sean múltiplos de 100. 
 * Como excepción los múltiplos de 400 también son bisiestos. 
 * Se puede hacer una primera versión con varias sentencias condicionales y 
 * otra más sofisticada con una sola. 
 * NOTA: No usar las clases de fechas de Java.
 */

/**
 *
 * @author OmarjLand
 */
public class Ejercicio7b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anio;

        System.out.print("Introduce un año: ");
        anio = sc.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0)
                || anio % 400 == 0) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }

        sc.close();
    }
}
