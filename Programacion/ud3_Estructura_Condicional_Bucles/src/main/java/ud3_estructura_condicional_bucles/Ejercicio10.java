package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Programa al que se le introduzcan las edades de los alumnos (-1 para finalizar)
 * y nos informe si hay algunos menor de edad
 * Nota Importante: En cuanto encuentre un menor de edad, la respuesta va a ser
 * "Si hay alguno" aunque luego sigamos introduciendo edades, esta situación 
 * ya no va cambiar, ojo al hacer el "if". 
*/

public class Ejercicio10 {

    public static void main(String[] args) {
        // Inicializamos las variables:
        int edad = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("# Programa que registra las edades e indica si hay algun menor de edad #");
        
        do{
            System.out.println("Por favor ingrese la edad del alumno:");
            edad = sc.nextInt();

            if (edad > 18) {
                System.out.println("Estudiante registrado");
            } else {
                System.out.println("Si hay algun menor de edad.");
            }
        }while( edad > 0 );
    }
    
}
