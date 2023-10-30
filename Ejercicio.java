/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.util.*;

public class Ejercicio{

    private String nombre;
    private String descripcion;
    private String tipo;
    private ArrayList<Maquina> maquinas = new ArrayList<Maquina>();


    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public String getTipo(){
        return tipo;
    }

    public ArrayList<Maquina> getMaquinas(){
        return maquinas;
    }

    public Ejercicio(String nombre, String descripcion, String tipo, Sede sede){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }
}