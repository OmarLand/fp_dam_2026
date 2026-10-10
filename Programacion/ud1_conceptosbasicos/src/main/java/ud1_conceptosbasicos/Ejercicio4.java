package ud1_conceptosbasicos;

// Queremos conocer los datos estadisticos de una asignatura, por lo tanto, necesitamos un programa al que se le introduzca

import java.util.Scanner;

// por consola el numero de suspensos, suficientes, notables y sobresalientes de una asignatura, y nos calcule:
//
// - El tanto por ciento de alumnos que han superado la asignatura.
// - El tanto por ciento de notables y sobresalientes de la asignatura.
//
// Trata de minimizar el numero de operaciones realizadas. Los datos se introducen en variables sin decimales, 
// pero los porcentajes sí tienen decimales. ¿Tendría algún sentido pedirle al usuario que introdujece el total de alumnos?

public class Ejercicio4 {

    public static void main(String[] args){

        //Inicializamos las variables
        Scanner sc = new Scanner(System.in);
        int cantSusp, cantSufi, cantNtables, cantSobre, totalEst;
        double porcenSobreNota, porcenSuper;
        
        System.out.println("# Datos estadisticos de asignatura 1.0 #");
        
        // Solicitamos al usuarios los datos por teclado
        System.out.println("Ingrese el numero de estudiantes con Calificación Suspendida: ");
        cantSusp = sc.nextInt();
        System.out.println("Ingrese el numero de estudiantes con Calificación Suficiente: ");
        cantSufi = sc.nextInt();
        System.out.println("Ingrese el numero de estudiantes con Calificación Notable: ");
        cantNtables = sc.nextInt();
        System.out.println("Ingrese el numero de estudiantes con Calificación Sobresaliente: ");
        cantSobre = sc.nextInt();
        
        // Total de estudiantes ingresados:
        totalEst = cantSusp + cantSufi + cantNtables + cantSobre;
        
        // En base a los datos datos siendo el 100% calculamos cuanto es el % de los que superaron la asignatura:
        porcenSuper = (totalEst-cantSusp)*100.0/totalEst;
        
        // Ahora calculamos el % de los notables y sobresalientes de la asignatura:
        porcenSobreNota = (cantSobre + cantNtables)*100.0 / totalEst;
        
        System.out.println("Total de Estudiantes: " + totalEst);
        System.out.println("Porcentaje de alumnos con la materia superada: " + porcenSuper + "%");
        // Reducción a dos decimales sugeridos por el profesor:
        System.out.println("Porcentaje de alumnos con la materia superada >: " + String.format("%.2f", porcenSuper)  + "%");
        // Reducción a dos decimales sugeridos por el profesor:
        System.out.println("Porcentaje de alumnos Notables y sobresalientes: " + String.format("%.2f", porcenSobreNota) + "%");
        
        // Nota: No ha sido necesario pedir al usuario total de alumnos, porque 
        // ya viene dada por la cantidad de datos anteriores que son bien especificos
        // Notables, Suficientes, Sobresaliente y suspensos.
        // La suma de todo ello da el total directamente de los alumnos.
        

    }

}
