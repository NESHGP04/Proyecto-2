import java.util.ArrayList;

public class Dieta {
    private ArrayList<String> alimentos;
    private int objetivo;

    public Dieta(int objetivo) {
        this.alimentos = new ArrayList<>();
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
