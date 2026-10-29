package ud4_cadenas;

import java.util.Scanner;

/**
 * Realiza un programa al que se le introduzca un email y nos
 * devuelva el nombre del dominio, es decir, lo que está entre el arroba
 * y el punto (Ejemplo: info@mundo-r.com mostraria mundo-r).
 * Opcionalmente, hacer una segunda versión que contemple que 
 * pueda haber varios puntos en el dominio 
 * (Ejemplo: info@clientes.mundo-r.com mostraria clientes.mundo-r). 
 * 
 * Versión 1:
 * [(Ejemplo: info@mundo-r.com mostraria mundo-r)]
*/

public class Ejercicio5a {

    public static void main(String[] args) {
        
        //Inicializo variables:
        Scanner sc = new Scanner(System.in);

        // Pedimos el dato al usuario:
        System.out.println("Introduce un email:");
        String email = sc.nextLine();

        // Inicializamos y procesamos la información
        int arroba = email.indexOf('@');
        int punto = email.indexOf('.', arroba);
        String dominio = email.substring(arroba + 1, punto);

        // Mostramos el resultado:
        System.out.println("El dominio es: " + dominio);

        sc.close();
    }

}
