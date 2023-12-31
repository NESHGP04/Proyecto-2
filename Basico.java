/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Basico extends Cliente {

    // Constructor
    public Basico(String nombre, int edad, String dpi, float peso, float altura, int metaPeso, String id, Rutina rutinaEjercicios, Dieta dieta, Sede sede) {
        super(nombre, edad, dpi, peso, altura, metaPeso, id, rutinaEjercicios, dieta, sede);
    }

    public double obtenerPrecio() {
        // Lógica para obtener el precio básico de la sede
        return getSede().getPrecio();
    }
}

