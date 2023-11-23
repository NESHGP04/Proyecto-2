/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Nutricion extends Cliente implements PlanNutricion{

    //Constructor
    public Nutricion(String nombre, int edad, String dpi, float peso, float altura, int metaPeso, String id, String idRutina, String idDieta, String sedeNombre, String password, String correo){
        super(nombre, edad, dpi, peso, altura, metaPeso, id, idRutina, idDieta, sedeNombre, password, correo); //Poner rutina, dieta y sede?}
    }

    @Override
    public Dieta getDieta(){
        return dieta;
    }

    @Override
    public void setDieta(){
        //this.dieta = dieta;
    }

    @Override
    public void consultarNutricionista(){

    }
}
