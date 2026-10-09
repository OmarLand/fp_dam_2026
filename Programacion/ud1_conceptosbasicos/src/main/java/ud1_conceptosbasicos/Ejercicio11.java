package ud1_conceptosbasicos;

/**
 * Diseñar un programa al que se le introduzca la longitud de dos catetos de un ángulo recto
 * y nos devuelva el valor de la hipotenusa. Busca en internet como calcular en Java potencias
 * y raices cuadradas para aplicar el teorema de pitágoras. Investiga también si existe en Java
 * alguna utilidad que nos haga este cálculo automáticamente.
*/
/**
 *
 * @author OmarjLand
 */

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        
        double catA, catB, hipo;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("# Programa de Cálculo de Hipotenusa con Teorema de Pitagoras #");

        // Usando la función IO.readln pedimos al usuario los catetos del triangulo
        // Y directamente lo asignamos a sus variables respectiva catA y catB (Cateto Opuesto y Cateto Adyacente)
        System.out.println("Ingrese el Cateto A: ");
        catA = sc.nextDouble();
        
        System.out.println("Ingrese el Cateto B: ");
        catB = sc.nextDouble();
        
        // Hacemos el calculo aplicando la formula del teorema de pitagoras:        
        hipo = Math.sqrt( Math.pow(catA, 2) + Math.pow(catB, 2) );
               
        // Mostramos el resultado:
        System.out.println("El valor de la hipotenusa eS: " + hipo);
        
        
    }
}
