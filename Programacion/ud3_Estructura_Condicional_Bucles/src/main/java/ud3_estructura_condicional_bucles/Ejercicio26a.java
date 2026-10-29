package ud3_estructura_condicional_bucles;

/**
 * Hacer cuatro programas que pinten 9 líneas según los graficos 
 * planteados: a, b, c, d. del PDF.
 */

// [VERSION A]
public class Ejercicio26a {
    public static void main(String[] args) {
        
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 10; j++) {
                System.out.print(i);
            }
            System.out.println();
            
        }
    }
}
