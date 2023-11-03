/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.util.*;

public class Rutina{
    private ArrayList<Secuencia> secuencias = new ArrayList<Secuencia>();
    private String[] dias = new String[6];
    private ArrayList<Maquina> maquinas = new ArrayList<Maquina>();
    private int tipo;

    Rutina(int tipo, String ... dias){
        this.tipo = tipo;
    }

    public ArrayList<Secuencia> getSecuencias(){
        return secuencias;
    }

    public String[] getDias(){
        return dias;
    }

    public void setDias(String ... dias){
        this.dias = dias;
    }
}