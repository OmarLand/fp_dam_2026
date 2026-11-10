package ud5_funciones;

import java.util.Scanner;

/**
 * Hacer una función llamada calcularDiasMes(), que se le pase como parámetro 
 * un año y un mes y devuelva los días que tiene ese mes, teniendo en cuenta 
 * los años bisiestos. A continuación, realizar un programa al que se le
 * introduzca una fecha y nos informe de los días pasados desde el 1 de enero 
 * de ese año (no usar clases Java de fechas)
 */

public class Ejercicio3 {

     // Función que devuelve los días que tiene un mes
    public static int calcularDiasMes(int anio, int mes) {

        switch (mes) {
            case 1,3,5,7,8,10, 12:
                return 31;
            case 4,6,9,11:
                return 30;

            case 2:
                if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return -1;
        }
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dia, mes, anio;
        int diasPasados = 0;

        System.out.println("Introduce el día:");
        dia = sc.nextInt();

        System.out.println("Introduce el mes:");
        mes = sc.nextInt();

        System.out.println("Introduce el año:");
        anio = sc.nextInt();

        // Comprobar que el mes sea válido
        if (mes < 1 || mes > 12 || anio <= 0) {
            System.out.println("Fecha incorrecta.");
        } else {

            int diasMes = calcularDiasMes(anio, mes);

            // Comprobar que el día sea válido
            if (dia < 1 || dia > diasMes) {
                System.out.println("Fecha incorrecta.");
            } else {

                // Sumar los días de los meses anteriores
                for (int i = 1; i < mes; i++) {
                    diasPasados += calcularDiasMes(anio, i);
                }

                // Sumar los días transcurridos del mes actual
                diasPasados += dia - 1;

                System.out.println("Días pasados desde el 1 de enero: " + diasPasados);
            }
        }

        sc.close();
    }
    
}
