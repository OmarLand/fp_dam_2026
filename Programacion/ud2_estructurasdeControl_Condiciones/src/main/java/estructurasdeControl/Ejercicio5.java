package estructurasdeControl;

import java.util.Scanner;

/**
 * Diseñar un algoritmo al que se le introduzca la cantidad de horas minutos y segundo,
 * mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de segundos transcurridos desde el comienzo del día. 
 * NOTA: No emplear las clases de fecha de Java.
 * 23:59:57 será una hora correcta y 25:61:88 será una hora incorrecta
 */

/**
 *
 * @author OmarjLand
 */
public class Ejercicio5 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        int horas, minutos, segundos;

        System.out.print("Introduce las horas: ");
        horas = sc.nextInt();

        System.out.print("Introduce los minutos: ");
        minutos = sc.nextInt();

        System.out.print("Introduce los segundos: ");
        segundos = sc.nextInt();

        if (horas >= 0 && horas <= 23 &&
            minutos >= 0 && minutos <= 59 &&
            segundos >= 0 && segundos <= 59) {

            int totalSegundos = horas * 3600
                              + minutos * 60
                              + segundos;

            System.out.println("Hora correcta.");
            System.out.println("Segundos transcurridos desde "
                             + "el comienzo del día: "
                             + totalSegundos);
        } else {
            System.out.println("Hora incorrecta.");
        }

        sc.close();
    }
}
