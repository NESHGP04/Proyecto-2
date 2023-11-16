/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Cliente extends Persona {

    // Definir variables
    protected float peso;
    protected float altura;
    protected int metaPeso;
    protected String id;
    // De otras clases
    protected Rutina rutinaEjercicios;
    protected Dieta dieta;
    protected Sede sede;

    // Constructor
    public Cliente(String nombre, int edad, String dpi, float peso, float altura, int metaPeso, String id, Rutina rutinaEjercicios, Dieta dieta, Sede sede) {
        super(nombre, edad, dpi);
        this.peso = peso;
        this.altura = altura;
        this.metaPeso = metaPeso;
        this.id = id;
        this.rutinaEjercicios = rutinaEjercicios;
        this.dieta = dieta;
        this.sede = sede;
    }

    // Getters
    public float getPeso() {
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public int getMetaPeso() {
        return this.metaPeso;
    }

    public String getId() {
        return this.id;
    }

    public Sede getSede() {
        return this.sede;
    }

    // Setters
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setMetaPeso(int metaPeso) {
        this.metaPeso = metaPeso;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
    public Dieta getDieta() {
        return this.dieta;
    }

    public void setDieta(Dieta dieta) {
        this.dieta = dieta;
    }

    public Rutina getRutina() {
        return this.rutinaEjercicios;
    }

    public void setRutina(Rutina rutina) {
        this.rutinaEjercicios = rutina;
    }
}

