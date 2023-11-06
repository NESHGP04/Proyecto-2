/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Premium extends Cliente implements PlanNutricion, PlanFitness{
    
    //Constructor
        public Premium(String nombre, int edad, String dpi, float peso, float altura, int metaPeso, String id, Rutina rutinaEjercicios, Dieta dieta, Sede sede){
            super(nombre, edad, dpi, peso, altura, metaPeso, id, rutinaEjercicios,dieta,sede); //Poner rutina, dieta y sede?}
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

        @Override
        public Rutina getRutina(){
            return rutinaEjercicios;
        }

        @Override
        public void setRutina(){

        }

        @Override
        public void consultarEntrenador(){
            
        }

}
