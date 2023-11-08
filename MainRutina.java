/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * MAIN controlador3
 */
        //REVISAR - CAMBAIR

import java.io.*;
import java.util.*;

public class MainRutina {
    public static void main(String[] args) {
        ArrayList<Rutina> rutinas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){

            //Ingresa info a CSV Rutinas
            System.out.println("\nIngrese su objetivo: \n1.Bajar Peso \n2.Subir Peso \n3.Balancear Peso \n4.Alto Rendimiento");
            int tipoObj = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\nIngrese el día de la semana (por ejemplo, 'Lunes', 'Martes', etc.):");
            String dia = scanner.nextLine();

            Rutina rutina = new Rutina(tipoObj, dia);

            System.out.println("\nIngrese el nombre del ejercicio: ");
            String ejercicio = scanner.nextLine();
            rutina.agregarRutina(ejercicio);

            System.out.println("\nIngrese una breve descripción de " + ejercicio+ ": ");
            String descripcion = scanner.nextLine();
            rutina.agregarRutina(descripcion);

            System.out.println("\nIngrese la máquina donde se realizará " + ejercicio+ ": ");
            String máquina = scanner.nextLine();
            rutina.agregarRutina(máquina);

            System.out.println("\nIngrese las repeticiones para " +ejercicio+ ": ");
            String repeticiones = scanner.nextLine();
            rutina.agregarRutina(repeticiones);
            // int repeticiones = scanner.nextInt();

            System.out.println("\nIngrese las series para " +ejercicio+ ": ");
            String series = scanner.nextLine();
            rutina.agregarRutina(series);
            //int series = scanner.nextInt();
            
            System.out.println("\nIngrese el tiempo (min) de descanso entre series para " +ejercicio+ ": ");
            String descanso = scanner.nextLine();
            rutina.agregarRutina(descanso);
            //int descanso = scanner.nextInt();

            //rutinas.add(new Secuencia(ejercicio, repeticiones, series, descanso));
            // Rutina listRutinas = null;
            // listRutinas.getSecuencias();

            // for(int i = 1; i<=5; i++){
            //     System.out.println("\nIngrese la rutina "+i+": ");
            //     String ejercicio = scanner.nextLine();
            //     rutina.agregarRutina(ejercicio);
            // }

            rutinas.add(rutina);

            System.out.println("\n¿Desea ingresar otra rutina? (Sí/No)");
            String respuesta = scanner.nextLine().toLowerCase();
            if (!respuesta.equals("si")) {
                break;
            }
        }

        String csvFileName = "planRutinas.csv";

        try {
            boolean isFileEmpty = true;
            File file = new File(csvFileName);

            if (file.exists() && file.length() > 0) {
                isFileEmpty = false;
            }

            PrintWriter writer = new PrintWriter(new FileWriter(csvFileName, true));

            if (isFileEmpty) {
                writer.println("TipoDieta,Dia,Comida1,Comida2,Comida3,Comida4,Comida5");
            }

            for (Rutina rutina : rutinas) {
                writer.print(rutina.toCSV());
            }

            writer.close();
            System.out.println("Los datos se han agregado al archivo " + csvFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
