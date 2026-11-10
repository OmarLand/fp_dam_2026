package ud5_funciones;

import java.util.Scanner;

/**
 * Realizar funciones que realicen los siguientes supuestos, y un main()
 * desde el que se llame a dichas funciones:
 * 
 * b)  Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos
 * 
 */

public class Ejercicio1b {
    
    // Inicializamos la funcion mayor()
    public static double mayor( double num1, double num2, double num3 ){
        
        if( num1 >= num2 && num1 >= num3 ){
            return num1;
        } else if( num2 >= num1 && num2 >= num3 ){
            return num2;
        } else {
            return num3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        double num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero:");
        double num2 = sc.nextDouble();

        System.out.println("Introduce el tercer numero:");
        double num3 = sc.nextDouble();

        System.out.println("El numero mayor es: " + mayor(num1, num2, num3));

        sc.close();     
    }
}
