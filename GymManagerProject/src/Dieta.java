/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */
import java.util.ArrayList;

class Dieta {
    private String id;
    private String dias[];
    private String diasInfo;
    private ArrayList<String> comidas;

    public Dieta(String id,String dias[]) {
        this.id = id;
        this.dias = dias;
        this.comidas = new ArrayList<>();
        diasInfo = String.join(",", dias);
    }

    public void agregarComida(String comida) {
        comidas.add(comida);
    }

    public String toCSV() {
        return id+","+diasInfo;
    }
}