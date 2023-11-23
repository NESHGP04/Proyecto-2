import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class UserMainFrameController{

    private ArrayList<Cliente> clientes;
    private Cliente cliente; 

    @FXML
    private Button btnDieta;

    @FXML
    private Button btnDisponibilidad;

    @FXML
    private Button btnHorarios;

    @FXML
    private Button btnPrecios;

    @FXML
    private Button btnRegresar;

    @FXML
    private Button btnRutina;
    
    @FXML
    private Label lbUserID;
 
    public void setCliente(Cliente cliente, ArrayList<Cliente> clientes){
        this.clientes = clientes;
        this.cliente = cliente;
        lbUserID.setText("ID de usuario: " + cliente.getId());
    }

    @FXML
    void btnDietaClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("dietasFrame.fxml"));
            Parent root = loader.load();

            DietaFrameController dietaFrameController = loader.getController();
            dietaFrameController.setCliente(cliente, clientes);
            dietaFrameController.cargarDietas("Dietas.csv");

            Stage stage = new Stage();
            stage.setTitle("Dieta asignada");

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

    @FXML
    void btnDisponibilidadClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("disponibilidadFrame.fxml"));
            Parent root = loader.load();

            DisponibilidadFrameController disponibilidadFrameController = loader.getController();
            disponibilidadFrameController.setCliente(cliente, clientes);

            Stage stage = new Stage();
            stage.setTitle("Disponibilidad de maquinas");

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

    @FXML
    void btnHorariosClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("horariosFrame.fxml"));
            Parent root = loader.load();

            HorariosFrameController horariosFrameController = loader.getController();
            horariosFrameController.setCliente(cliente, clientes);

            Stage stage = new Stage();
            stage.setTitle("Horarios");

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

    @FXML
    void btnPreciosClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("preciosFrame.fxml"));
            Parent root = loader.load();

            PreciosFrameController preciosFrameController = loader.getController();
            preciosFrameController.setCliente(cliente, clientes);

            Stage stage = new Stage();
            stage.setTitle("Precios de planes");

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

    @FXML
    void btnRegresarClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StartUpFrame.fxml"));
            Parent root = loader.load();

            MainFrameController mainFrameController = loader.getController();
            mainFrameController.setCliente(clientes);

            Stage stage = new Stage();
            stage.setTitle("Inicio");

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

    @FXML
    void btnRutinaClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("rutinasFrame.fxml"));
            Parent root = loader.load();

            RutinasFrameController rutinasFrameController = loader.getController();
            rutinasFrameController.setCliente(cliente, clientes);
            rutinasFrameController.cargarRutinas("Rutinas.csv");
            rutinasFrameController.verRutina();

            Stage stage = new Stage();
            stage.setTitle("Rutina asignada");

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
}
