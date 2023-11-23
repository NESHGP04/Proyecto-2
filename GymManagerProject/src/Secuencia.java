/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Secuencia{

    private String ejercicio;
    private String repeticiones;
    private String series;
    private String descanso;

    public String getEjercicio(){
        return ejercicio;
    }

    public String getRepeticiones(){
        return repeticiones;
    }

    public String getSeries(){
        return series;
    }

    public String getDescanso(){
        return descanso;
    }

    public void setEjercicio(String ejercicio){
        this.ejercicio = ejercicio;
    }

    public void setRepeticiones(String repeticiones){
        this.repeticiones = repeticiones;
    }

    public void setDescanso(String descanso){
        this.descanso = descanso;
    }

    public void setSeries(String series){
        this.series = series;
    }

    Secuencia(String ejercicio, String repeticiones, String series, String descanso){
        this.ejercicio = ejercicio;
        this.repeticiones = repeticiones;
        this.series = series;
        this.descanso = descanso;
    }

    @Override
    public String toString() {
        return "Ejercicio: " + ejercicio + " Repeticiones: " + repeticiones + " Series: " + series + " Descanso: " + descanso;
    }
}