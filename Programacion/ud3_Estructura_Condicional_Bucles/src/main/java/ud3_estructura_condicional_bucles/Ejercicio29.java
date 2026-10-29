package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Hacer un programa para llevar el control de venta de entradas. 
 * Lo primero que ha de hacer es pedir la cantidad de entradas que se pondrán 
 * a la venta, después irá solicitando la cantidad de entradas que quiere 
 * comprar, estando limitado a un máximo de 10 por cliente. 
 * El programa finalizará cuando se agoten las entradas mostrando la cantidad 
 * de entradas que se ha llevado el que más ha comprado.
 * Nota: Pensar primero el bucle y luego lo que hay que hacer en cada iteración.
 */

public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entradas;
        int compra;
        int maxCompra = 0;

        // Pedimos la cantidad inicial de entradas
        System.out.println("¿Cuántas entradas hay a la venta?");
        entradas = sc.nextInt();

        // Validamos que haya entradas disponibles
        while (entradas <= 0) {
            System.out.println("Introduce una cantidad positiva:");
            entradas = sc.nextInt();
        }

        // Vendemos entradas hasta agotar las existencias
        while (entradas > 0) {

            System.out.println("Entradas disponibles: " + entradas);
            System.out.println("¿Cuántas entradas quieres comprar? (Máximo 10)");
            compra = sc.nextInt();

            // Validamos la compra
            while (compra < 1 || compra > 10 || compra > entradas) {
                System.out.println("Cantidad no válida.");
                System.out.println("Puedes comprar entre 1 y "
                        + Math.min(10, entradas) + " entradas.");
                compra = sc.nextInt();
            }

            // Actualizamos las entradas disponibles
            entradas -= compra;

            // Comprobamos si es la compra más grande
            if (compra > maxCompra) {
                maxCompra = compra;
            }

            System.out.println("Compra realizada correctamente.");
        }

        // Mostramos el resultado final
        System.out.println("Se han agotado las entradas.");
        System.out.println("La mayor compra ha sido de "
                + maxCompra + " entradas.");

        sc.close();
    }
}
