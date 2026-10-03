package ud1_conceptosbasicos;

import java.util.Scanner;

// Un departamento de climatología ha realizado recientemente su conversión al sistema metrico.
// Diseñar un algoritmo para realizar las siguientes conversiones:
//
// - Leer por consola la temperatura dada en la escala Celsius y moatrar su equivalente farenheit
//   (La formula de conversión es "F= 9/5 * ºC+32"). Resultado redondeado a dos decimales.
// - Leer la cantidad de agua del pluviómetro en pulgadas y mostrar su equivalente en centímetros (25.5mm = 1 Pulgada)
// Resultado redondeado a un decimal

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float celsius, farenheit, pluvio, valueC, valueF, valuePulg;

        System.out.println("Sistema de Conversión Cº y Fº - Dpto. Climatología -");
        
        // Solicitamos los datos por teclado al usuario:
        System.out.println("Por favor ingrese el valor de Grados Celsius para convertir a Farenheit");
        valueC = sc.nextFloat();
        System.out.println("Por favor ingrese el valor de Grados Farenheit para convertir a Celsius");
        valueF = sc.nextFloat();
        System.out.println("Por favor ingrese la cantidad de agua del pluviómetro [Expresados en Pulgadas]");
        valuePulg = sc.nextFloat();



        // Conversión Celsius a Farenheit:
        farenheit = (valueC * 9.0f/5.0f) + 32 ;
        farenheit = Math.round(farenheit * 100.0f) / 100.0f; // Hacemos el redondeo a dos decimales
        // Conversión Farenheit a Celsius:
        celsius   = (valueF - 32) * 5.0f/9.0f ; 
        celsius   = Math.round( celsius * 100.0f ) / 100.0f; // Hacemos el redondeo a dos decimales
        
        // Nota: Conversion de Pulgadas a Milimetros (En el ejercicio pone Centimetros pero pone la unidad mm)
        pluvio = valuePulg * 25.5f;
        pluvio = Math.round( pluvio * 10.0f )/ 10.0f; // Hacemos el redondeo a 1 digito
        
        // Mostramos resultados 
        System.out.println("La conversión de " + valueC + " Celsius a Farenheit es " + farenheit + " Fº");
        System.out.println("La conversión de " + valueF + " Farenheit a Celsius es " + celsius + " Cº");
        System.out.println("La conversión de " + valuePulg + " Pulgadas a Centimetros es " + pluvio + " cm");
        
    }

}
