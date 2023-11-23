import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainFrameController {

    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public void setClientesEmpleados(ArrayList<Cliente> clientes, ArrayList<Empleado> empleados){
        this.clientes = clientes;
        this.empleados = empleados;
    }

    public void setCliente(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }

    public void setEmpleado(ArrayList<Empleado> empleados){
        this.empleados = empleados;
    }

    //INICIO FRAME
    //#region
    @FXML
    private Button btnCliente;

    @FXML
    private Button btnEmpleado;

    @FXML
    void btnClienteClicked(ActionEvent event) {
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

    @FXML
    void btnEmpleadoClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginEmployeeFrame.fxml"));
            Parent root = loader.load();

            LoginEmployeeFrameController loginEmployeeFrameController = loader.getController();
            loginEmployeeFrameController.setEmpleado(empleados, clientes);

            Stage stage = new Stage();
            stage.setTitle("Iniciar Sesion Empleado");

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
    //#endregion

    //PRELOGIN USER FRAME 
    //#region
    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnRegistrarse;

    @FXML
    private Button btnRegresar;

    @FXML
    void btnIniciarSesionClicked(ActionEvent event) {
        if(clientes == null)
            return;
        
        System.out.println(clientes.size());

        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("loginUserFrame.fxml"));
            Parent root = loader.load();

            LoginUserFrameController loginUserFrameController = loader.getController();
            loginUserFrameController.setCliente(clientes);

            Stage stage = new Stage();
            stage.setTitle("Iniciar Sesion Usuario");

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
    void btnRegistrarseClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("registerUserFrame.fxml"));
            Parent root = loader.load();

            RegisterUserFrameController registerUserFrameController = loader.getController();
            registerUserFrameController.setCliente(clientes);

            Stage stage = new Stage();
            stage.setTitle("Registrar Usuario");

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
    //#endregion
}
