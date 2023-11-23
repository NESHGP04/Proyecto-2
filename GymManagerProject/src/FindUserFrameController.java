import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FindUserFrameController {

    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;
    private Empleado empleado;

    public void setEmpleado(Empleado empleado, ArrayList<Empleado> empleados, ArrayList<Cliente> clientes) {
        this.empleado = empleado;
        this.empleados = empleados;
        this.clientes = clientes;
    }

    @FXML
    private Button btnBuscar;

    @FXML
    private Button btnRegresar;

    @FXML
    private Label lbAltura;

    @FXML
    private Label lbCorreo;

    @FXML
    private Label lbDPI;

    @FXML
    private Label lbEdad;

    @FXML
    private Label lbNombre;

    @FXML
    private Label lbNombreTitulo;

    @FXML
    private Label lbObjetivo;

    @FXML
    private Label lbPeso;

    @FXML
    private Label lbPlan;

    @FXML
    private Label lbSede;

    @FXML
    private TextField tfClienteID;

    @FXML
    void btnBuscarClicked(ActionEvent event) {
        for(Cliente cliente : clientes){
            if(cliente.getId().equals(tfClienteID.getText())){
                lbNombreTitulo.setText(cliente.getNombre());
                lbNombre.setText(cliente.getNombre());
                lbCorreo.setText(cliente.getCorreo());
                lbDPI.setText(cliente.getDpi());
                lbEdad.setText(Integer.toString(cliente.getEdad()) + " años");
                lbPeso.setText(Float.toString(cliente.getPeso()) + " lb");
                lbAltura.setText(Float.toString(cliente.getAltura()) + " metros");
                switch (cliente.getMetaPeso()) {
                    case 1:
                        lbObjetivo.setText("Bajar peso");
                        break;
                    case 2:
                        lbObjetivo.setText("Mantener peso");
                        break;
                    case 3:
                        lbObjetivo.setText("Subir peso");
                        break;
                }
                if(cliente instanceof Basico)
                    lbPlan.setText("Basico");
                else if(cliente instanceof Fitness)
                    lbPlan.setText("Fitness");
                else if(cliente instanceof Nutricion)
                    lbPlan.setText("Nutricional");
                else if(cliente instanceof Premium)
                    lbPlan.setText("Premium");

                lbSede.setText(cliente.getSede());
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

}
