/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

public class Secuencia{

    private Ejercicio ejercicio;
    private int repeticiones;
    private int series;
    private int descanso;

    String s = String.valueOf(repeticiones); 

    public Ejercicio getEjercicio(){
        return ejercicio;
    }

    public int getRepeticiones(){
        return repeticiones;
    }

    public int getSeries(){
        return series;
    }

    public int getDescanso(){
        return descanso;
    }

    public void setEjercicio(Ejercicio ejercicio){
        this.ejercicio = ejercicio;
    }

    public void setRepeticiones(int repeticiones){
        this.repeticiones = repeticiones;
    }

    public void setDescanso(int descanso){
        this.descanso = descanso;
    }

    public void setSeries(int series){
        this.series = series;
    }

    Secuencia(Ejercicio ejercicio, int repeticiones, int series, int descanso){
        this.ejercicio = ejercicio;
        this.repeticiones = repeticiones;
        this.series = series;
        this.descanso = descanso;
    }

    // public String toString(){
    //     return "Ejercio: " + ejercicio+ " Repeticiones: " + repeticiones+ " Series: " + series+ " Descanso: " + descanso;
    // }

    public String toStringSeries(){
        return "" + series;
    }

}