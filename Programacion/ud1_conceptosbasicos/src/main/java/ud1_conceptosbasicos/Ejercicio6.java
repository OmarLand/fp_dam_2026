package ud1_conceptosbasicos;

import java.util.Scanner;

/**
 * El coste de un automovil nuevo para un comprador es la suma total del coste de fábrica del vehiculo,
 * más el porcentaje de la ganancia de la tienda (que se aplica sobre el coste de fábrica) y añadiendole
 * finalmente los impuestos estatales aplicables (sobre el precio de venta calculado ya con beneficio de la tienda).
 * 
 * Suponiendo una garantía de tienda del 10%, y un impuesto del 20%, realiza un programa que lea por consola
 * el coste inicial del automóvil y calcule el coste para el consumidor.
 */

/**
 *
 * @author OmarjLand
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        
        // Definimos variables:
        Scanner sc = new Scanner(System.in);
        float preCoche, preCocheFinal, preCocheGaran, preCocheImpu;
        final float tiendaGara = 0.1f;
        final float tiendaImpu = 0.2f;

        // Pedidos los datos al cliente
        System.out.println("# Bienvenido a tu Consecionario UltraMovil 2000 #");
        System.out.println("Ingrese por favor el precio del Vehiculo: ");
        preCoche = sc.nextInt();
        
        // Calculamos la Garantía y el Impuesto a aplicar el Coche
        preCocheGaran = preCoche * tiendaGara;
        preCocheImpu  = preCoche * tiendaImpu;
        
        // Hacemos un desglose de coste + garantia e impuestos
        System.out.println("Precio Vehiculo: ");
        System.out.println("Garantia: " + preCocheGaran);
        System.out.println("Impuesto: " + preCocheImpu);
        
        // Hacemos el calculo final añadiendo Impuestos y Garantía al precio del Coche
        preCocheFinal = preCoche + preCocheGaran + preCocheImpu;
        
        // Mostramos resultados
        System.out.println("El precio final del coche incluyendo Garantia de tienda e impuestos es de: " + preCocheFinal);
        System.out.println("Gracias por Usar este Software 1.0");
        
        
    }
}
