package estructurasdeControl;

import java.util.Scanner;

/*
* Diseñar un programa al que se le introduzcan por consola tres números enteros 
* Si todos son negativos, mostrar el producto de los tres. Si alguno es negativo,
* pero no todos, mostrar la suma de los tres. En caso de que todos sean positivos 
* sumar los dos primeros y multiplicar dicha suma por el tercero. 
* ¿Existe alguna combinación de los valores leídos no contemplado en el algoritmo?
* (Suponer que el cero es un número positivo). Hacer el programa lo más sencillo posible.
*/

/**
 *
 * @author OmarjLand
 */
public class Ejercicio2 {
    public static void main(String[] args) {

        // Inicializamos variables
        int valueA, valueB, valueC;
        Scanner sc = new Scanner(System.in);

        // Pedimos los datos al usuario
        System.out.println("Ingrese el primer numero: ");
        valueA = sc.nextInt();

        System.out.println("Ingrese el segundo numero: ");
        valueB = sc.nextInt();

        System.out.println("Ingrese el tercer numero: ");
        valueC = sc.nextInt();

        // Evaluamos las condiciones
        if (valueA < 0 && valueB < 0 && valueC < 0) {

            System.out.println("Producto: " + (valueA * valueB * valueC));

        } else if (valueA < 0 || valueB < 0 || valueC < 0) {

            System.out.println("Suma: " + (valueA + valueB + valueC));

        } else {

            System.out.println("Resultado: " + ((valueA + valueB) * valueC));

        }

        sc.close();

    }
}
