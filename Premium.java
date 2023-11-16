/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Premium extends Cliente implements PlanNutricion, PlanFitness {

    // Constructor
    public Premium(String nombre, int edad, String dpi, float peso, float altura, int metaPeso, String id, Rutina rutinaEjercicios, Dieta dieta, Sede sede) {
        super(nombre, edad, dpi, peso, altura, metaPeso, id, rutinaEjercicios, dieta, sede);
    }

    public double obtenerPrecio() {
        // Lógica para obtener el precio premium de la sede
        return getSede().getPrecio() + 100;
    }

    // Implementación de métodos de las interfaces PlanNutricion y PlanFitness
    // ...

    @Override
    public Dieta getDieta() {
        return super.getDieta();
    }

    @Override
    public void setDieta(Dieta dieta) {
        super.setDieta(dieta);
    }

    @Override
    public void consultarNutricionista() {
        // Implementación de consultarNutricionista si es necesario
    }

    @Override
    public Rutina getRutina() {
        return super.getRutina();
    }

    @Override
    public void setRutina(Rutina rutina) {
        super.setRutina(rutina);
    }

    @Override
    public void consultarEntrenador() {
        // Implementación de consultarEntrenador si es necesario
    }
}
