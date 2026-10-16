package estructurasdeControl;

import java.util.Scanner;

/**
 * Realizar un programa al que se le introduzca la hora del día (0-23) 
 * y nos diga que días de la semana hay salida de bus 
 * (utilizar la tabla del ejercicio anterior)
 **/

/**
 *
 * @author OmarjLand
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Introducir la hora del día (0 a 23)
        System.out.print("Introduce la hora del día (0 a 23): ");
        int hora = sc.nextInt();

        // Verificar la validez de la entrada
        if (hora < 0 || hora > 23) {
            System.out.println("Error: La hora debe estar comprendida entre 0 y 23.");
        } else {
            System.out.println("\nPara las " + hora + ":00 horas, hay bus los siguientes días:");
            
            // Evaluar según la tabla de horarios del bus
            switch (hora) {
                case 10:
                    System.out.println("- Todos los días de la semana (Lunes a Domingo).");
                    break;
                case 14:
                    System.out.println("- Lunes, Martes, Miércoles, Jueves, Viernes y Domingo (todos excepto Sábado).");
                    break;
                case 12:
                    System.out.println("- Jueves y Domingo.");
                    break;
                case 9:
                case 11:
                case 13:
                    System.out.println("- Domingo.");
                    break;
                default:
                    System.out.println("- Ningún día hay bus programado a esta hora.");
                    break;
            }
        }

        sc.close();
    }
}
