/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasdeControl;

import java.util.Scanner;

/**
 *
 * @author OmarjLand
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Introducir las coordenadas del primer punto (x1, y1)
        System.out.println("Introduce las coordenadas del primer punto:");
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();

        // Introducir las coordenadas del segundo punto (x2, y2)
        System.out.println("Introduce las coordenadas del segundo punto:");
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();

        // Calcular el ancho y la altura usando Math.abs para asegurar valores positivos
        double ancho = Math.abs(x1 - x2);
        double alto = Math.abs(y1 - y2);

        // Validar que formen una figura con área mayor a 0
        if (ancho == 0 || alto == 0) {
            System.out.println("Los puntos introducidos no forman una figura válida (ancho o alto es cero).");
        } else {
            // Calcular el área
            double area = ancho * alto;

            // Determinar si es un cuadrado o un rectángulo
            if (ancho == alto) {
                System.out.println("La figura que forman es un **cuadrado**.");
            } else {
                System.out.println("La figura que forman es un **rectángulo**.");
            }

            // Mostrar el área calculada[cite: 1]
            System.out.println("El área de la figura es: " + area);
        }

        sc.close();
    }
}
