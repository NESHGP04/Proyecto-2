import java.util.ArrayList;
import java.util.List;


public class Empleado {
    private List<Cliente> listaCliente;

    public Empleado(){
        listaCliente = new ArrayList<>();
    }

    public void registrarCliente(Cliente cliente){
        listaCliente.add(cliente);
    }

    public void mostrarClientes(){
        System.out.println("Clientes: ");
        for (Cliente cliente : listaClientes){
            System.out.println("Nombre: " + cliente.getNombre() + " Edad: " + cliente.getEdad() + " DPI: " + cliente.getDPI());
        }
    }
}
