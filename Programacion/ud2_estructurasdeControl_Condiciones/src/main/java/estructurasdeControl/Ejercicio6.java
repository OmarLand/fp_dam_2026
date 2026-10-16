package estructurasdeControl;

import java.util.Scanner;

/***
 * Desarrollar un sistema de calculo de ecuaciones lineales
 * /

/**
 *
 * @author OmarjLand
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leer los dos conjuntos de coeficientes por teclado
        System.out.println("Introduce los coeficientes del sistema de ecuaciones:");
        System.out.print("Coeficiente a: ");
        double a = sc.nextDouble();
        
        System.out.print("Coeficiente b: ");
        double b = sc.nextDouble();
        
        System.out.print("Coeficiente c: ");
        double c = sc.nextDouble();
        
        System.out.print("Coeficiente d: ");
        double d = sc.nextDouble();
        
        System.out.print("Coeficiente e: ");
        double e = sc.nextDouble();
        
        System.out.print("Coeficiente f: ");
        double f = sc.nextDouble();

        // Calcular el denominador común (ae - bd)
        double denominador = (a * e) - (b * d);

        // Verificar si el algoritmo no funciona (denominador igual a cero)
        if (denominador == 0) {
            System.out.println("\nEl algoritmo no funciona: El denominador (ae - bd) es igual a 0[cite: 2].");
            System.out.println("Esto significa que el sistema de ecuaciones no tiene una solución única (puede ser incompatible o tener infinitas soluciones).");
        } else {
            // Calcular los valores de x e y según las fórmulas
            double x = ((c * e) - (b * f)) / denominador;
            double y = ((a * f) - (c * d)) / denominador;

            // Mostrar los resultados
            System.out.println("\nResultados:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        sc.close();
    }
}
