/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Maquina{

    private String nombre;
    private boolean disponible;
    private String tipo;

    public String getNombre(){
        return nombre;
    }

    public boolean getDisponibiliadad(){
        return disponible;
    }

    public String getTipo(){
        return tipo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setDisponibilidad(boolean disponible){
        this.disponible = disponible;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public Maquina(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
        this.disponible = true;
    }
}