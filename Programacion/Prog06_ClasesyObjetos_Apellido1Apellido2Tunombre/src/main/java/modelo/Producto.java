/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package modelo;

/**
 *
 * @author programacion
 */
public class Producto implements Cloneable {
   //observa que algunos de los atributos son publicos y otros privados.
   //Los publicos podrán ser accesibles desde cualquier clase. Los privados accederemos a ellos
  // a través de getter y setter

    public String nombre;
    public double precio;
    public double IVA;
    private double descuento;
    
    //Pasamos a construir los contructores y los getter y setter.

    public Producto() {
    }

    
    public Producto(String nombre, double precio, double IVA) {
        //Le quitamos el parámetro descuento y al crear un objeto siempre le dará de descuento 0
        this.nombre = nombre;
        this.precio = precio;
        this.IVA = IVA;
        this.descuento = 0;
    }
    
    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    //Incorporamos el método que calcula el preciofinal();
    
     public double calcularPrecioFinal () {
        double prFin= this.precio + (this.precio * this.IVA);
        double prFinDesc = prFin - (prFin * this.descuento);
        return prFinDesc;
    }

    @Override
    public String toString() {
        return "producto{" + "nombre=" + nombre + ", precio=" + precio + ", IVA=" + IVA + ", descuento=" + descuento + '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
     
    
}
