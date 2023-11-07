import java.io.*;
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

        String csvName = "planAlimentacion.csv";

        try {
            boolean isFileEmpty = true;
            File file = new File(csvName);

            if (file.exists() && file.length() > 0) {
                isFileEmpty = false;
            }

            PrintWriter writer = new PrintWriter(new FileWriter(csvName, true));

            if (isFileEmpty) {
                writer.println("TipoDieta,Dia,Comida1,Comida2,Comida3,Comida4,Comida5");
            }

            for (Dieta dieta : dietas) {
                writer.print(dieta.toCSV());
            }

            writer.close();
            System.out.println("Los datos se han agregado al archivo " + csvName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
