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

public class LoginEmployeeFrameController {

    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;
    private Empleado empleado;
    private boolean autenticado = false;

    public void setEmpleado(ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.empleados = empleados;
        this.clientes = clientes;
    }

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

        autenticarEmpleado();

        if(!autenticado){
            System.out.println("No coincide");
            return;
        }
    
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("employeeMainFrame.fxml"));
            Parent root = loader.load();

            EmployeeMainFrameController employeeMainFrameController = loader.getController();
            employeeMainFrameController.setEmpleado(empleado, empleados, clientes);

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

    @FXML
    void btnRegresarClicked(ActionEvent event) {
        try {
            // Cerrar la ventana actual
            Stage currentStage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            currentStage.close();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StartUpFrame.fxml"));
            Parent root = loader.load();

            MainFrameController mainFrameController = loader.getController();
            mainFrameController.setClientesEmpleados(clientes, empleados);

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

    public void autenticarEmpleado(){
        if(empleados == null)
            return;

        for(Empleado empleado : empleados){
            if(tfUsuario.getText().equals(empleado.getCorreo()) && tfPassword.getText().equals(empleado.getPassword())){
                this.empleado = empleado;
                autenticado = true;
            }
        }
    }

}
