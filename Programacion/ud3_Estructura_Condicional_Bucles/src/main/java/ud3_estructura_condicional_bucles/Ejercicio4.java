package ud3_estructura_condicional_bucles;

import java.util.Scanner;

/**
 * Diseñar un programa capaz de leer un valor entero, 
 * que verifique que esté comprendido entre 1 y 10, 
 * y mostrar su tabla de multiplicar. 
*/

public class Ejercicio4 {
    public static void main(String[] args) {
        
        // Iniciamos las variables:
        int valueTabla;
        Scanner sc = new Scanner(System.in);
        char cont='s';
        
        while ( cont=='s' || cont=='S' ) {

            System.out.println("### Programa de Tabla d Multiplicar ###");
            //Pedimos el numero al usuario:
            System.out.println("Dime que tabla quieres que calcule: ");
            valueTabla = sc.nextInt();
    
            if ( valueTabla >= 1 && valueTabla <= 10 ) {
                for( int i = 1; i <= 10; i++ ){
                    System.out.println("> " + valueTabla + " x " + i + " = " + (i*valueTabla) );
                }
            } else {
                System.out.println("El valor ingresado no está entre el 1 y el 10.");
                System.out.println("Vuelva intentarlo. \n");
            }
    
            System.out.println("Desea reiniciar el programa? S/N ");
            cont = sc.next().charAt(0);
            
        }

        System.out.println("Programa finalizado, gracias por TablaMatemáticas 1.0.");
        sc.close();
    }
}
