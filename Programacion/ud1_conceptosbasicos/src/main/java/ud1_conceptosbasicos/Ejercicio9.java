package ud1_conceptosbasicos;

/*
* El siguiente programa pretende intercambiar 2 variables enteras introducidas previamente, 
* y luego mostrarlas por pantalla. Corrige los errores que encuentres en el código:

public class Ejercicio0 {
    void main(){

        int var1, var2;
        
        var1 = Integer.parseInt( IO.readln("Introduce var1: "));
        var2 = Integer.parseInt( IO.readln("Introduce var2: "));

        var1=var2;
        var2=var1;

        IO.println("Ahora var1 es igual a var1");
        IO.println("Ahora var1 es igual a var1");
    }
}
*/

/**
 *
 * @author OmarjLand
 */

// Código corregido sin los errores:
public class Ejercicio9 {
    public static void main(String[] args) {

        //Inicializamos las variables correctamente:
        //En este punto nos hacía faltaba una variable auxiliar que sirviera de contenedor temporal de uno de los valores
        int var1, var2, auxiliar;

        //Pedimos los valores por teclado al usuario:
        // Importante usar el Integer.parseInt(); ya que el IO.reanln lee Strings, y con esto lo parseamos a tipo int.
        var1 = Integer.parseInt( IO.readln("Ingrese un valor para var1: ") );
        var2 = Integer.parseInt( IO.readln("Ingrese un valor para var2: ") );
        
        //En este punto mostramos al usuario los valores que ha añadido:
        IO.println("El valor original de var1 es: " + var1);
        IO.println("El valor original de var2 es: " + var2);
        
        //Hacemos la operación de intercambio de variables para hacer que var1 sea var2 y viceversa.
        //Entra en acción la variable auxliar.
        auxiliar = var1; // Justo con el auxiliar, faltaba esta operación.
        var1 = var2;
        var2 = auxiliar;

        // Mostramos los valores intercambiados:
        IO.println("El nuevo valor de var1 es: " + var1);
        IO.println("El nuevo valor de var2 es: " + var2);

        // Hemos tenido que usar una variable adicional, que en mi caso he llamado auxiliar para poder
        // Intercambiar los valores.
        
        //String nombre;        
        //nombre = IO.readln("Ingrese un nombre: ");
        //System.out.println("EL nombre es: " + nombre);
        
    }
}
