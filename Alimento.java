/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.util.*;
public class Alimento extends Dieta{
    ArrayList<String> items = new ArrayList<>();

    public Alimento(int objetivo,ArrayList<String> alimentos){
        super(objetivo, alimentos);
    }
}
