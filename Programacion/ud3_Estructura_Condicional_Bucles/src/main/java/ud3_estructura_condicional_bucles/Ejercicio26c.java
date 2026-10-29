package ud3_estructura_condicional_bucles;

/**
 * Hacer cuatro programas que pinten 9 líneas según los graficos 
 * planteados: a, b, c, d. del PDF.
 */

// [VERSION C]

public class Ejercicio26c {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print(i);
            }

            System.out.println();
        }
    }
}
