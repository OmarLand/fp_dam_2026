package modelo;

public class Persona {

    public String nombre;
    public int edad;
    
    public Persona( String nombre, int edad ){
        this.nombre = nombre;
        this.edad = edad;
    }    
    
    public boolean mayorEdad(){
        if( this.edad >= 18 ){
            return true;
        } else {
            return false;
        }
    }

}
