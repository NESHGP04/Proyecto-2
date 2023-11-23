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

public class EmployeeMainFrameController {

    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;
    private Empleado empleado;

    public void setEmpleado(Empleado empleado, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.empleado = empleado;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    @FXML
    private Button btnAgregarDieta;

    @FXML
    private Button btnAgregarRutina;

    @FXML
    private Button btnBuscarCliente;

    @FXML
    private Button btnRegresar;

    @FXML
    void btnAgregarDietaClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("asignarDietaFrame.fxml"));
            Parent root = loader.load();

            AsignarDietaController asignarDietaController = loader.getController();
            asignarDietaController.setEmpleado(empleado,empleados,clientes);

            Stage stage = new Stage();
            stage.setTitle("Asignar Dieta");

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
    void btnAgregarRutinaClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("asignarRutinarFrame.fxml"));
            Parent root = loader.load();

            AsignarRutinaController asignarRutinaController = loader.getController();
            asignarRutinaController.setEmpleado(empleado, empleados,clientes);

            Stage stage = new Stage();
            stage.setTitle("Asignar Rutina");

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
    void btnBuscarClienteClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("findUserFrame.fxml"));
            Parent root = loader.load();

            FindUserFrameController findUserFrameController = loader.getController();
            findUserFrameController.setEmpleado(empleado, empleados,clientes);

            Stage stage = new Stage();
            stage.setTitle("Ver Cliente");

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
            mainFrameController.setClientesEmpleados(clientes,empleados);

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

}
