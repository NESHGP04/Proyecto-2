import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DietaFrameController implements Initializable{

    private ArrayList<Cliente> clientes;
    private ArrayList<Dieta> dietas;
    private Cliente cliente; 

    public void setCliente(Cliente cliente, ArrayList<Cliente> clientes){
        this.clientes = clientes;
        this.cliente = cliente;
    }

    @FXML
    private Button btnRegresar;

    @FXML
    private Label lbDomingoAlmuerzo;

    @FXML
    private Label lbDomingoCena;

    @FXML
    private Label lbDomingoDesayuno;

    @FXML
    private Label lbDomingoRefa1;

    @FXML
    private Label lbDomingoRefa2;

    @FXML
    private Label lbJuevesAlmuerzo;

    @FXML
    private Label lbJuevesCena;

    @FXML
    private Label lbJuevesDesayuno;

    @FXML
    private Label lbJuevesRefa1;

    @FXML
    private Label lbJuevesRefa2;

    @FXML
    private Label lbLunesAlmuerzo;

    @FXML
    private Label lbLunesCena;

    @FXML
    private Label lbLunesDesayuno;

    @FXML
    private Label lbLunesRefa1;

    @FXML
    private Label lbLunesRefa2;

    @FXML
    private Label lbMartesAlmuerzo;

    @FXML
    private Label lbMartesCena;

    @FXML
    private Label lbMartesDesayuno;

    @FXML
    private Label lbMartesRefa1;

    @FXML
    private Label lbMartesRefa2;

    @FXML
    private Label lbMiercolesAlmuerzo;

    @FXML
    private Label lbMiercolesCena;

    @FXML
    private Label lbMiercolesDesayuno;

    @FXML
    private Label lbMiercolesRefa1;

    @FXML
    private Label lbMiercolesRefa2;

    @FXML
    private Label lbSabadoAlmuerzo;

    @FXML
    private Label lbSabadoCena;

    @FXML
    private Label lbSabadoDesayuno;

    @FXML
    private Label lbSabadoRefa1;

    @FXML
    private Label lbSabadoRefa2;

    @FXML
    private Label lbViernesAlmuerzo;

    @FXML
    private Label lbViernesCena;

    @FXML
    private Label lbViernesDesayuno;

    @FXML
    private Label lbViernesRefa1;

    @FXML
    private Label lbViernesRefa2;

    private Label[] comidas;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comidas = new Label[]{
            // Lunes
            lbLunesDesayuno, lbLunesRefa1, lbLunesAlmuerzo, lbLunesRefa2, lbLunesCena,
            // Martes
            lbMartesDesayuno, lbMartesRefa1, lbMartesAlmuerzo, lbMartesRefa2, lbMartesCena,
            // Miércoles
            lbMiercolesDesayuno, lbMiercolesRefa1, lbMiercolesAlmuerzo, lbMiercolesRefa2, lbMiercolesCena,
            // Jueves
            lbJuevesDesayuno, lbJuevesRefa1, lbJuevesAlmuerzo, lbJuevesRefa2, lbJuevesCena,
            // Viernes
            lbViernesDesayuno, lbViernesRefa1, lbViernesAlmuerzo, lbViernesRefa2, lbViernesCena,
            // Sábado
            lbSabadoDesayuno, lbSabadoRefa1, lbSabadoAlmuerzo, lbSabadoRefa2, lbSabadoCena,
            // Domingo
            lbDomingoDesayuno, lbDomingoRefa1, lbDomingoAlmuerzo, lbDomingoRefa2, lbDomingoCena
        };

        for(int i = 0; i < comidas.length; i++){
            comidas[i].setText("Indefinido");
        }
    }

    @FXML
    void btnRegresarClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("userMainFrame.fxml"));
            Parent root = loader.load();

            UserMainFrameController userMainFrameController = loader.getController();
            userMainFrameController.setCliente(cliente, clientes);

            Stage stage = new Stage();
            stage.setTitle("Gestion de Usuario");

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

    void cargarDietas(String path){

        try{
            Scanner scan = new Scanner(new File(path));//Se lee el archivo CSV
            scan.useDelimiter(",");

            if(scan.hasNextLine()){//Se salta la linea de titulos
                scan.nextLine();
            }

            while(scan.hasNextLine()){
                String[] dietasData = scan.nextLine().split(",");//Se separa cada casill

                if (dietasData[0].equals(cliente.getId())) {
                    // Reemplaza los valores vacíos con "-"
                    for (int i = 1; i < dietasData.length; i++) {
                        if (dietasData[i].isEmpty()) {
                            dietasData[i] = "-";
                        }
                    }
                    
                    String[] shortData = Arrays.copyOfRange(dietasData, 1, dietasData.length);
                    // Asigna los valores a los componentes de interfaz de usuario
                    for (int i = 0; i < comidas.length; i++) {
                        comidas[i].setText(shortData[i]);
                    }
                }
            }

        System.out.println("Archivo de dietas cargados correctamente...");

        }catch(Exception e){//Si no se puede cargar el archivo, se mostrara el siguiente mensaje
            System.out.println("\nNo se ha podido cargar el archivo de rutinas, puede que todavia no exista...");
            System.out.println("Motivo: " + e);
        }
    }

}
