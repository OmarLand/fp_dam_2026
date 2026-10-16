package estructurasdeControl;

import java.util.Scanner;

/**
* La tabla siguiente representa las horas de salida de un bus. 
* Diseña un algoritmo al que se le introduzca el día (1-7) y la hora (9-14), 
* verifique la entrada y nos informe si hay bus o no. 
* Hacer una primera condición que haga la verificación de la entrada de datos 
* y otra única condición para ver si hay bus.
*/

/**
 *
 * @author OmarjLand
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Introducir el día (1-7) y la hora (9-14)
        System.out.print("Introduce el día (1 a 7, donde 1=Lunes y 7=Domingo): ");
        int dia = sc.nextInt();

        System.out.print("Introduce la hora (9 a 14): ");
        int hora = sc.nextInt();

        // 1. Primera condición: verificación de la entrada de datos
        if (dia < 1 || dia > 7 || hora < 9 || hora > 14) {
            System.out.println("Error: Datos incorrectos. El día debe estar entre 1 y 7 y la hora entre 9 y 14.");
        } else {
            // 2. Otra única condición que agrupa todos los casos donde sí hay bus según la tabla
            if ((hora == 10) || 
                (hora == 14 && dia != 6) || 
                (hora == 12 && (dia == 4 || dia == 7)) || 
                (dia == 7 && (hora == 9 || hora == 11 || hora == 13))) {
                
                System.out.println("¡Sí hay bus a esa hora y día!");
            } else {
                System.out.println("No hay bus disponible para ese día y hora.");
            }
        }

        sc.close();
    }
}
