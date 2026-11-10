package ud5_funciones;

/**
 * Un numero primo es aquel que solo tiene como divisores 
 * el numero 1 y a él mismo. Usando la función del programa anterior, 
 * haz un programa que muestre la suma de los números primos comprendidos 
 * entre 1 y 1000.
 */

public class Ejercicio7 {

    public static int cantidadDivisores(int numero) {
        if (numero < 0) {
            return 0;
        }

        int contador = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
            }
        }
        return contador;
    }
    
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 1; i <= 1000; i++) {
            if (cantidadDivisores(i) == 2) {
                suma += i;
            }
        }
        System.out.println("La suma de los números primos entre 1 y 1000 es: " + suma);
    }
    
}
