/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.io.Serializable;

public class Cliente extends Persona implements Serializable{

    //Definir variables
    protected float peso;
    protected float altura;
    protected int metaPeso;
    protected String id;
    //De otras clases
    protected Rutina rutinaEjercicios;
    protected String idRutina;
    protected String idDieta;
    protected String sedeNombre;
    protected Dieta dieta;
    protected Sede sede;
    protected String password;

    //Constructor
    public Cliente(String nombre, int edad, String dpi, float peso, float altura, int metaPeso, String id, String idRutina, String idDieta, String sedeNombre, String password, String correo){
        super(nombre, edad, dpi, correo);
        this.peso = peso;
        this.altura = altura;
        this.metaPeso = metaPeso;
        this.id = id;
        this.idRutina = idRutina;
        this.idDieta = idDieta;
        this.sedeNombre = sedeNombre;
        this.password = password;
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

    public String getSede(){
        return this.sedeNombre;
    }

    public String getPassword() {
        return password;
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

    public String guardarDatos(){
        return nombre+","+edad+","+dpi+","+peso+","+altura+","+metaPeso+","+id+","+idRutina+","+idDieta+","+sedeNombre+","+password+","+correo;
    }
}
