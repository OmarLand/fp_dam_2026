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
 * Version 2:
 * [(Ejemplo: info@clientes.mundo-r.com mostraria clientes.mundo-r)] 
*/

public class Ejercicio5b {

    public static void main(String[] args) {
        
        // Inicializamos las variables:
        Scanner sc = new Scanner(System.in);

        // Pedimos el dato al usuario:
        System.out.println("Introduce un email:");
        String email = sc.nextLine();

        // Inicializamos variable y procesamos directamente.
        int arroba = email.indexOf('@');
        int punto = email.lastIndexOf('.');
        String dominio = email.substring(arroba + 1, punto);

        // Mostramos resultado al usuario:
        System.out.println("El dominio es: " + dominio);

        sc.close();    
    }

}
