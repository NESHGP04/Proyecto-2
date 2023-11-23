import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AsignarRutinaController implements Initializable{

    private ArrayList<Empleado> empleados;
    private ArrayList<Rutina> rutinas;
    private ArrayList<Cliente> clientes;
    private Cliente cliente;
    private Empleado empleado;

    private boolean clienteEncontrado = false;

    public void setEmpleado(Empleado empleado, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.empleado = empleado;
        this.empleados = empleados;
        this.clientes = clientes;
        rutinas = cargarRutinas("Rutinas.csv");
    }

    private String lunes = "Descanso",martes = "Descanso",miercoles = "Descanso",jueves = "Descanso",viernes = "Descanso",sabado = "Descanso";
    
    @FXML
    private Button btnAsignarRutina;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnRegresar;

    @FXML
    private ChoiceBox<String> cbJueves;

    @FXML
    private ChoiceBox<String> cbLunes;

    @FXML
    private ChoiceBox<String> cbMartes;

    @FXML
    private ChoiceBox<String> cbMiercoles;

    @FXML
    private ChoiceBox<String> cbSabado;

    @FXML
    private ChoiceBox<String> cbViernes;

    @FXML
    private TextField tfClienteID;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Crear una lista de opciones
        ObservableList<String> gruposMusculares = FXCollections.observableArrayList("Descanso", "Pierna", "Espalda","Pecho","Brazo","Abdomen");

        // Asignar las opciones al ChoiceBox
        cbLunes.setItems(gruposMusculares);
        cbMartes.setItems(gruposMusculares);
        cbMiercoles.setItems(gruposMusculares);
        cbJueves.setItems(gruposMusculares);
        cbViernes.setItems(gruposMusculares);
        cbSabado.setItems(gruposMusculares);

        cbLunes.setValue("Descanso");
        cbMartes.setValue("Descanso");
        cbMiercoles.setValue("Descanso");
        cbJueves.setValue("Descanso");
        cbViernes.setValue("Descanso");
        cbSabado.setValue("Descanso");

        // Configurar un listener para manejar los cambios en la selección
        cbLunes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {lunes = cbLunes.getValue();});
        cbMartes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {martes = cbMartes.getValue();});
        cbMiercoles.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {miercoles = cbMiercoles.getValue();});
        cbJueves.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {jueves = cbJueves.getValue();});
        cbViernes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {viernes = cbViernes.getValue();});
        cbSabado.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {sabado = cbSabado.getValue();});  
    }

    @FXML
    void btnAsignarRutinaClicked(ActionEvent event) {
        if(!clienteEncontrado){
            System.out.println("No se ha buscado un cliente");
            return;
        }

        String[] dias = {lunes,martes,miercoles,jueves,viernes,sabado}; 
        
        Rutina rutina = new Rutina(cliente.getMetaPeso(),dias,tfClienteID.getText());
        rutinas.add(rutina);

        guardarRutinas();
    }

    @FXML
    void btnBuscarClicked(ActionEvent event) {
        for(Cliente cliente : clientes){
            if(cliente.getId().equals(tfClienteID.getText())){
                clienteEncontrado = true;
                this.cliente = cliente;
                System.out.println("Encontrado");
            }
        }
    }

    @FXML
    void btnRegresarClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("employeeMainFrame.fxml"));
            Parent root = loader.load();

            EmployeeMainFrameController employeeMainFrameController = loader.getController();
            employeeMainFrameController.setEmpleado(empleado,empleados,clientes);

            Stage stage = new Stage();
            stage.setTitle("Empleado");

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);

            // Configura la nueva ventana como ventana secundaria (no bloqueará la ventana principal)
            stage.initOwner(((Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow()));
            stage.initModality(Modality.WINDOW_MODAL);

            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Trata la excepción adecuadamente en tu aplicación
        }
    }

    public ArrayList<Rutina> cargarRutinas(String path){
        ArrayList<Rutina> rutinas = new ArrayList<Rutina>();

        try{
            Scanner scan = new Scanner(new File(path));//Se lee el archivo CSV
            scan.useDelimiter(",");

            if(scan.hasNextLine()){//Se salta la linea de titulos
                scan.nextLine();
            }

            while(scan.hasNextLine()){
                String[] rutinasData = scan.nextLine().split(",");//Se separa cada casilla

                System.out.println(rutinasData.length-1);
                Rutina rutina = new Rutina(Integer.parseInt(rutinasData[0]),Arrays.copyOfRange(rutinasData,2,rutinasData.length),rutinasData[1]);
                rutinas.add(rutina);
            }
        
        System.out.println("Archivo de rutinas cargados correctamente...");

        }catch(Exception e){//Si no se puede cargar el archivo, se mostrara el siguiente mensaje
            System.out.println("\nNo se ha podido cargar el archivo de rutinas, puede que todavia no exista...");
            System.out.println("Motivo: " + e);
        }

        return rutinas;
    }

    private void guardarRutinas(){
        File archivoCSV = new File("Rutinas.csv");//Se prepara el archivo que se creara

        try{
            PrintWriter out = new PrintWriter(archivoCSV);//Para escribir en el archivo

            String[] titulos = {"tipo","id","lunes","martes","miercoles","jueves","viernes","sabado"};

            for(String titulo : titulos)
                out.print(titulo + ",");//Escribimos los titulos

            out.println();

            for(Rutina rutina : rutinas){
                out.println(rutina.toCSV());
            }

            out.close();//Cerramos y guardamos el archivo

            System.out.println("\nArchivo rutinas.csv guardado correctamente....");
        }catch(FileNotFoundException e){//En caso de que no se pueda crear
            System.out.println("No se ha encontrado el archivo");
        }
    } 

}
