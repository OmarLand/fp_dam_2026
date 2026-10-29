package ud3_estructura_condicional_bucles;


/**
 * Programa que muestre los numeros primos comprendidos entre 2 y 1000. 
 * Haceoms los bucles con un numero minimo de iteraciones 
 * (se permite el uso del break) sabiendo que:
 * 
 * - Un numero primo es solo divisible por 1 y el mismo.
 * - Los numeros primos son todos impares salvo el 2.
 * - Los divisores de un numero siempre son menores que la mitad de dicho numero (salvo el mismo)
 * - Si un numero no es divisible por 2 ya no va a serlo por ningún otro numero par.
 *  
**/

public class Ejercicio20 {
    public static void main(String[] args) {
        
        // El 2 es el único número primo par
        System.out.println(2);

        // Recorremos solamente los números impares
        for (int numero = 3; numero <= 1000; numero += 2) {

            boolean primo = true;

            // Comprobamos solamente divisores impares
            for (int divisor = 3; divisor * divisor <= numero; divisor += 2) {
                
                if (numero % divisor == 0) {
                    primo = false;
                    break;
                }
            }

            if (primo) {
                System.out.println(numero);
            }
        }
    }
}
