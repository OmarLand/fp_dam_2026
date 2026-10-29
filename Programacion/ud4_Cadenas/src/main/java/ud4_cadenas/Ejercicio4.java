package ud4_cadenas;

/**
 * Realiza un programa que muestre una contraseña generada aleatoriamente
 * teniendo las siguientes limitaciones: Tendrá entre 5 y 10 posiciones
 * que solo pueden ser letras entre la 'a' y la 'j'
*/

public class Ejercicio4 {

    public static void main(String[] args) {
        
        //Inicializamos las variables:
        int longitudClave = (int) (Math.random() * 6 ) + 5;
        char letra;
        String pass = "";

        // Generamos cada caracter de la contraseña entre la a a la j:
        for ( int i = 0; i < longitudClave; i++ ) {
            letra = (char) ('a' + (int) (Math.random() * 10));
            pass += letra;
        }
        
        System.out.println("La contraseña generada es: " + pass);
    }

}
