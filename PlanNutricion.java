/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class PlanNutricion extends Nutricion{
    //y extends Premium

    //Constructor REVISAR
    public PlanNutricion(float peso, float altura, int metaPeso, String id, Rutina rutinaEjercicios, Dieta dieta, Sede sede){
        super(peso, altura, metaPeso, id, rutinaEjercicios, dieta, sede);
    }

    public Dieta getDieta(){
        return dieta; //Correcto??
    }

    public void setDieta(Dieta dieta){
        this.dieta = dieta; //Correcto??
    }

    public void consultarNutricionista(){
        System.out.println("<<Consulte a un nutricionista>>");
    }
}
