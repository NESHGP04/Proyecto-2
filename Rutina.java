/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.util.*;

class Rutina{

    private ArrayList<Secuencia> secuencias = new ArrayList<Secuencia>();
    //private String[] dias = new String[6];
    private String dias;
    private ArrayList<Maquina> maquinas = new ArrayList<Maquina>();
    private int tipo;
    private ArrayList<String> rutinas;

    Rutina(int tipo, String dias){
        this.tipo = tipo;
        this.dias = dias;
        this.rutinas = new ArrayList<>();
    }

    public ArrayList<Secuencia> getSecuencias(){
        return secuencias;
    }

    public ArrayList<Maquina> getMaquina(){
        return maquinas;
    }

    // public String[] getDias(){
    //     return dias;
    // }

    // public void setDias(String ... dias){
    //     this.dias = dias;
    // }

    public void agregarRutina(String rutina){
        rutinas.add(rutina);
    }

    public String toCSV() {
        StringBuilder csvData = new StringBuilder();
        csvData.append(tipo).append(",").append(dias);

        for (int i = 0; i < 5; i++) {
            if (i < rutinas.size()) {
                csvData.append(",").append(rutinas.get(i));
            } else {
                csvData.append(",");
            }
        }

        csvData.append("\n");
        return csvData.toString();
    }
}