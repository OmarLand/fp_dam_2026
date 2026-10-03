package ud1_conceptosbasicos;

import java.util.Scanner;

// Realiza un programa que lea por consola dos numeros enteros (sin decimales) y nos muestre los resultados de sumar, restar y dividir 
// dichos números. Comprueba que la división responde con decimales.

public class Ejercicio3 {

    public static void main(String[] args) {

        // Inicializamos los valores
        int numA, numB; 
        int resultSum, resultRest, resultMulti, resultDiv;
        Scanner sc = new Scanner(System.in);

        System.out.println("### Sistema de Cálculo básico de Dos números enteros 1.0 ###");

        // Capturamos los datos por teclado
        System.out.println("Por favor ingrese el primer numero:");
        numA = sc.nextInt();

        System.out.println("Ahora, ingrese el segundo numero:");
        numB = sc.nextInt();

        // Hacemos los Calculos correspondientes:
        // Suma, resta, multiplicación y división (con su validación que no puede haber numero divisible entre CERO)

        resultSum   = numA + numB;
        resultRest  = numA - numB;
        resultMulti = numA * numB;
        
        // Mostramos los resultados
        System.out.println("> La Suma de los valores: " + numA + " + " + numB + " es de: " + resultSum);
        System.out.println("> La Resta de los valores: " + numA + " - " + numB + " es de: " + resultRest);
        System.out.println("> La Multiplicacion de los valores: " + numA + " * " + numB + " es de: " + resultMulti);
        
        // Validamos que el numB no sea CERO para poder dividir
        if( numB == 0 ){
            System.out.println( "No se puede dividir numeros entre el valor CERO ( 0 )" );
        } else {
            //Hacemos el calculo luego de que se cumpla que el valor de numB no sea CERO
            resultDiv = numA / numB;
            System.out.println("> La División de los valores: " + numA + " / " + numB + " es de: " + resultDiv);
        }
        
        // Cerramos la funcion sc que lee los valores.
        sc.close();
    }

}
