/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */
import java.util.ArrayList;

class Dieta {
    private String tipoDieta;
    private String dia;
    private ArrayList<String> comidas;

    public Dieta(String tipoDieta, String dia) {
        this.tipoDieta = tipoDieta;
        this.dia = dia;
        this.comidas = new ArrayList<>();
    }

    public void agregarComida(String comida) {
        comidas.add(comida);
    }

    public String toCSV() {
        StringBuilder csvData = new StringBuilder();
        csvData.append(tipoDieta).append(",").append(dia);

        for (int i = 0; i < 5; i++) {
            if (i < comidas.size()) {
                csvData.append(",").append(comidas.get(i));
            } else {
                csvData.append(",");
            }
        }

        csvData.append("\n");
        return csvData.toString();
    }
}