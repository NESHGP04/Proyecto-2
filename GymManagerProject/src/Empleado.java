/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.util.ArrayList;
import java.util.List;


public class Empleado extends Persona {
    private String id;
    private String password;

    public Empleado(String nombre, int edad, String dpi, String sede, String id, String correo, String password){
        super(nombre, edad, dpi, correo);
        this.sede=sede;
        this.id=id;
        this.password = password;
    }

    public void agregarRutina(){

    }

    public void agregarDieta(){

    }

    public String getId(){
        return "ID: " + this.id;
    }

    public String getPassword() {
        return password;
    }
}
