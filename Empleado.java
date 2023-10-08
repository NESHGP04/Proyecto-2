/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.util.ArrayList;
import java.util.List;


public class Empleado extends Persona {
    private List<Cliente> listaCliente;

    public Empleado(String nombre, int edad, String dpi){
        super(nombre, edad, dpi);
        listaCliente = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public void mostrarClientes(){
        System.out.println("Clientes: ");
        for (Cliente cliente : listaCliente){
            System.out.println("Nombre: " + cliente.getNombre() + " Edad: " + cliente.getEdad() + " DPI: " + cliente.getDpi());
        }
    }
}
