import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginUserFrameController{

    private ArrayList<Cliente> clientes;
    private boolean autenticado = false;
    private Cliente cliente;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegresar;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private TextArea tfUsuario;

    @FXML
    void btnIniciarSesionClicked(ActionEvent event) {

        autenticarCliente();

        if(!autenticado){
            System.out.println("No coincide");
            return;
        }

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

    @FXML
    void btnRegresarClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("preLoginUserFrame.fxml"));
            Parent root = loader.load();

            MainFrameController mainFrameController = loader.getController();
            mainFrameController.setCliente(clientes);

            Stage stage = new Stage();
            stage.setTitle("Pre-Ingreso Usuario");

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

    public void autenticarCliente(){
        if(clientes == null)
            return;

        for(Cliente cliente : clientes){
            if(tfUsuario.getText().equals(cliente.getCorreo()) && tfPassword.getText().equals(cliente.getPassword())){
                this.cliente = cliente;
                autenticado = true;
            }
        }
    }

    public void setCliente(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }
}
