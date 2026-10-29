
package ud3_estructura_condicional_bucles;

/**
 * Mostrar las tablas de multiplicar del 1 al 9.
*/

public class Ejercicio18 {
    public static void main(String[] args) {
        
        for ( int tabla = 1; tabla <= 9; tabla++ ) {
            
            System.out.println("Tabla del: " + tabla);
            
            for ( int numero = 1; numero <=10; numero++ ) {
                System.out.println( tabla + " x " + numero + " = " + (tabla*numero));
            }

            System.out.println();
        }

    }
}