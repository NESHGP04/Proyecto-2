import java.util.Scanner;

public class PruebaGimnasio {
    public static void main(String[] args) {
        // Crear un gimnasio
        Gimnasio gimnasio = new Gimnasio();

        // Crear sedes y agregarlas al gimnasio
        Sede sede1 = new Sede("Sede 1");
        sede1.agregarHorario("Lunes", "08:00 AM - 12:00 PM");
        sede1.agregarHorario("Miércoles", "09:00 AM - 11:00 AM");
        gimnasio.agregarSede(sede1);

        Sede sede2 = new Sede("Sede 2");
        sede2.agregarHorario("Martes", "10:00 AM - 12:00 PM");
        sede2.agregarHorario("Viernes", "02:00 PM - 04:00 PM");
        gimnasio.agregarSede(sede2);

        // Crear clientes de prueba
        Basico clienteBasico = new Basico("Cliente Básico", 25, "DPI123", 70, 170, 65, "ID001", new Rutina(1, "Lunes"), new Dieta("Dieta Básica", "Lunes"), sede1);
        Premium clientePremium = new Premium("Cliente Premium", 30, "DPI456", 80, 175, 70, "ID002", new Rutina(2, "Miércoles"), new Dieta("Dieta Premium", "Miércoles"), sede2);

        // Agregar clientes a las sedes
        sede1.agregarCliente(clienteBasico);
        sede2.agregarCliente(clientePremium);

        // Solicitar al usuario que elija un cliente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Clientes disponibles: 1. Cliente Básico, 2. Cliente Premium");
        System.out.print("Ingrese el número del cliente que desea seleccionar: ");
        int opcionCliente = scanner.nextInt();

        // Validar la opción del cliente
        if (opcionCliente < 1 || opcionCliente > 2) {
            System.out.println("Opción no válida. Por favor, elija un cliente válido.");
            return;
        }

        // Seleccionar el cliente según la opción
        Cliente clienteElegido = (opcionCliente == 1) ? clienteBasico : clientePremium;

        // Calcular y mostrar el precio de la sede para el cliente seleccionado
        double precioCliente = sede1.calcularPrecioCliente(clienteElegido);
        System.out.println("El precio para la sede 1 según el cliente seleccionado es: $" + precioCliente);
    }
}

