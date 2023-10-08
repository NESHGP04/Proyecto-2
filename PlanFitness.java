/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class PlanFitness extends Fitness {
    //y extends Premium

    //Constructor REVISAR
    public PlanFitness(float peso, float altura, int metaPeso, String id, Rutina rutinaEjercicios, Dieta dieta, Sede sede){
        super(peso, altura, metaPeso, id, rutinaEjercicios, dieta, sede);
    }

    public Dieta getRutinaEjercicios(){
        return rutinaEjercicios; //Correcto??
    }

    public void setRutinaEjercicios(Rutina rutinaEjercicios){
        this.rutinaEjercicios = rutinaEjercicios; //Correcto??
    }

    public void consultarEntrenador(){
        System.out.println("<<Consulte a un entrenador personal>>");
    }
}
