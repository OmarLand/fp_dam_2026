package estructurasdeControl;

import java.util.Scanner;

/**
* Haz 3 versiones de un mismo programa, que pida que se introduzcan 
* por teclado 2 números int sobre sendas variables llamadas 'a' y 'b' 
* y que incluyan las instrucciones que se muestran abajo. 
* Para cada una de las versiones, ejecútalo varias, introduciendo cero 
* para la variable 'b' y finalmente explica la diferencia de comportamiento 
* entre cada una de las versiones:
* 
* Versión a) if ( b!=0 && a%b==0) { r=a/b; System.out.println(r); }
* Versión b) if ( a&b==0 && b!=0) { r=a/b; System.out.println(r); }
* Versión c) if ( b!=0 & a%b ==0) { r=a/b; System.out.println(r); }
* 
* NOTA:
* Puede ser el mismo código con las tres sentencias juntas, 
* teniendo una sola vigente y las otras dos como comentarios. 
* Comentando unas y descomentando otra vas probando cada caso.
*/

/**
 *
 * @author OmarjLand
 */

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir que se introduzcan 2 números int sobre variables llamadas 'a' y 'b'
        System.out.print("Introduce el valor de la variable 'a': ");
        int a = sc.nextInt();

        System.out.print("Introduce el valor de la variable 'b': ");
        int b = sc.nextInt();

        int r;

        /* 
         * Instrucción: Descomenta únicamente la versión que quieras probar 
         * y ejecuta introduciendo ceros para la variable 'b'.
         */

        // Versión a)
        if (b != 0 && a % b == 0) { 
            r = a / b; 
            System.out.println("Resultado Versión a: " + r); 
        }

        // Versión b)
        // if (a % b == 0 && b != 0) { 
        //     r = a / b; 
        //     System.out.println("Resultado Versión b: " + r); 
        // }

        // Versión c)
        // if (b != 0 & a % b == 0) { 
        //     r = a / b; 
        //     System.out.println("Resultado Versión c: " + r); 
        // }

        sc.close();
    }
}
