/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Gimnasio {
    private ArrayList<Sede> sedes;
    private float precio;

    public Gimnasio() {
        this.sedes = new ArrayList<>();
        this.precio = 0.0f; // Precio inicial en 0.0
    }

    public ArrayList<Sede> getSedes() {
        return sedes;
    }

    public void agregarSede(Sede sede) {
        sedes.add(sede);
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String mostrarSedes() {
        StringBuilder sedesStr = new StringBuilder("Sedes disponibles:\n");

        for (Sede sede : sedes) {
            sedesStr.append("Sede: ").append(sede.getSede()).append("\n");
        }

        return sedesStr.toString();
    }
    public boolean verificarDisponibilidad() {
        for (Sede sede : sedes) {
            Map<String, String> horarios = sede.getHorarios();
            for (String horario : horarios.values()) {
                if (!horario.isEmpty()) {
                    return true; // Hay al menos un horario disponible en esta sede.
                }
            }
        }
        return false; // No hay horarios disponibles en ninguna sede.
    }
}