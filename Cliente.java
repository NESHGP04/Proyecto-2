/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Cliente extends Persona {

    //Definir variables
        //PROTECTED?
    protected float peso;
    protected float altura;
    protected int metaPeso;
    protected String id;
        //De otras clases
    protected Rutina rutinaEjercicios;
    protected Dieta dieta;
    protected Sede sede;

    //Constructor
    public Cliente(String nombre, int edad, String dpi, float peso, float altura, int metaPeso, String id, Rutina rutinaEjercicios, Dieta dieta, Sede sede){
        super(nombre, edad, dpi);
        this.peso = peso;
        this.altura = altura;
        this.metaPeso = metaPeso;
        this.id = id;
        this.rutinaEjercicios = rutinaEjercicios;
        this.dieta = dieta;
        this.sede = sede;
    }

    //Getters
    public float getPeso(){
        return this.peso;
    }

    public float getAltura(){
        return this.altura;
    }

    public int getMetaPeso(){
        return this.metaPeso;
    }

    public String getId(){
        return this.id;
    }

    public Sede getSede(){
        return this.sede;
    }

    //Setters TERMINAR
    public void setPeso(double peso){
    
    }

    public void setAltura(double altura){
       
    }

    public void setMetaPeso(double metaPeso){
       
    }

    public void setSede(Sede sede){
       
    }
}
