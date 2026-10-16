package estructurasdeControl;

import java.util.Scanner;

/**
* Realizar un programa al que se le introduzcan DIA, MES, AÑO, que calcule el dia siguiente.
* Suponemos que los valores son correctos, sin emplear las clases de fechas de JAVA.
* Nota importante: Hay que hacer un tratamiento diferente según sea fin de año, 
* fin de mes (no fin de año) o un día no fin de mes. 
*/

/**
 *
 * @author OmarjLand
 */
public class Ejercicio11 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int dia, mes, anio;
        int diasMes = 0;

        System.out.print("Introduce el día: ");
        dia = sc.nextInt();

        System.out.print("Introduce el mes: ");
        mes = sc.nextInt();

        System.out.print("Introduce el año: ");
        anio = sc.nextInt();

        // Calculamos los días del mes
        if (mes == 2) {
            if ((anio % 4 == 0 && anio % 100 != 0)
                    || anio % 400 == 0) {
                diasMes = 29;
            } else {
                diasMes = 28;
            }
        } else if (mes == 4 || mes == 6
                || mes == 9 || mes == 11) {
            diasMes = 30;
        } else {
            diasMes = 31;
        }

        // Calculamos el día siguiente
        if (dia == 31 && mes == 12) {
            // Fin de año
            dia = 1;
            mes = 1;
            anio++;
        } else if (dia == diasMes) {
            // Fin de mes, pero no de año
            dia = 1;
            mes++;
        } else {
            // Día normal: no es fin de mes
            dia++;
        }

        System.out.println("El día siguiente es: "
                + dia + "/" + mes + "/" + anio);

        sc.close();
    }
}
