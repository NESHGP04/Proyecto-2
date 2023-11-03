/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.util.ArrayList;

public class Dieta {
    //private ArrayList<Alimento> alimentos = new ArrayList<Alimento>();
    private ArrayList<String> alimentos;
    private int objetivo;
    private int tipo;
    private String[] dias;

    public Dieta(int objetivo, ArrayList<String> alimentos) {
        this.alimentos = alimentos;
        this.objetivo = objetivo;
    }

    public ArrayList<String> getAlimentos() {
        return alimentos;
    }

    public void agregarAlimento(String alimento) {
        alimentos.add(alimento);
    }

    public int getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }

    public void mostrarAlimentos() {
        System.out.println("Lista de alimentos en la dieta:");
        for (String alimento : alimentos) {
            System.out.println("Alimentos" + alimento);
        }
    }
}
