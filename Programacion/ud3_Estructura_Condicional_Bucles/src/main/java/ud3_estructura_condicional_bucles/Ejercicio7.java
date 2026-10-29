package ud3_estructura_condicional_bucles;

/**
 * Corregir y comentar del Ejercicio propuesto  en el PDF
*/

public class Ejercicio7 {

    public static void main(String[] args) {
        
        // Inicializamos las variables
        int num;
      
        num = Integer.parseInt(IO.readln("Introduce un número natural entre 1 y 1000: "));

        IO.println("--".repeat(20));
        
        // En esta condición no puede haber un numero que sea menor de 0 y mayor de 1000
        // Por lo tanto se procede a reemplazar el && por el ||
        if (num < 0 || num > 1000) { 
            System.out.println("Numero incorrecto.");
        } else {
            // En este punto, la variable num no cambia de valor en todo el desarrollo
            // Con lo cual, procedemos a cambiar por la variable i respectivamente
            for ( int i = num; i >= 1; i-- ) {
                if( num % i == 0 ){
                    IO.println( i );
                }
            }
        }
    }

}