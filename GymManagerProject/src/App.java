import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage){
        Parent root;
        ArrayList<Cliente> clientes = cargarClientes("Cliente.csv");
        ArrayList<Empleado> empleados = cargarEmpleados("Empleados.csv");
        
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StartUpFrame.fxml"));
            root = loader.load();

            MainFrameController mainFrameController = loader.getController();
            mainFrameController.setClientesEmpleados(clientes, empleados);

            Scene scene = new Scene(root);

            primaryStage.setTitle("Inicio");
            primaryStage.setScene(scene);
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch(IOException e){
        }
    }

    public ArrayList<Cliente> cargarClientes(String path){
        ArrayList<Cliente> clientes = new ArrayList<>();

        try{
            Scanner scan = new Scanner(new File(path));//Se lee el archivo CSV
            scan.useDelimiter(",");

            if(scan.hasNextLine()){//Se salta la linea de titulos
                scan.nextLine();
            }

            while(scan.hasNextLine()){
                String[] clientesData = scan.nextLine().split(",");//Se separa cada casill

                switch(clientesData[12]){
                    case "Basico":
                        Basico basico = new Basico(clientesData[0],Integer.parseInt(clientesData[1]),clientesData[2],Float.parseFloat(clientesData[3]),Float.parseFloat(clientesData[4]),Integer.parseInt(clientesData[5]),clientesData[6],clientesData[7],clientesData[8],clientesData[9], clientesData[10], clientesData[11]);
                        clientes.add(basico);
                        break;
                    case "Premium":
                        Premium premium = new Premium(clientesData[0],Integer.parseInt(clientesData[1]),clientesData[2],Float.parseFloat(clientesData[3]),Float.parseFloat(clientesData[4]),Integer.parseInt(clientesData[5]),clientesData[6],clientesData[7],clientesData[8],clientesData[9], clientesData[10], clientesData[11]);
                        clientes.add(premium);
                        break;
                    case "Fitness":
                        Fitness fitness = new Fitness(clientesData[0],Integer.parseInt(clientesData[1]),clientesData[2],Float.parseFloat(clientesData[3]),Float.parseFloat(clientesData[4]),Integer.parseInt(clientesData[5]),clientesData[6],clientesData[7],clientesData[8],clientesData[9], clientesData[10], clientesData[11]);
                        clientes.add(fitness);
                        break;
                    case "Nutricional":
                        Nutricion nutricion = new Nutricion(clientesData[0],Integer.parseInt(clientesData[1]),clientesData[2],Float.parseFloat(clientesData[3]),Float.parseFloat(clientesData[4]),Integer.parseInt(clientesData[5]),clientesData[6],clientesData[7],clientesData[8],clientesData[9], clientesData[10], clientesData[11]);
                        clientes.add(nutricion);                    
                        break;
                }
            }

        System.out.println("Archivo de clientes cargados correctamente...");

        }catch(Exception e){//Si no se puede cargar el archivo, se mostrara el siguiente mensaje
            System.out.println("\nNo se ha podido cargar el archivo, puede que todavia no exista...");
            System.out.println("Motivo: " + e);
        }        
        return clientes;
    }

    public ArrayList<Empleado> cargarEmpleados(String path){
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();

        try{
            Scanner scan = new Scanner(new File(path));//Se lee el archivo CSV
            scan.useDelimiter(",");

            if(scan.hasNextLine()){//Se salta la linea de titulos
                scan.nextLine();
            }

            while(scan.hasNextLine()){
                String[] empleadosData = scan.nextLine().split(",");//Se separa cada casilla

                Empleado empleado = new Empleado(empleadosData[0],Integer.parseInt(empleadosData[1]),empleadosData[2],empleadosData[3],empleadosData[4],empleadosData[5],empleadosData[6]);
                empleados.add(empleado);
            }   

        System.out.println("Archivo de empleados cargados correctamente...");

        }catch(Exception e){//Si no se puede cargar el archivo, se mostrara el siguiente mensaje
            System.out.println("\nNo se ha podido cargar el archivo, puede que todavia no exista...");
            System.out.println("Motivo: " + e);
        }        
        return empleados;
    }

    public static void main(String[] args){
       launch(args);
    }
}
