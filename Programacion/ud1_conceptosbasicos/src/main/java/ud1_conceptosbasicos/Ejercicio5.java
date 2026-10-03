package ud1_conceptosbasicos;

import java.util.Scanner;

// Un departamento de climatología ha realizado recientemente su conversión al sistema metrico.
// Diseñar un algoritmo para realizar las siguientes conversiones:
//
// - Leer por consola la temperatura dada en la escala Celsius y moatrar su equivalente farenheit
//   (La formula de conversión es "F= 9/5 * ºC+32"). Resultado redondeado a dos decimales.
// - Leer la cantidad de agua del pluviómetro en pulgadas y mostrar su equivalente en centómetros (25.5mm = 1 Pulgada)
// Resultado redondeado a un decimal


public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float celsius, farenheit, conver, valueC, valueF;

        System.out.println("Sistema de Conversión Cº y Fº - Dpto. Climatología -");
        
        System.out.println("Por favor ingrese el valor de Grados Celsius para convertir a Farenheit");
        valueC = sc.nextFloat();

        System.out.println("Por favor ingrese el valor de Grados Farenheit para convertir a Celsius");
        valueF = sc.nextFloat();

        // Realizamos el calculo climatológico:
        farenheit = (valueC * 9/5) + 32 ;        
        celsius   = (valueF - 32) * 5/9 ; 
        

        System.out.println("La conversión de " + valueC + " Celsius a Farenheit es " + farenheit);
        System.out.println("La conversión de " + valueF + " Farenheit a Celsius es " + celsius);
        
    }

}
