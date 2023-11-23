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

public class PreciosFrameController {

    private ArrayList<Cliente> clientes;
    private Cliente cliente; 

    public void setCliente(Cliente cliente, ArrayList<Cliente> clientes){
        this.clientes = clientes;
        this.cliente = cliente;
    }
    
    @FXML
    private Button btnRegresar;

    @FXML
    private Label lbBasico;

    @FXML
    private Label lbFitness;

    @FXML
    private Label lbNutricion;

    @FXML
    private Label lbPremium;

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

}
