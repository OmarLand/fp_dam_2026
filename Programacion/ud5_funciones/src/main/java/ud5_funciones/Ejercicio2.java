package ud5_funciones;

import java.util.Scanner;

/**
 *Programa que presente un menú y permita calcular repetidas veces:
 * a) El área de un circulo - Necesitará el Radio.
 * b) El área de un cuadrado - Necesitará el lado.
 * c) El área de un triangulo - Necesitará Base y Altura.
 * d) Salir.
 * Usar funciones para cada una de las 3 opciones.
 */
public class Ejercicio2 {
    
     // Función para calcular el área del círculo
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    // Función para calcular el área del cuadrado
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    // Función para calcular el área del triángulo
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
 
    public static void main(String[] args) {
     
        // Inicializamos variables:
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENU DE AREAS ---");
            System.out.println("1. Area del círculo");
            System.out.println("2. Area del cuadrado");
            System.out.println("3. Area del triangulo");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opcion:");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Introduce el radio:");
                    double radio = sc.nextDouble();

                    System.out.println("Area del círculo: " + areaCirculo(radio));
                    break;

                case 2:
                    System.out.println("Introduce el lado:");
                    double lado = sc.nextDouble();

                    System.out.println("Area del cuadrado: " + areaCuadrado(lado));
                    break;

                case 3:
                    System.out.println("Introduce la base:");
                    double base = sc.nextDouble();

                    System.out.println("Introduce la altura:");
                    double altura = sc.nextDouble();

                    System.out.println("Area del triángulo: " + areaTriangulo(base, altura));
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion incorrecta. Intentalo de nuevo.");
            }

        } while (opcion != 4);

        sc.close();
        
    }
    
}
