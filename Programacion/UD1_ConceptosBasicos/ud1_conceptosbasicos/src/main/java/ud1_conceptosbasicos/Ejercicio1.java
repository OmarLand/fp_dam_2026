package ud1_conceptosbasicos;

import java.util.Scanner;

// Ejercicio 1
// Realiza un programa que lea por consola un valor en euros y lo convierta a dólares
// (Suponer que 1 euro es igual a 1,14 dolares).

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float cash, converter;

        // Presentamos programa:
        System.out.println("# Conversor de Monedas: Euros a Dolares 1.0 #");

        // Pedidos datos al usuario:
        System.out.println(" Por favor ingrese la cantidad de euros a convertir en dolares: ");
        cash = sc.nextFloat();

        // Hacemos el calculo:
        converter = cash * 1.14f;

        System.out.println("El valor de: " + cash + " euros " + " es de " + converter + " dolares.\n" );
        System.out.println("### Gracias por usar Software de Conversiób 1.0 ###" );
        System.out.println("### Desarrollado por Omar Landaeta - FP. DAM - Programación - Grupo A ###\n" );

        sc.close();
    }
}