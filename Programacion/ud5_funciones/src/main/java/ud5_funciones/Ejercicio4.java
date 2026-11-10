package ud5_funciones;

import java.util.Scanner;

/**
 * Partiendo de la función del programa anterior, hacer un programa 
 * a que se le introduzcan dos fechas del mismo año y nos informe de los 
 * días comprendidos entre ellas (no usar clases Java de fechas)
 */

public class Ejercicio4 {

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
    
    // Función que calcula los días transcurridos desde el 1 de enero
    public static int diasDesdeEnero(int dia, int mes, int anio) {

        int dias = 0;

        for (int i = 1; i < mes; i++) {
            dias += calcularDiasMes(anio, i);
        }

        dias += dia - 1;

        return dias;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int dia1, mes1, dia2, mes2, anio;
        int diasFecha1, diasFecha2;

        System.out.println("Introduce el anio:");
        anio = sc.nextInt();

        System.out.println("Introduce la primera fecha.");
        System.out.println("Dia:");
        dia1 = sc.nextInt();

        System.out.println("Mes:");
        mes1 = sc.nextInt();

        System.out.println("Introduce la segunda fecha.");
        System.out.println("Día:");
        dia2 = sc.nextInt();

        System.out.println("Mes:");
        mes2 = sc.nextInt();

        // Comprobar que las fechas sean válidas
        if (anio <= 0 ||
            mes1 < 1 || mes1 > 12 ||
            mes2 < 1 || mes2 > 12 ||
            dia1 < 1 || dia1 > calcularDiasMes(anio, mes1) ||
            dia2 < 1 || dia2 > calcularDiasMes(anio, mes2)) {

            System.out.println("Alguna de las fechas es incorrecta.");

        } else {

            // Calcular los días transcurridos desde enero
            diasFecha1 = diasDesdeEnero(dia1, mes1, anio);
            diasFecha2 = diasDesdeEnero(dia2, mes2, anio);

            // Calcular la diferencia entre las fechas
            int diferencia = Math.abs(diasFecha2 - diasFecha1);

            System.out.println("Dias comprendidos entre las dos fechas: " + diferencia);
        }

        sc.close();
        
    }
    
}
