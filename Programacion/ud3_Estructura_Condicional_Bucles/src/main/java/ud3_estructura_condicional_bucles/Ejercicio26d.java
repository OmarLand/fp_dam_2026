package ud3_estructura_condicional_bucles;

/**
 * Hacer cuatro programas que pinten 9 líneas según los graficos 
 * planteados: a, b, c, d. del PDF.
 */

// [VERSION D]
public class Ejercicio26d {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {

            for (int j = 9; j >= i; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
