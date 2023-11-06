import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainDieta {
    public static void main(String[] args) {
        ArrayList<Dieta> dietas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el tipo de dieta (por ejemplo, 'Dieta A', 'Dieta B', etc.):");
            String tipoDieta = scanner.nextLine();

            System.out.println("Ingrese el día de la semana (por ejemplo, 'Lunes', 'Martes', etc.):");
            String dia = scanner.nextLine();

            Dieta dieta = new Dieta(tipoDieta, dia);

            for (int i = 1; i <= 5; i++) {
                System.out.println("Ingrese la comida " + i + ":");
                String comida = scanner.nextLine();
                dieta.agregarComida(comida);
            }

            dietas.add(dieta);

            System.out.println("¿Desea ingresar otra dieta? (Sí/No)");
            String respuesta = scanner.nextLine().toLowerCase();
            if (!respuesta.equals("si")) {
                break;
            }
        }

        String csvFileName = "planAlimentacion.csv";

        try (PrintWriter writer = new PrintWriter(new FileWriter(csvFileName))) {
            writer.println("TipoDieta,Dia,Comida1,Comida2,Comida3,Comida4,Comida5");

            for (Dieta dieta : dietas) {
                writer.print(dieta.toCSV());
            }

            System.out.println("Los datos se han guardado en " + csvFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
