/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Persona {
    
    //Definición de variables
    protected String nombre;
    protected int edad;
    protected String dpi;

    //Constructor
    public Persona(String nombre, int edad, String dpi){
        this.nombre = nombre;
        this.edad=edad;
        this.dpi=dpi;
    }

    public String toString(){
        return this.nombre + " de " + this.edad + " años y DPI " + this.dpi;
    } //PONER??

    //Getters
    protected String getNombre(){
        return this.nombre;
    }

    protected int getEdad(){
        return this.edad;
    }

    protected String getDpi(){
        return this.dpi;
    }

    //Setters
        //Void?
    protected void setNombre(String nombre){
        this.nombre=nombre;
    }

    protected void setEdad(int edad){
        this.edad=edad;
    }

    protected void setDpi(String dpi){
        this.dpi=dpi;
    }
}
