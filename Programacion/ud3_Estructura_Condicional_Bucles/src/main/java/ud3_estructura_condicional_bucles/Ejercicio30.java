package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Modificar el programa anterior, para que si un cliente introduce un numero 
 * negativo o mayor que 10 le informe de su error y le obligue a meter 
 * correctamente las entradas que desea, las veces que sea necesario hasta que 
 * lo haga  bien.
 */

public class Ejercicio30 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int entradas;
        int compra;
        int maxCompra = 0;

        System.out.println("¿Cuántas entradas hay a la venta?");
        entradas = sc.nextInt();

        while (entradas <= 0) {
            System.out.println("Error. Introduce una cantidad positiva:");
            entradas = sc.nextInt();
        }

        while (entradas > 0) {

            System.out.println("Entradas disponibles: " + entradas);
            System.out.println("¿Cuántas entradas quieres comprar? (Máximo 10)");
            compra = sc.nextInt();

            while (compra < 1 || compra > 10 || compra > entradas) {

                System.out.println("Error: cantidad de entradas no válida.");

                if (compra < 1 || compra > 10) {
                    System.out.println(
                            "Debes introducir una cantidad entre 1 y 10.");
                } else {
                    System.out.println(
                            "No quedan suficientes entradas disponibles.");
                }

                System.out.println("Introduce de nuevo la cantidad:");
                compra = sc.nextInt();
            }

            entradas = entradas - compra;

            if (compra > maxCompra) {
                maxCompra = compra;
            }

            System.out.println("Compra realizada correctamente.");
        }

        System.out.println("Se han agotado las entradas.");
        System.out.println("La mayor compra ha sido de "
                + maxCompra + " entradas.");

        sc.close();
    }
}
