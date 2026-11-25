/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Producto;

/**
 *
 * @author programacion
 */
public class TestProducto {

    public static void main(String[] args) {
        //En esta claes probaremos la clase producto.
        //a) ¿Cuántos atributos tiene? la clase producto tiene 4 atributos

//    b) ¿Cuántos constructores tiene? En principio 1. En ocasiones tambien es interesante el contructor vacio. Vamos a crearlo.
        // Ahora podemos decir que hay 2 constructores
//    c) ¿Cuántos métodos tiene? Vamos a considerar que quitando constructores, getter y setters solo hay 1 método.
        //    d) ¿Cómo harías para crear en el main() de un programa dos productos? 
        //Por ejemplo, ‘p1’ que sea un ordenador, que tiene un impuesto del 21% 
        //y ‘p2’ una barra de pan, que tiene el 4%  
        IO.println("************ Creamos 2 productos");
        Producto p1 = new Producto("ordenador", 100, 0.21);
        Producto p2 = new Producto("barradepan", 5, 0.04);

//    e) ¿Con qué descuento se crean? por defecto el descuento es 0.
//    f) ¿Cómo mostrarías por pantalla el precio final de ambos productos creados?
        IO.println("************ Visualizamos el precio de los 2 productos");
        IO.println("el precio final de " + p1.nombre + "-->" + p1.calcularPrecioFinal());
        IO.println("el precio final de " + p2.nombre + "-->" + p2.calcularPrecioFinal());
        //Le hemos cambiado el iva a los productos para no cambiar el método de cálculo para dividirlo por 100

//    g) Aplícale un descuento del 10% al ordenador y muestra de nuevo el precio final.
        IO.println("***Modificamos el descuento en el primer producto a 10. ***");
        p1.setDescuento(10);

//    h) Cambia el nombre a la barra de pan.
        p1.nombre = "Barradepanmodificada";

        //Observa que como es publico el atributo podemos acceder directamente. El descuento solo es accesible con getter y setter.
//    i) ¿Qué ocurre si hago en el main: p1.IVA = p2.IVA; ?
        IO.println("************ Visualizamos los 2 productos antes ...");
        //Para visualizar los objetos vamos a utilizar el método toString en p1 y directamente con los valores en p2.
        //Necesitamos crear el método toString.Vamos allá
        IO.println(p1.toString());
        IO.println("Nombre: " + p2.nombre + " Iva: " + p2.IVA + " Precio: " + p2.precio + " Descuento: " + p2.getDescuento());
        p1.IVA = p2.IVA;
        IO.println("************ Visualizamos los 2 productos despues de modificar el iva...");
        IO.println(p1.toString());
        IO.println("Nombre: " + p2.nombre + " Iva: " + p2.IVA + " Precio: " + p2.precio + " Descuento: " + p2.getDescuento());

        //Para que se vea mejor le ponemos los campos antes
        //Verificamos que el iva del primer producto es ahora igual al iva del segundo producto
//    j) ¿Qué ocurre si hago en el main: p1.descuento = p2.descuento; ?
        p1.setDescuento(p2.getDescuento());

        //La única manera que tengo de asignar valores o recoger valores en descuento es a través de getter y setter
        IO.println("************ Asignamos al descuento del producto 1 el de p2...");
        IO.println(p1.toString());
        IO.println("Nombre: " + p2.nombre + " Iva: " + p2.IVA + " Precio: " + p2.precio + " Descuento: " + p2.getDescuento());

//    k) ¿Qué ocurre si hago en el main: p1 = p2; ? 
        p1 = p2;
        IO.println("Hacemos p1 igual a p2");
        IO.println(p1.toString());
        IO.println(p2.toString());
        //Para ver que ocurre vamos a modificar el valor del nombre en p1
        IO.println("Modificamos el nombre de p1 y vemos como quedan los 2 objetos");
        p1.nombre = "nuevovalor";
        IO.println(p1.toString());
        IO.println(p2.toString());

        //Fijate que al modificar el valor de 1 objeto se modifica el del segundo objeto. Esto no es conveniente.
//    l) ¿Cómo harías para que el objeto p1 tuviese el mismo contenido que p2 pero fuesen variables independientes 
//que puedan tomar valores diferentes más adelante?
        //Primero volvemos a crear los valores iniciales 
        p1 = new Producto("ordenador", 100, 0.21);
        p2 = new Producto("barradepan", 5, 0.04);
        IO.println(p1.toString());
        IO.println(p2.toString());

        //***Vamos a hacer p1 igual a p2 y que al modificarlo sea independiente. Solución clonar......
        //necesitamos realizar el método clone en el producto...
        //Me pide el netbeans que como puede ocurrir un error ponga un try-catch......... se explica más adelante
        //Pero vamos poner ahora el error en la linea...
        //La ponemos aqui para que se va mejor
        //Observa que hemos tenido que poner clone public para que lo reconozca aquí
        //¿Porqué nos sale error .... porque la clase producto debe ser cloneable..... Vamos allá
        try {
            p1 = (Producto) p2.clone();
        } catch (CloneNotSupportedException ex) {
            //Logger.getLogger(testProducto.class.getName()).log(Level.SEVERE, null, ex);
            //cambio el mensaje de error
            System.out.println("Error al realizar el clone");
        }

        //Vamos a modificar el nombre del producto p1 y ver que no se modifica en p2.
        p1.nombre = "nuevovalor";
        IO.println("Observa que con el cloneable la modificación a 1 no afecta al otro");
        IO.println(p1.toString());
        IO.println(p2.toString());

//    m) ¿Qué ocurre si hago if (p1 ==p2) System.out.println("Iguales"); ?
        if (p1 == p2) {
            IO.println("Iguales");
        } else {
            IO.println("No son iguales");
        }

        //Vamos a probarlo antes de modificarlo. Volvemos a clonarlo
        try {
            p1 = (Producto) p2.clone();
        } catch (CloneNotSupportedException ex) {
            //Logger.getLogger(testProducto.class.getName()).log(Level.SEVERE, null, ex);
            //cambio el mensaje de error
            System.out.println("Error al realizar el clone");
        }
        if (p1 == p2) {
            IO.println("Iguales");
        } else {
            IO.println("No son iguales");
        }
        IO.println(p1.toString());
        IO.println(p2.toString());

        //Con seeto compruebas que 2 objetos a pesar de tener valores idénticos son diferentes.
        //Ocupan distintas posiciones de memoria.
//    n) Haz un main con el siguiente código:
        Producto p3 = new Producto("impresora", 50d, 0.21);
        Producto p4 = p3;
        p3.precio = 60;
        IO.println(p4.precio);

//¿Qué mostrará por pantalla?¿Por qué?  Sin clonarlo el precio de p4 debe ser el mismo de p3. Es decir 60. Lo ejecutamos y lo vemos
    }
}
