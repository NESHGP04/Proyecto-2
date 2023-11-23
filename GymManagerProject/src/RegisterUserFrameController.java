import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextFormatter;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

public class RegisterUserFrameController {

    private ArrayList<Cliente> clientes;
    private Cliente cliente;

    private int objetivo = 0;
    private String plan = null;

    public void setCliente(ArrayList<Cliente> clientes){
        this.clientes = clientes;
    }

    @FXML
    private Button btnRegistrarse;

    @FXML
    private Button btnRegresar;

    @FXML
    private CheckBox cbBajar;

    @FXML
    private CheckBox cbBasico;

    @FXML
    private CheckBox cbFitness;

    @FXML
    private CheckBox cbMantener;

    @FXML
    private CheckBox cbNutricional;

    @FXML
    private CheckBox cbPremium;

    @FXML
    private CheckBox cbSubir;

    @FXML
    private TextArea tfApellido;

    @FXML
    private TextArea tfEdad;

    @FXML
    private TextArea tfPeso;

    @FXML
    private TextArea tfAltura;
    
    @FXML
    private TextArea tfCorreo;

    @FXML
    private TextArea tfDPI;

    @FXML
    private TextArea tfNombre;

    @FXML
    private PasswordField tfPassword;

    @FXML
    private TextArea tfSede;

    @FXML
    private void initialize(){

        //Objetivo
        cbBajar.setOnAction(event -> handleCheckBoxActionObjetivo(cbBajar));
        cbMantener.setOnAction(event -> handleCheckBoxActionObjetivo(cbMantener));
        cbSubir.setOnAction(event -> handleCheckBoxActionObjetivo(cbSubir));

        //Plan
        cbBasico.setOnAction(event -> handleCheckBoxActionPlan(cbBasico));
        cbFitness.setOnAction(event -> handleCheckBoxActionPlan(cbFitness));
        cbNutricional.setOnAction(event -> handleCheckBoxActionPlan(cbNutricional));
        cbPremium.setOnAction(event -> handleCheckBoxActionPlan(cbPremium));
    }

    @FXML
    void onKeyTyped(KeyEvent event) {
        String caracter = event.getCharacter();

        if(!esDigito(caracter)){
            event.consume();
        }
    }

    private boolean esDigito(String caracter) {
        // Verifica si el carácter es un dígito
        return caracter.matches("\\d");
    }

    private void handleCheckBoxActionObjetivo(CheckBox checkBox) {
        // Desselecciona los demás CheckBox cuando uno se selecciona
        if (checkBox.isSelected()) {
            if (checkBox == cbBajar) {
                objetivo = 1;
                cbMantener.setSelected(false);
                cbSubir.setSelected(false);
            } else if (checkBox == cbMantener) {
                objetivo = 2;
                cbBajar.setSelected(false);
                cbSubir.setSelected(false);
            } else if (checkBox == cbSubir) {
                objetivo = 3;
                cbBajar.setSelected(false);
                cbMantener.setSelected(false);
            }
        }
    }

    private void handleCheckBoxActionPlan(CheckBox checkBox) {
        // Desselecciona los demás CheckBox cuando uno se selecciona
        if (checkBox.isSelected()) {
            if (checkBox == cbBasico) {
                plan = "Basico";
                cbFitness.setSelected(false);
                cbNutricional.setSelected(false);
                cbPremium.setSelected(false);
            } else if (checkBox == cbFitness) {
                plan = "Fitness";
                cbBasico.setSelected(false);
                cbNutricional.setSelected(false);
                cbPremium.setSelected(false);
            } else if (checkBox == cbNutricional) {
                plan = "Nutricional";
                cbBasico.setSelected(false);
                cbFitness.setSelected(false);
                cbPremium.setSelected(false);
            } else if (checkBox == cbPremium) {
                plan = "Premium";
                cbBasico.setSelected(false);
                cbFitness.setSelected(false);
                cbNutricional.setSelected(false);
            }
        }
    }

    public void registrarUsuario(){
        switch (plan) {
            case "Basico":
                Basico basico = new Basico(tfNombre.getText()+" "+tfApellido.getText(),Integer.parseInt(tfEdad.getText()),tfDPI.getText(),Float.parseFloat(tfPeso.getText()),Float.parseFloat(tfAltura.getText()),objetivo,Integer.toString(clientes.size()+1),Integer.toString(clientes.size()+1),Integer.toString(clientes.size()+1),tfSede.getText(),tfPassword.getText(),tfCorreo.getText());
                clientes.add(basico);
                cliente = basico;
                break;
            case "Fitness":
                Fitness fitness = new Fitness(tfNombre.getText()+" "+tfApellido.getText(),Integer.parseInt(tfEdad.getText()),tfDPI.getText(),Float.parseFloat(tfPeso.getText()),Float.parseFloat(tfAltura.getText()),objetivo,Integer.toString(clientes.size()+1),Integer.toString(clientes.size()+1),Integer.toString(clientes.size()+1),tfSede.getText(),tfPassword.getText(),tfCorreo.getText());
                clientes.add(fitness);
                cliente = fitness;
                break;
            case "Nutricional":
                Nutricion nutricion = new Nutricion(tfNombre.getText()+" "+tfApellido.getText(),Integer.parseInt(tfEdad.getText()),tfDPI.getText(),Float.parseFloat(tfPeso.getText()),Float.parseFloat(tfAltura.getText()),objetivo,Integer.toString(clientes.size()+1),Integer.toString(clientes.size()+1),Integer.toString(clientes.size()+1),tfSede.getText(),tfPassword.getText(),tfCorreo.getText());
                clientes.add(nutricion);
                cliente = nutricion;              
                break;
            case "Premium":
                Premium premium = new Premium(tfNombre.getText()+" "+tfApellido.getText(),Integer.parseInt(tfEdad.getText()),tfDPI.getText(),Float.parseFloat(tfPeso.getText()),Float.parseFloat(tfAltura.getText()),objetivo,Integer.toString(clientes.size()+1),Integer.toString(clientes.size()+1),Integer.toString(clientes.size()+1),tfSede.getText(),tfPassword.getText(),tfCorreo.getText());
                clientes.add(premium);
                cliente = premium;                
                break;        
            default:
                break;
        }
    }

    @FXML
    void btnRegistrarseClicked(ActionEvent event) {

        if(tfNombre.getText().equals(null) || tfApellido.getText().equals(null) || tfDPI.getText().equals(null) || tfCorreo.getText().equals(null) || tfSede.getText().equals(null) || plan.equals(null) || objetivo == 0)
            return;

        registrarUsuario();
        guardarClientes(clientes);
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

    private void guardarClientes(ArrayList<Cliente> clientes){
        File archivoCSV = new File("Cliente.csv");//Se prepara el archivo que se creara

        try{
            PrintWriter out = new PrintWriter(archivoCSV);//Para escribir en el archivo

            String[] titulos = {"nombre","edad","dpi","peso","altura","metaPeso","id","rutinaID","dietaID","sede","password","correo","plan"};

            for(String titulo : titulos)
                out.print(titulo + ",");//Escribimos los titulos

            out.println();

            for(Cliente cliente : clientes){
                if(cliente instanceof Basico)
                    out.println(cliente.guardarDatos()+",Basico");
                else if(cliente instanceof Fitness)
                    out.println(cliente.guardarDatos()+",Fitness");
                else if(cliente instanceof Nutricion)
                    out.println(cliente.guardarDatos()+",Nutricional");
                else if(cliente instanceof Premium)
                    out.println(cliente.guardarDatos()+",Premium");

            }

            out.close();//Cerramos y guardamos el archivo

            System.out.println("\nArchivo csv guardado correctamente....");
        }catch(FileNotFoundException e){//En caso de que no se pueda crear
            System.out.println("No se ha encontrado el archivo");
        }
    }     
}
