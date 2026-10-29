package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Hacer un programa que permita calcular el sueldo final de los vendedores 
 * de un concesionario de coches. Para cada uno se introducira: sueldo base, 
 * cantidad de horas extras realizadas y cantidad de ventas. 
 * El sueldo final será el sueldo base más las horas extras 
 * (se pagan a 100€ la hora) y un plus, en función de las ventas: 
 * entre 10 y 20 ventas = 500#, 
 * entre 21 y 30 ventas = 1000€, 
 * y si supera las 30 ventas = 1300€. 
 * Despues de tratar cada vendedor se preguntará al usuario y hay más vendedores 
 * a tratar, finalizado el programa si contesta negativamente. 
 * Al final el programa mostrará el total de ventas del consecionario y el salario 
 * final del vendedor que más ventas ha realizado 
 * (supón que al menos introducen los datos de un empleado) 
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Variables de cada vendedor
        double sueldoBase, sueldoFinal, plus;
        int horasExtras, ventas;

        // Variables generales del concesionario
        int totalVentas = 0;
        int maxVentas = -1;
        double sueldoMaxVentas = 0;

        String respuesta;

        do {
            // Pedimos los datos del vendedor
            System.out.println("Introduce el sueldo base:");
            sueldoBase = sc.nextDouble();

            System.out.println("Introduce las horas extras realizadas:");
            horasExtras = sc.nextInt();

            System.out.println("Introduce la cantidad de ventas:");
            ventas = sc.nextInt();

            // Calculamos el plus según las ventas
            if (ventas >= 10 && ventas <= 20) {
                plus = 500;
            } else if (ventas >= 21 && ventas <= 30) {
                plus = 1000;
            } else if (ventas > 30) {
                plus = 1300;
            } else {
                plus = 0;
            }

            // Calculamos el sueldo final
            sueldoFinal = sueldoBase + (horasExtras * 100) + plus;

            System.out.println("El sueldo final del vendedor es: "
                    + sueldoFinal + " euros.");

            // Acumulamos las ventas del concesionario
            totalVentas += ventas;

            // Comprobamos si es el vendedor con más ventas
            if (ventas > maxVentas) {
                maxVentas = ventas;
                sueldoMaxVentas = sueldoFinal;
            }

            // Preguntamos si hay más vendedores
            System.out.println("¿Hay más vendedores? (s/n)");
            respuesta = sc.next();

        } while (respuesta.equalsIgnoreCase("s"));

        // Mostramos los resultados finales
        System.out.println("Total de ventas del concesionario: "
                + totalVentas);

        System.out.println("Sueldo final del vendedor con más ventas: "
                + sueldoMaxVentas + " euros.");

        sc.close();
    }
}
