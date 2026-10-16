package estructurasdeControl;

import java.util.Scanner;

/**
* Introduciendo dos fechas (día, mes, año), hacer un programa que nos diga 
* cuál de las dos es mayor (agrupa las condiciones de día, mes y año 
* en una sola sentencia condicional). Suponemos que se introducen fechas válidas 
* y no empleamos las clases de fecha de JAVA.
*/

/**
 *
 * @author OmarjLand
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dia1, mes1, anio1;
        int dia2, mes2, anio2;

        System.out.println("Introduce la primera fecha:");
        System.out.print("Día: ");
        dia1 = sc.nextInt();
        System.out.print("Mes: ");
        mes1 = sc.nextInt();
        System.out.print("Año: ");
        anio1 = sc.nextInt();

        System.out.println("Introduce la segunda fecha:");
        System.out.print("Día: ");
        dia2 = sc.nextInt();
        System.out.print("Mes: ");
        mes2 = sc.nextInt();
        System.out.print("Año: ");
        anio2 = sc.nextInt();

        if (anio1 > anio2
                || (anio1 == anio2 && mes1 > mes2)
                || (anio1 == anio2 && mes1 == mes2
                    && dia1 > dia2)) {

            System.out.println("La primera fecha es mayor.");

        } else if (anio1 == anio2 && mes1 == mes2
                && dia1 == dia2) {

            System.out.println("Las dos fechas son iguales.");

        } else {
            System.out.println("La segunda fecha es mayor.");
        }

        sc.close();
    }
}
