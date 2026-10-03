package ud1_conceptosbasicos;

import java.util.Scanner;

// Realiza un programa que lea por consola un valor en dolares y lo convierta a euros
// (suponer que 1 euro es igual a 1,14 dolares)

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float cash, converter;

        // Presentamos programa:
        System.out.println("# Conversor de Monedas: Dolares a Euros 1.0 #");

        // Pedidos datos al usuario:
        System.out.println(" Por favor ingrese la cantidad de Dolares a convertir en Euros: ");
        cash = sc.nextFloat();

        // Hacemos el calculo:
        converter = cash / 1.14f;

        System.out.println("El valor de: " + cash + " Dolares " + "es de " + converter + " Euros.\n" );
        System.out.println("### Gracias por usar Software de Conversión 1.0 ###" );
        System.out.println("### Desarrollado por Omar Landaeta - FP. DAM - Programación - Grupo A ###\n" );

        sc.close();
    }
}

