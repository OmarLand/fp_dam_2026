package ud3_estructura_condicional_bucles;

/**
 * La suma de los dígitos de los números múltiplos de tres es también 
 * un multiplo de tres. Realizar un programa que compruebe si esta afirmación 
 * es correcta o no para los primeros 10000 números enteros positivos.
 */

public class Ejercicio27 {
    public static void main(String[] args) {
        
        int numero, auxiliar, digito, sumaDigitos;
        boolean correcta = true;

        for (numero = 1; numero <= 10000; numero++) {

            // Comprobamos si el número es múltiplo de 3
            if (numero % 3 == 0) {

                auxiliar = numero;
                sumaDigitos = 0;

                // Sumamos los dígitos del número
                while (auxiliar > 0) {
                    digito = auxiliar % 10;
                    sumaDigitos += digito;
                    auxiliar = auxiliar / 10;
                }

                // Comprobamos si la suma es múltiplo de 3
                if (sumaDigitos % 3 != 0) {
                    correcta = false;
                    System.out.println("La afirmación no se cumple para: " + numero);
                    break;
                }
            }
        }

        if (correcta) {
            System.out.println("La afirmación es correcta.");
            System.out.println( "Comprobados los primeros 10000 números positivos.");
        }

    }
}
