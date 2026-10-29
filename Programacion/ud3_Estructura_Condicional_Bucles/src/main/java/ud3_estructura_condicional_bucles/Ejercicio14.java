package ud3_estructura_condicional_bucles;

/**
 * Diseñar un algoritmo que informe de los numeros perfectos 
 * que hay entre 1 y 10000. Un numero perfecto si es igual a la
 * suma de todos los divisores menores que él.
*/

public class Ejercicio14 {

    public static void main(String[] args) {

        // Recorremos los numeros del 1 al 10000
        for( int value = 1; value <= 10000; value++ ){
            
            int acum = 0;

            // Buscamos los divisores menores que i.
            for( int div=1; div < value ; div++ ){
                if ( value % div == 0 ) {
                    acum += div;
                }
            }

            // Comprobamos si el numero es perfecto:
            if ( acum == value ) {
                System.out.println( value + " Es un numero perfecto." );
            }
        }
    }
}
