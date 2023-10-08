/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Sede {
    private String sede;
    private boolean disponibilidad;
    private double precio;
    private Map<String, String> horarios;
    private int capacidadMaxima = 50;
    private ArrayList<Maquina> maquinas;
    private ArrayList<Cliente> clientes;

    public Sede(String sede) {
        this.sede = sede;
        this.disponibilidad = true;
        this.precio = calcularPrecioBase();
        this.horarios = new HashMap<>();
        this.maquinas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Map<String, String> getHorarios() {
        return horarios;
    }

    public void agregarHorario(String dia, String horario) {
        horarios.put(dia, horario);
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    private double calcularPrecioBase() {
        int dias = 30; /// Numero de dias que se contara al mes  
        double precioPorDia = 15.0; // Precio por dia (este podra ser cambiado paraotra sede etc).

        return dias * precioPorDia;///precio mensualmente 
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void agregarMaquina(Maquina maquina) {
        maquinas.add(maquina);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

        @Override
    public String toString() {
        return "Gimnasio{" +
                "sede='" + sede + '\'' +
                ", disponibilidad=" + disponibilidad +
                ", precio=" + precio +
                ", horarios=" + horarios +
                ", capacidadMaxima=" + capacidadMaxima +
                ", maquinas=" + maquinas +
                ", clientes=" + clientes +
                '}';
    }
}