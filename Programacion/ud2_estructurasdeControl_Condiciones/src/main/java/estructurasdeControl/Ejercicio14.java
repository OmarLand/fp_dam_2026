package estructurasdeControl;

import java.util.Scanner;

/**
* Diseña un algoritmo capaz de obtener la letra del DNI a partir del número de DNI. 
* Consiste en dividir dicho número entre 23 y tomar el resto de la división 
* asignándole la letra correspondiente según la siguiente tabla (Hacer un switch,
* no empleando ni arrays in string).
*/

/**
 * @author OmarjLand
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Introducir el número de DNI por teclado
        System.out.print("Introduce el número de DNI: ");
        int dni = sc.nextInt();

        // Calcular el resto de dividir el número entre 23
        int resto = dni % 23;
        char letra = ' ';

        // Asignar la letra correspondiente usando switch (sin arrays ni String)
        switch (resto) {
            case 0:  letra = 'T'; break;
            case 1:  letra = 'R'; break;
            case 2:  letra = 'W'; break;
            case 3:  letra = 'A'; break;
            case 4:  letra = 'G'; break;
            case 5:  letra = 'M'; break;
            case 6:  letra = 'Y'; break;
            case 7:  letra = 'F'; break;
            case 8:  letra = 'P'; break;
            case 9:  letra = 'D'; break;
            case 10: letra = 'X'; break;
            case 11: letra = 'B'; break;
            case 12: letra = 'N'; break;
            case 13: letra = 'J'; break;
            case 14: letra = 'Z'; break;
            case 15: letra = 'S'; break;
            case 16: letra = 'Q'; break;
            case 17: letra = 'V'; break;
            case 18: letra = 'H'; break;
            case 19: letra = 'L'; break;
            case 20: letra = 'C'; break;
            case 21: letra = 'K'; break;
            case 22: letra = 'E'; break;
            default:
                System.out.println("Resto no válido.");
                break;
        }

        // Mostrar el resultado de la letra obtenida[cite: 4]
        if (resto >= 0 && resto <= 22) {
            System.out.println("La letra correspondiente para el resto " + resto + " es: " + letra);
            System.out.println("El DNI completo es: " + dni + letra);
        }

        sc.close();
    }
}
