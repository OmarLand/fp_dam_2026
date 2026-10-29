package ud3_estructura_condicional_bucles;

/**
 * Hacer cuatro programas que pinten 9 líneas según los graficos 
 * planteados: a, b, c, d. del PDF.
 */

// [VERSION B]

public class Ejercicio26b {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
