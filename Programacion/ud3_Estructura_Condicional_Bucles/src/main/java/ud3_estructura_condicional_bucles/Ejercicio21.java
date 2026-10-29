package ud3_estructura_condicional_bucles;


/**
 *  Corrigiendo el codigo del Ejercicio que propone el Fibonacci:
*/

public class Ejercicio21 {
    public static void main(String[] args) {

        // Para corregir el ejercicio, aqui ant igualamos a 0 y ant2 a 1
        int ant = 0, ant2 = 1, num;

        // Procedemos a evaluar los datos hasta el numero 12
        for (int i = 1; i <= 12; i++) {

            // Vamos mostrando el valor de ant, y luego evaluamos y procedemos a ejecutar el Fibonacci
            System.out.println(ant);

            // Explicación de la primera vuelta de evaluación:
            num = ant + ant2; // Num será igual a 1 ya que 0 + 1 = 1
            ant = ant2; // Ant será igual a 1, 
            ant2 = num; // Ant2 será igual al valor de num
        }
    }
}
