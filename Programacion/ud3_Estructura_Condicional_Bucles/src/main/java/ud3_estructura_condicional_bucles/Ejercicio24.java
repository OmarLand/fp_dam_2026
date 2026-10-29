package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Realizar un programa que permita introducir el sexo ('H','M') 
 * y la edad de los 30 trabajadores de una fabrica. El programa debe obligar 
 * a que las edades que se introduzcan estén comprendidas entre 16 y 70 años. 
 * El programa nos mostrará la edad y el sexo del mas joven y también mostrara 
 * la media de edad de las mujeres. Finalmente nos informara si hay alguno con 
 * mas de 60 años. Si se introduce cero como edad el programa terminará en ese 
 * momento sin esperar a que introduzcan los 30 trabajadores.
 */

public class Ejercicio24 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int edad, edadMinima = 71;
        int contador = 0;
        int sumaMujeres = 0, contadorMujeres = 0;
        char sexo, sexoJoven = ' ';
        boolean mayor60 = false;
        boolean finalizar = false;
        double mediaMujeres;

        for (int i = 1; i <= 30 && !finalizar; i++) {

            // Pedimos y validamos el sexo
            do {
                System.out.println("Introduce el sexo del trabajador "
                        + i + " (H/M):");
                sexo = sc.next().toUpperCase().charAt(0);

                if (sexo != 'H' && sexo != 'M') {
                    System.out.println("Sexo no válido. Introduce H o M.");
                }

            } while (sexo != 'H' && sexo != 'M');

            // Pedimos la edad
            System.out.println("Introduce la edad del trabajador "
                    + i + " (0 para terminar):");
            edad = sc.nextInt();

            // Si la edad es cero, terminamos el programa
            if (edad == 0) {
                finalizar = true;

            } else {

                // Validamos la edad
                while (edad < 16 || edad > 70) {
                    System.out.println(
                            "Edad no válida. Debe estar entre 16 y 70.");
                    System.out.println(
                            "Introduce la edad del trabajador "
                            + i + " (0 para terminar):");
                    edad = sc.nextInt();

                    if (edad == 0) {
                        finalizar = true;
                        break;
                    }
                }

                // Procesamos al trabajador si la edad es válida
                if (!finalizar) {

                    contador++;

                    // Buscamos al trabajador más joven
                    if (edad < edadMinima) {
                        edadMinima = edad;
                        sexoJoven = sexo;
                    }

                    // Calculamos la media de edad de las mujeres
                    if (sexo == 'M') {
                        sumaMujeres += edad;
                        contadorMujeres++;
                    }

                    // Comprobamos si hay alguien mayor de 60 años
                    if (edad > 60) {
                        mayor60 = true;
                    }
                }
            }
        }

        // Mostramos los resultados
        if (contador > 0) {
            System.out.println("Edad del trabajador más joven: "
                    + edadMinima);
            System.out.println("Sexo del trabajador más joven: "
                    + sexoJoven);

            if (contadorMujeres > 0) {
                mediaMujeres = (double) sumaMujeres / contadorMujeres;
                System.out.println("Media de edad de las mujeres: "
                        + mediaMujeres);
            } else {
                System.out.println("No se han introducido mujeres.");
            }

            System.out.println("¿Hay algún trabajador mayor de 60 años?: "
                    + mayor60);

        } else {
            System.out.println("No se han introducido trabajadores válidos.");
        }

        sc.close();
    }
}
