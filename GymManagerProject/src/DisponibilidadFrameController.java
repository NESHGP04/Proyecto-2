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

public class DisponibilidadFrameController {

    private ArrayList<Cliente> clientes;
    private Cliente cliente; 

    public void setCliente(Cliente cliente, ArrayList<Cliente> clientes){
        this.clientes = clientes;
        this.cliente = cliente;
    }

    @FXML
    private Button btnRegresar;

    @FXML
    private Label lbDisponible1;

    @FXML
    private Label lbDisponible10;

    @FXML
    private Label lbDisponible11;

    @FXML
    private Label lbDisponible12;

    @FXML
    private Label lbDisponible13;

    @FXML
    private Label lbDisponible14;

    @FXML
    private Label lbDisponible15;

    @FXML
    private Label lbDisponible2;

    @FXML
    private Label lbDisponible3;

    @FXML
    private Label lbDisponible4;

    @FXML
    private Label lbDisponible5;

    @FXML
    private Label lbDisponible6;

    @FXML
    private Label lbDisponible7;

    @FXML
    private Label lbDisponible8;

    @FXML
    private Label lbDisponible9;

    @FXML
    private Label lbMaquina1;

    @FXML
    private Label lbMaquina10;

    @FXML
    private Label lbMaquina11;

    @FXML
    private Label lbMaquina12;

    @FXML
    private Label lbMaquina13;

    @FXML
    private Label lbMaquina14;

    @FXML
    private Label lbMaquina15;

    @FXML
    private Label lbMaquina2;

    @FXML
    private Label lbMaquina3;

    @FXML
    private Label lbMaquina4;

    @FXML
    private Label lbMaquina5;

    @FXML
    private Label lbMaquina6;

    @FXML
    private Label lbMaquina7;

    @FXML
    private Label lbMaquina8;

    @FXML
    private Label lbMaquina9;

    @FXML
    private Label lbTipo1;

    @FXML
    private Label lbTipo10;

    @FXML
    private Label lbTipo11;

    @FXML
    private Label lbTipo12;

    @FXML
    private Label lbTipo13;

    @FXML
    private Label lbTipo14;

    @FXML
    private Label lbTipo15;

    @FXML
    private Label lbTipo2;

    @FXML
    private Label lbTipo3;

    @FXML
    private Label lbTipo4;

    @FXML
    private Label lbTipo5;

    @FXML
    private Label lbTipo6;

    @FXML
    private Label lbTipo7;

    @FXML
    private Label lbTipo8;

    @FXML
    private Label lbTipo9;

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
