import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AsignarDietaController{

    private ArrayList<Empleado> empleados;
    private ArrayList<Dieta> dietas;
    private ArrayList<Cliente> clientes;
    private Empleado empleado;

    private boolean clienteEncontrado = false;

    public void setEmpleado(Empleado empleado, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.empleado = empleado;
        this.empleados = empleados;
        this.clientes = clientes;
        dietas = cargarDietas("Dietas.csv");
    }

    @FXML
    private Button btnAsignarDieta;

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnRegresar;

    @FXML
    private TextField tfClienteID;

    @FXML
    private TextField tfDomingoAlmuerzo;

    @FXML
    private TextField tfDomingoCena;

    @FXML
    private TextField tfDomingoDesayuno;

    @FXML
    private TextField tfDomingoRefa1;

    @FXML
    private TextField tfDomingoRefa2;

    @FXML
    private TextField tfJuevesAlmuerzo;

    @FXML
    private TextField tfJuevesCena;

    @FXML
    private TextField tfJuevesDesayuno;

    @FXML
    private TextField tfJuevesRefa1;

    @FXML
    private TextField tfJuevesRefa2;

    @FXML
    private TextField tfLunesAlmuerzo;

    @FXML
    private TextField tfLunesCena;

    @FXML
    private TextField tfLunesDesayuno;

    @FXML
    private TextField tfLunesRefa1;

    @FXML
    private TextField tfLunesRefa2;

    @FXML
    private TextField tfMartesAlmuerzo;

    @FXML
    private TextField tfMartesCena;

    @FXML
    private TextField tfMartesDesayuno;

    @FXML
    private TextField tfMartesRefa1;

    @FXML
    private TextField tfMartesRefa2;

    @FXML
    private TextField tfMiercolesAlmuerzo;

    @FXML
    private TextField tfMiercolesCena;

    @FXML
    private TextField tfMiercolesDesayuno;

    @FXML
    private TextField tfMiercolesRefa1;

    @FXML
    private TextField tfMiercolesRefa2;

    @FXML
    private TextField tfSabadoAlmuerzo;

    @FXML
    private TextField tfSabadoCena;

    @FXML
    private TextField tfSabadoDesayuno;

    @FXML
    private TextField tfSabadoRefa1;

    @FXML
    private TextField tfSabadoRefa2;

    @FXML
    private TextField tfViernesAlmuerzo;

    @FXML
    private TextField tfViernesCena;

    @FXML
    private TextField tfViernesDesayuno;

    @FXML
    private TextField tfViernesRefa1;

    @FXML
    private TextField tfViernesRefa2;

    private String[] textFields;

    @FXML
    void btnAsignarDietaClicked(ActionEvent event) {
        if(!clienteEncontrado){
            System.out.println("No se ha buscado un cliente");
            return;
        }

        aisngarDieta();
        guardarDietas();
    }

    void aisngarDieta(){

        textFields = new String[]{
            tfLunesDesayuno.getText(), tfLunesRefa1.getText(), tfLunesAlmuerzo.getText(), tfLunesRefa2.getText(), tfLunesCena.getText(),
            tfMartesDesayuno.getText(), tfMartesRefa1.getText(), tfMartesAlmuerzo.getText(), tfMartesRefa2.getText(), tfMartesCena.getText(),
            tfMiercolesDesayuno.getText(), tfMiercolesRefa1.getText(), tfMiercolesAlmuerzo.getText(), tfMiercolesRefa2.getText(), tfMiercolesCena.getText(),
            tfJuevesDesayuno.getText(), tfJuevesRefa1.getText(), tfJuevesAlmuerzo.getText(), tfJuevesRefa2.getText(), tfJuevesCena.getText(),
            tfViernesDesayuno.getText(), tfViernesRefa1.getText(), tfViernesAlmuerzo.getText(), tfViernesRefa2.getText(), tfViernesCena.getText(),
            tfSabadoDesayuno.getText(), tfSabadoRefa1.getText(), tfSabadoAlmuerzo.getText(), tfSabadoRefa2.getText(), tfSabadoCena.getText(),
            tfDomingoDesayuno.getText(), tfDomingoRefa1.getText(), tfDomingoAlmuerzo.getText(), tfDomingoRefa2.getText(), tfDomingoCena.getText()
        };

        Dieta dieta = new Dieta(tfClienteID.getText(), textFields);
        dietas.add(dieta);
    }

    @FXML
    void btnBuscarClicked(ActionEvent event) {
        for(Cliente cliente : clientes){
            if(cliente.getId().equals(tfClienteID.getText())){
                clienteEncontrado = true;
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

    public ArrayList<Dieta> cargarDietas(String path){
        ArrayList<Dieta> dietas = new ArrayList<Dieta>();

        try{
            Scanner scan = new Scanner(new File(path));//Se lee el archivo CSV
            scan.useDelimiter(",");

            if(scan.hasNextLine()){//Se salta la linea de titulos
                scan.nextLine();
            }

            while(scan.hasNextLine()){
                String[] dietasData = scan.nextLine().split(",");//Se separa cada casill

                Dieta dieta = new Dieta(dietasData[1], Arrays.copyOfRange(dietasData, 2, dietasData.length));
                dietas.add(dieta);
            }
        
        System.out.println("Archivo de dietas cargados correctamente...");

        }catch(Exception e){//Si no se puede cargar el archivo, se mostrara el siguiente mensaje
            System.out.println("\nNo se ha podido cargar el archivo de rutinas, puede que todavia no exista...");
            System.out.println("Motivo: " + e);
        }

        return dietas;
    }

    private void guardarDietas(){
        File archivoCSV = new File("Dietas.csv");//Se prepara el archivo que se creara

        try{
            PrintWriter out = new PrintWriter(archivoCSV);//Para escribir en el archivo

            String[] titulos = {"id","desayuno_Lunes", "refaccion1_Lunes", "almuerzo_Lunes", "refaccion2_Lunes", "cena_Lunes","desayuno_Martes", "refaccion1_Martes", "almuerzo_Martes", "refaccion2_Martes", "cena_Martes","desayuno_Miércoles", "refaccion1_Miércoles", "almuerzo_Miércoles", "refaccion2_Miércoles", "cena_Miércoles","desayuno_Jueves", "refaccion1_Jueves", "almuerzo_Jueves", "refaccion2_Jueves", "cena_Jueves","desayuno_Viernes", "refaccion1_Viernes", "almuerzo_Viernes", "refaccion2_Viernes", "cena_Viernes","desayuno_Sábado", "refaccion1_Sábado", "almuerzo_Sábado", "refaccion2_Sábado", "cena_Sábado","desayuno_Domingo", "refaccion1_Domingo", "almuerzo_Domingo", "refaccion2_Domingo", "cena_Domingo"};

            for(String titulo : titulos)
                out.print(titulo + ",");//Escribimos los titulos

            out.println();

            for(Dieta dieta : dietas){
                out.println(dieta.toCSV());
            }

            out.close();//Cerramos y guardamos el archivo

            System.out.println("\nArchivo dietas.csv guardado correctamente....");
        }catch(FileNotFoundException e){//En caso de que no se pueda crear
            System.out.println("No se ha encontrado el archivo");
        }
    } 

}
