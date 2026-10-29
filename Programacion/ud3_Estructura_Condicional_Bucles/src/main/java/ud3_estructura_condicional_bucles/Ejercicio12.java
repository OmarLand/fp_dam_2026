package ud3_estructura_condicional_bucles;


import java.util.Scanner;

/**
 * Diseñar un algoritmo al que se le introduzcan las notas de los exámenes
 * de una clase con decimales. Se introducirá -1 para indicar que 
 * no hay más notas. El algoritmo informará del total de notas introducidas,
 * calculará la nota mínima, máxima, la media, si hay algún 5.0 exacto,
 * y el porcentaje de aprobados. Hay que validar que estén entre 0 y 10.

Importante:
 - Hay que pensar primero el bucle: el código se repide mentras... 
   Una vez declarado esto, puedes pensar qué es lo que se hace cada vez 
   (en este caso, que hago con cada nota introducida)
- Para calcular la nota máxima, hay que tener guardada en una variable 
  la máxima hasta ese momento y al leer una nueva nota, compararla la nueva
  con la guardada, y si la nueva es mayor que la guardada, guardamos la nueva ya que ahora es la máxima y así para todas las iteraciones del bucle ( para empezar puedes decir que la máxima nota es -1 ).
- Para calcular la media hay que ir acumulando los valores y la cantidad 
  de elementos, y al final dividir lo acumulado entre la cantidad de elementos.
 *
 */

public class Ejercicio12 {
    public static void main(String[] args) {
        
        // inicializamos las variables
        float nota, acum = 0, minima = 11, maxima = -1, media = 0, porcentaje = 0 ;
        
        int aprobados = 0, contador = 0;
        boolean hayCinco = false;
        Scanner sc = new Scanner(System.in);

        System.out.println(" # Programa de Calificaciones de Estudiantes 2.0 #");

        // Pedimos los datos al usuario_
        System.out.println("Por favor introduzca la nota ( -1 Para Salir del programa )");
        nota = sc.nextFloat();

        while ( nota != -1 ) { 
            
            if ( nota >= 0  && nota <=10 ) {
                contador++;
                acum += nota;

                if ( nota < minima ) {
                    minima = nota;
                }
    
                if (nota > maxima) {
                    maxima = nota;
                }
    
                if ( nota == 5.0f ) {
                    hayCinco = true;
                }
    
                if ( nota >= 5.0f ) {
                    aprobados++;
                }
            } else {
                System.out.println("La nota ingresada no es válida. Debe estar entre 0 y 10.");
            }

            System.out.println("Introduce otra nota (-1 Para salir del programa.)");
            nota = sc.nextFloat();
        }

        if (contador > 0) {

            media = acum / contador;
            porcentaje = (float) aprobados / contador * 100;

            System.out.println("Total de notas: " + contador);
            System.out.println("Nota minima: " + minima);
            System.out.println("Nota maxima: " + maxima);
            System.out.println("Nota media: " + media);
            System.out.println("¿Hay algun 5.0 exacto?: " + hayCinco);
            System.out.println("Porcentaje de Aprobados: " + porcentaje);

        } else {
            System.out.println("No se han introducido notas validas.");
        }
    }
}
