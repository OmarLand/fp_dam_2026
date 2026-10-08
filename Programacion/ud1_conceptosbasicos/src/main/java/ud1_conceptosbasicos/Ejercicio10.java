package ud1_conceptosbasicos;

/**
 * Programa al que se le introduzcan por consola las coordenadas X e Y de un punto del plano
 * y calcule el área del rectángulo que forma ese punto con el origen de los ejes de
 * coordenadas (supón que solo pueden ser positivos)
 * 
 * |
 * |
 * |____(x,y)
 * |     |
 * |_____|__________
 * (0,0)
 * 
 */

/**
 *
 * @author OmarjLand
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        
        // Inicializo las variables:
        double valueAlt, valueBase, area;
        
        System.out.println(" # Calculo del area de un rectangulo dado sus valores. v 1.0 #");
        
        // Pedimos los valores por teclado al usuario:
        valueAlt  = Integer.parseInt(IO.readln("Ingrese la altura del rectangulo (Debe ser positivo): "));
        valueBase = Integer.parseInt(IO.readln("Ahora ingrese la base del rectangulo: (Debe ser positivo) "));
        
        if (valueAlt>0 && valueBase>0) {
            //Hacemos el calculo del área del rectángulo:
            area = valueBase * valueAlt;

            // Mostramos resultados al usuario:
            IO.println("El area del rectangulo de acuerdo a los valores ingresados es de: " + area);           
        }else{
            IO.println("¡Advertencia! - No podemos calcular el area del rectangulo con valores negativos -");
            IO.println("# Intentelo de nuevo añadiendo valores en positivo #");
        }
        

    }
}
