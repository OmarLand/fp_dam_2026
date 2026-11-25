package ud5_funciones.clasesobjetospruebas;

import java.util.Scanner;
import modelo.Persona;

/**
 * Voy usar este proyecto exclusivamente para pruebas de aprendizaje de 
 * Clases y Objetos utilizando JAVA
 * @author OmarjLand
 */

public class ClasesObjetosPruebas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nombre: ");
        String nom = sc.nextLine();
        System.out.println("Ingrese Edad: ");
        int ed = Integer.parseInt( sc.nextLine() );
        
        Persona p = new Persona(nom, ed);
        boolean mayor = p.mayorEdad();
        
        if( mayor ){
            System.out.println("Es mayor de edad: " + p.nombre);
        } else {
            System.out.println("Es menor de edad: " + p.nombre);
        }
        
        
    }
}
