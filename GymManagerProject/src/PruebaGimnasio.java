import java.util.Scanner;
import java.util.Map;

public class PruebaGimnasio {
    public static void main(String[] args) {
        // Crear un gimnasio
        Gimnasio gimnasio = new Gimnasio();

        Sede sede1 = new Sede("Sede 1");
        sede1.agregarHorario("Lunes", "08:00 AM - 12:00 PM");
        sede1.agregarHorario("Miercoles", "09:00 AM - 11:00 AM");
        gimnasio.agregarSede(sede1);

        Sede sede2 = new Sede("Sede 2");
        sede2.agregarHorario("Martes", "10:00 AM - 12:00 PM");
        sede2.agregarHorario("Viernes", "02:00 PM - 04:00 PM");
        gimnasio.agregarSede(sede2);

        // Solicitar al usuario que elija un dia
        Scanner scanner = new Scanner(System.in);
        System.out.println("Días disponibles: Lunes, Martes, Miercoles, Jueves, Viernes, Sabado");
        System.out.print("Ingrese el dia que desea seleccionar: ");
        String diaElegido = scanner.nextLine();

        // Validar el dia ingresado
        if (!esDiaValido(diaElegido)) {
            System.out.println("Dia no valido. Por favor, elija un dia de la semana.");
            return;
        }

        // Mostrar los horarios disponibles para el dia seleccionado
        System.out.println("Horarios disponibles para " + diaElegido + ":");
        mostrarHorariosParaDia(gimnasio, diaElegido);
    }

    private static boolean esDiaValido(String dia) {
        String[] diasValidos = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        for (String diaValido : diasValidos) {
            if (diaValido.equalsIgnoreCase(dia)) {
                return true;
            }
        }
        return false;
    }
    private static void mostrarHorariosParaDia(Gimnasio gimnasio, String diaElegido) {
        for (Sede sede : gimnasio.getSedes()) {
            Map<String, String> horarios = sede.getHorarios();
            String horario = horarios.get(diaElegido);
            System.out.println("Sede: " + sede.getSede());
            if (horario != null) {
                System.out.println("Horario para " + diaElegido + ": " + (horario.isEmpty() ? "Disponible" : horario));
            } else {
                System.out.println("Horario para " + diaElegido + " no está configurado.");
            }
        }
    }
}
