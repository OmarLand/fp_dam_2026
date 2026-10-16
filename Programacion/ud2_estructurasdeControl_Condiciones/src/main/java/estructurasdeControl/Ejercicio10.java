package estructurasdeControl;

import java.util.Scanner;

/**
 * Realizar un programa al que se le introduzcan DIA, MES, AÑO, 
 * que verifique que los valores introducidos sean correctos, 
 * sin emplear las clases de fechas en JAVA.
 * Nota importante: Si primero Calculamos los días que tiene un mes/año, 
 * luego será muy fácil la verificación de la fecha.
 * /

/**
 *
 * @author OmarjLand
 */
public class Ejercicio10 {
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

        if (mes >= 1 && mes <= 12 && anio > 0) {

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

            if (dia >= 1 && dia <= diasMes) {
                System.out.println("La fecha es correcta.");
            } else {
                System.out.println("La fecha es incorrecta.");
            }

        } else {
            System.out.println("La fecha es incorrecta.");
        }

        sc.close();
    }
}
