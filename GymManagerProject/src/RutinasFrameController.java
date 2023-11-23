import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
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

public class RutinasFrameController implements Initializable{

    private ArrayList<Cliente> clientes;
    private ArrayList<String> pierna;
    private ArrayList<String> pecho;
    private ArrayList<String> espalda;
    private ArrayList<String> brazo;

    ArrayList<Rutina> rutinas;

    private Cliente cliente; 
    private Rutina rutina;

    public void setCliente(Cliente cliente, ArrayList<Cliente> clientes){
        this.clientes = clientes;
        this.cliente = cliente;
    }

    @FXML
    private Button btnRegresar;

    @FXML
    private Label lbJuevesDescanso1;

    @FXML
    private Label lbJuevesDescanso2;

    @FXML
    private Label lbJuevesDescanso3;

    @FXML
    private Label lbJuevesDescanso4;

    @FXML
    private Label lbJuevesDescanso5;

    @FXML
    private Label lbJuevesDescanso6;

    @FXML
    private Label lbJuevesEjercicio1;

    @FXML
    private Label lbJuevesEjercicio2;

    @FXML
    private Label lbJuevesEjercicio3;

    @FXML
    private Label lbJuevesEjercicio4;

    @FXML
    private Label lbJuevesEjercicio5;

    @FXML
    private Label lbJuevesEjercicio6;

    @FXML
    private Label lbJuevesRepeticiones1;

    @FXML
    private Label lbJuevesRepeticiones2;

    @FXML
    private Label lbJuevesRepeticiones3;

    @FXML
    private Label lbJuevesRepeticiones4;

    @FXML
    private Label lbJuevesRepeticiones5;

    @FXML
    private Label lbJuevesRepeticiones6;

    @FXML
    private Label lbJuevesSeries1;

    @FXML
    private Label lbJuevesSeries2;

    @FXML
    private Label lbJuevesSeries3;

    @FXML
    private Label lbJuevesSeries4;

    @FXML
    private Label lbJuevesSeries5;

    @FXML
    private Label lbJuevesSeries6;

    @FXML
    private Label lbLunesDescanso1;

    @FXML
    private Label lbLunesDescanso2;

    @FXML
    private Label lbLunesDescanso3;

    @FXML
    private Label lbLunesDescanso4;

    @FXML
    private Label lbLunesDescanso5;

    @FXML
    private Label lbLunesDescanso6;

    @FXML
    private Label lbLunesEjercicio1;

    @FXML
    private Label lbLunesEjercicio2;

    @FXML
    private Label lbLunesEjercicio3;

    @FXML
    private Label lbLunesEjercicio4;

    @FXML
    private Label lbLunesEjercicio5;

    @FXML
    private Label lbLunesEjercicio6;

    @FXML
    private Label lbLunesRepeticiones1;

    @FXML
    private Label lbLunesRepeticiones2;

    @FXML
    private Label lbLunesRepeticiones3;

    @FXML
    private Label lbLunesRepeticiones4;

    @FXML
    private Label lbLunesRepeticiones5;

    @FXML
    private Label lbLunesRepeticiones6;

    @FXML
    private Label lbLunesSeries1;

    @FXML
    private Label lbLunesSeries2;

    @FXML
    private Label lbLunesSeries3;

    @FXML
    private Label lbLunesSeries4;

    @FXML
    private Label lbLunesSeries5;

    @FXML
    private Label lbLunesSeries6;

    @FXML
    private Label lbMartesDescanso1;

    @FXML
    private Label lbMartesDescanso2;

    @FXML
    private Label lbMartesDescanso3;

    @FXML
    private Label lbMartesDescanso4;

    @FXML
    private Label lbMartesDescanso5;

    @FXML
    private Label lbMartesDescanso6;

    @FXML
    private Label lbMartesEjercicio1;

    @FXML
    private Label lbMartesEjercicio2;

    @FXML
    private Label lbMartesEjercicio3;

    @FXML
    private Label lbMartesEjercicio4;

    @FXML
    private Label lbMartesEjercicio5;

    @FXML
    private Label lbMartesEjercicio6;

    @FXML
    private Label lbMartesRepeticiones1;

    @FXML
    private Label lbMartesRepeticiones2;

    @FXML
    private Label lbMartesRepeticiones3;

    @FXML
    private Label lbMartesRepeticiones4;

    @FXML
    private Label lbMartesRepeticiones5;

    @FXML
    private Label lbMartesRepeticiones6;

    @FXML
    private Label lbMartesSeries1;

    @FXML
    private Label lbMartesSeries2;

    @FXML
    private Label lbMartesSeries3;

    @FXML
    private Label lbMartesSeries4;

    @FXML
    private Label lbMartesSeries5;

    @FXML
    private Label lbMartesSeries6;

    @FXML
    private Label lbMiercolesDescanso1;

    @FXML
    private Label lbMiercolesDescanso2;

    @FXML
    private Label lbMiercolesDescanso3;

    @FXML
    private Label lbMiercolesDescanso4;

    @FXML
    private Label lbMiercolesDescanso5;

    @FXML
    private Label lbMiercolesDescanso6;

    @FXML
    private Label lbMiercolesEjercicio1;

    @FXML
    private Label lbMiercolesEjercicio2;

    @FXML
    private Label lbMiercolesEjercicio3;

    @FXML
    private Label lbMiercolesEjercicio4;

    @FXML
    private Label lbMiercolesEjercicio5;

    @FXML
    private Label lbMiercolesEjercicio6;

    @FXML
    private Label lbMiercolesRepeticiones1;

    @FXML
    private Label lbMiercolesRepeticiones2;

    @FXML
    private Label lbMiercolesRepeticiones3;

    @FXML
    private Label lbMiercolesRepeticiones4;

    @FXML
    private Label lbMiercolesRepeticiones5;

    @FXML
    private Label lbMiercolesRepeticiones6;

    @FXML
    private Label lbMiercolesSeries1;

    @FXML
    private Label lbMiercolesSeries2;

    @FXML
    private Label lbMiercolesSeries3;

    @FXML
    private Label lbMiercolesSeries4;

    @FXML
    private Label lbMiercolesSeries5;

    @FXML
    private Label lbMiercolesSeries6;

    @FXML
    private Label lbSabadoDescanso1;

    @FXML
    private Label lbSabadoDescanso2;

    @FXML
    private Label lbSabadoDescanso3;

    @FXML
    private Label lbSabadoDescanso4;

    @FXML
    private Label lbSabadoDescanso5;

    @FXML
    private Label lbSabadoDescanso6;

    @FXML
    private Label lbSabadoEjercicio1;

    @FXML
    private Label lbSabadoEjercicio2;

    @FXML
    private Label lbSabadoEjercicio3;

    @FXML
    private Label lbSabadoEjercicio4;

    @FXML
    private Label lbSabadoEjercicio5;

    @FXML
    private Label lbSabadoEjercicio6;

    @FXML
    private Label lbSabadoRepeticiones1;

    @FXML
    private Label lbSabadoRepeticiones2;

    @FXML
    private Label lbSabadoRepeticiones3;

    @FXML
    private Label lbSabadoRepeticiones4;

    @FXML
    private Label lbSabadoRepeticiones5;

    @FXML
    private Label lbSabadoRepeticiones6;

    @FXML
    private Label lbSabadoSeries1;

    @FXML
    private Label lbSabadoSeries2;

    @FXML
    private Label lbSabadoSeries3;

    @FXML
    private Label lbSabadoSeries4;

    @FXML
    private Label lbSabadoSeries5;

    @FXML
    private Label lbSabadoSeries6;

    @FXML
    private Label lbViernesDescanso1;

    @FXML
    private Label lbViernesDescanso2;

    @FXML
    private Label lbViernesDescanso3;

    @FXML
    private Label lbViernesDescanso4;

    @FXML
    private Label lbViernesDescanso5;

    @FXML
    private Label lbViernesDescanso6;

    @FXML
    private Label lbViernesEjercicio1;

    @FXML
    private Label lbViernesEjercicio2;

    @FXML
    private Label lbViernesEjercicio3;

    @FXML
    private Label lbViernesEjercicio4;

    @FXML
    private Label lbViernesEjercicio5;

    @FXML
    private Label lbViernesEjercicio6;

    @FXML
    private Label lbViernesRepeticiones1;

    @FXML
    private Label lbViernesRepeticiones2;

    @FXML
    private Label lbViernesRepeticiones3;

    @FXML
    private Label lbViernesRepeticiones4;

    @FXML
    private Label lbViernesRepeticiones5;

    @FXML
    private Label lbViernesRepeticiones6;

    @FXML
    private Label lbViernesSeries1;

    @FXML
    private Label lbViernesSeries2;

    @FXML
    private Label lbViernesSeries3;

    @FXML
    private Label lbViernesSeries4;

    @FXML
    private Label lbViernesSeries5;

    @FXML
    private Label lbViernesSeries6;

    @FXML
    private Label lbGrupoJueves;

    @FXML
    private Label lbGrupoLunes;

    @FXML
    private Label lbGrupoMartes;

    @FXML
    private Label lbGrupoMiercoles;

    @FXML
    private Label lbGrupoSabado;

    @FXML
    private Label lbGrupoViernes;

    private Label[] labelsEjerciciosLunes;
    private Label[] labelsRepLunes;
    private Label[] labelsSeriesLunes;
    private Label[] labelsDescansoLunes;
    
    private Label[] labelsEjerciciosMartes;
    private Label[] labelsRepMartes;
    private Label[] labelsSeriesMartes;
    private Label[] labelsDescansoMartes;
    
    private Label[] labelsEjerciciosMiercoles;
    private Label[] labelsRepMiercoles;
    private Label[] labelsSeriesMiercoles;
    private Label[] labelsDescansoMiercoles;
    
    private Label[] labelsEjerciciosJueves;
    private Label[] labelsRepJueves;
    private Label[] labelsSeriesJueves;
    private Label[] labelsDescansoJueves;
    
    private Label[] labelsEjerciciosViernes;
    private Label[] labelsRepViernes;
    private Label[] labelsSeriesViernes;
    private Label[] labelsDescansoViernes;
    
    private Label[] labelsEjerciciosSabado;
    private Label[] labelsRepSabado;
    private Label[] labelsSeriesSabado;
    private Label[] labelsDescansoSabado;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        labelsEjerciciosLunes = new Label[]{lbLunesEjercicio1, lbLunesEjercicio2, lbLunesEjercicio3, lbLunesEjercicio4, lbLunesEjercicio5, lbLunesEjercicio6};
        labelsRepLunes = new Label[]{lbLunesRepeticiones1, lbLunesRepeticiones2, lbLunesRepeticiones3, lbLunesRepeticiones4, lbLunesRepeticiones5, lbLunesRepeticiones6};
        labelsSeriesLunes = new Label[]{lbLunesSeries1, lbLunesSeries2, lbLunesSeries3, lbLunesSeries4, lbLunesSeries5, lbLunesSeries6};
        labelsDescansoLunes = new Label[]{lbLunesDescanso1, lbLunesDescanso2, lbLunesDescanso3, lbLunesDescanso4, lbLunesDescanso5, lbLunesDescanso6};

        labelsEjerciciosMartes = new Label[]{lbMartesEjercicio1, lbMartesEjercicio2, lbMartesEjercicio3, lbMartesEjercicio4, lbMartesEjercicio5, lbMartesEjercicio6};
        labelsRepMartes = new Label[]{lbMartesRepeticiones1, lbMartesRepeticiones2, lbMartesRepeticiones3, lbMartesRepeticiones4, lbMartesRepeticiones5, lbMartesRepeticiones6};
        labelsSeriesMartes = new Label[]{lbMartesSeries1, lbMartesSeries2, lbMartesSeries3, lbMartesSeries4, lbMartesSeries5, lbMartesSeries6};
        labelsDescansoMartes = new Label[]{lbMartesDescanso1, lbMartesDescanso2, lbMartesDescanso3, lbMartesDescanso4, lbMartesDescanso5, lbMartesDescanso6};

        labelsEjerciciosMiercoles = new Label[]{lbMiercolesEjercicio1, lbMiercolesEjercicio2, lbMiercolesEjercicio3, lbMiercolesEjercicio4, lbMiercolesEjercicio5, lbMiercolesEjercicio6};
        labelsRepMiercoles = new Label[]{lbMiercolesRepeticiones1, lbMiercolesRepeticiones2, lbMiercolesRepeticiones3, lbMiercolesRepeticiones4, lbMiercolesRepeticiones5, lbMiercolesRepeticiones6};
        labelsSeriesMiercoles = new Label[]{lbMiercolesSeries1, lbMiercolesSeries2, lbMiercolesSeries3, lbMiercolesSeries4, lbMiercolesSeries5, lbMiercolesSeries6};
        labelsDescansoMiercoles = new Label[]{lbMiercolesDescanso1, lbMiercolesDescanso2, lbMiercolesDescanso3, lbMiercolesDescanso4, lbMiercolesDescanso5, lbMiercolesDescanso6};

        labelsEjerciciosJueves = new Label[]{lbJuevesEjercicio1, lbJuevesEjercicio2, lbJuevesEjercicio3, lbJuevesEjercicio4, lbJuevesEjercicio5, lbJuevesEjercicio6};
        labelsRepJueves = new Label[]{lbJuevesRepeticiones1, lbJuevesRepeticiones2, lbJuevesRepeticiones3, lbJuevesRepeticiones4, lbJuevesRepeticiones5, lbJuevesRepeticiones6};
        labelsSeriesJueves = new Label[]{lbJuevesSeries1, lbJuevesSeries2, lbJuevesSeries3, lbJuevesSeries4, lbJuevesSeries5, lbJuevesSeries6};
        labelsDescansoJueves = new Label[]{lbJuevesDescanso1, lbJuevesDescanso2, lbJuevesDescanso3, lbJuevesDescanso4, lbJuevesDescanso5, lbJuevesDescanso6};

        labelsEjerciciosViernes = new Label[]{lbViernesEjercicio1, lbViernesEjercicio2, lbViernesEjercicio3, lbViernesEjercicio4, lbViernesEjercicio5, lbViernesEjercicio6};
        labelsRepViernes = new Label[]{lbViernesRepeticiones1, lbViernesRepeticiones2, lbViernesRepeticiones3, lbViernesRepeticiones4, lbViernesRepeticiones5, lbViernesRepeticiones6};
        labelsSeriesViernes = new Label[]{lbViernesSeries1, lbViernesSeries2, lbViernesSeries3, lbViernesSeries4, lbViernesSeries5, lbViernesSeries6};
        labelsDescansoViernes = new Label[]{lbViernesDescanso1, lbViernesDescanso2, lbViernesDescanso3, lbViernesDescanso4, lbViernesDescanso5, lbViernesDescanso6};

        labelsEjerciciosSabado = new Label[]{lbSabadoEjercicio1, lbSabadoEjercicio2, lbSabadoEjercicio3, lbSabadoEjercicio4, lbSabadoEjercicio5, lbSabadoEjercicio6};
        labelsRepSabado = new Label[]{lbSabadoRepeticiones1, lbSabadoRepeticiones2, lbSabadoRepeticiones3, lbSabadoRepeticiones4, lbSabadoRepeticiones5, lbSabadoRepeticiones6};
        labelsSeriesSabado = new Label[]{lbSabadoSeries1, lbSabadoSeries2, lbSabadoSeries3, lbSabadoSeries4, lbSabadoSeries5, lbSabadoSeries6};
        labelsDescansoSabado = new Label[]{lbSabadoDescanso1, lbSabadoDescanso2, lbSabadoDescanso3, lbSabadoDescanso4, lbSabadoDescanso5, lbSabadoDescanso6};

        // Lunes
        for (int i = 0; i < labelsEjerciciosLunes.length; i++) {
            labelsEjerciciosLunes[i].setText("-");
            labelsRepLunes[i].setText("-");
            labelsSeriesLunes[i].setText("-");
            labelsDescansoLunes[i].setText("-");
        }

        // Martes
        for (int i = 0; i < labelsEjerciciosMartes.length; i++) {
            labelsEjerciciosMartes[i].setText("-");
            labelsRepMartes[i].setText("-");
            labelsSeriesMartes[i].setText("-");
            labelsDescansoMartes[i].setText("-");
        }

        // Miércoles
        for (int i = 0; i < labelsEjerciciosMiercoles.length; i++) {
            labelsEjerciciosMiercoles[i].setText("-");
            labelsRepMiercoles[i].setText("-");
            labelsSeriesMiercoles[i].setText("-");
            labelsDescansoMiercoles[i].setText("-");
        }

        // Jueves
        for (int i = 0; i < labelsEjerciciosJueves.length; i++) {
            labelsEjerciciosJueves[i].setText("-");
            labelsRepJueves[i].setText("-");
            labelsSeriesJueves[i].setText("-");
            labelsDescansoJueves[i].setText("-");
        }

        // Viernes
        for (int i = 0; i < labelsEjerciciosViernes.length; i++) {
            labelsEjerciciosViernes[i].setText("-");
            labelsRepViernes[i].setText("-");
            labelsSeriesViernes[i].setText("-");
            labelsDescansoViernes[i].setText("-");
        }

        // Sábado
        for (int i = 0; i < labelsEjerciciosSabado.length; i++) {
            labelsEjerciciosSabado[i].setText("-");
            labelsRepSabado[i].setText("-");
            labelsSeriesSabado[i].setText("-");
            labelsDescansoSabado[i].setText("-");
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

    void cargarRutinas(String path){

        rutinas = new ArrayList<Rutina>();

        try{
            Scanner scan = new Scanner(new File(path));//Se lee el archivo CSV
            scan.useDelimiter(",");

            if(scan.hasNextLine()){//Se salta la linea de titulos
                scan.nextLine();
            }

            while(scan.hasNextLine()){
                String[] rutinasData = scan.nextLine().split(",");//Se separa cada casill

                String[] dias = {rutinasData[2],rutinasData[3],rutinasData[4],rutinasData[5],rutinasData[6],rutinasData[7]};
                Rutina miRutina = new Rutina(1, dias, rutinasData[1]); 
                rutinas.add(miRutina);
            }

        System.out.println("Archivo de rutinas cargados correctamente...");

        }catch(Exception e){//Si no se puede cargar el archivo, se mostrara el siguiente mensaje
            System.out.println("\nNo se ha podido cargar el archivo de rutinas, puede que todavia no exista...");
            System.out.println("Motivo: " + e);
        }
    }

    void verRutina(){

        System.out.println("Mostrando rutina...");

        for(Rutina rutina : rutinas){
            if(rutina.getId().equals(cliente.getId())){
                this.rutina = rutina;
                System.out.println(rutina.getSecuenciaLunes().size());
            }
        }

        if(rutina == null)
            return;

        //Titulos
        String[] diasGrupos = rutina.getDias();
        lbGrupoLunes.setText(diasGrupos[0]);
        lbGrupoMartes.setText(diasGrupos[1]);
        lbGrupoMiercoles.setText(diasGrupos[2]);
        lbGrupoJueves.setText(diasGrupos[3]);
        lbGrupoViernes.setText(diasGrupos[4]);
        lbGrupoSabado.setText(diasGrupos[5]);

        //Lunes
        if(rutina.getSecuenciaLunes() != null){
            for(int i = 0; i < rutina.getSecuenciaLunes().size(); i++){
                labelsEjerciciosLunes[i].setText(rutina.getSecuenciaLunes().get(i).getEjercicio());
                labelsRepLunes[i].setText(rutina.getSecuenciaLunes().get(i).getRepeticiones());
                labelsSeriesLunes[i].setText(rutina.getSecuenciaLunes().get(i).getSeries());
                labelsDescansoLunes[i].setText(rutina.getSecuenciaLunes().get(i).getDescanso());
            }
        }

        // Martes
        if (rutina.getSecuenciaMartes() != null) {
            for (int i = 0; i < rutina.getSecuenciaMartes().size(); i++) {
                labelsEjerciciosMartes[i].setText(rutina.getSecuenciaMartes().get(i).getEjercicio());
                labelsRepMartes[i].setText(rutina.getSecuenciaMartes().get(i).getRepeticiones());
                labelsSeriesMartes[i].setText(rutina.getSecuenciaMartes().get(i).getSeries());
                labelsDescansoMartes[i].setText(rutina.getSecuenciaMartes().get(i).getDescanso());
            }
        }

        // Miércoles
        if (rutina.getSecuenciaMiercoles() != null) {
            for (int i = 0; i < rutina.getSecuenciaMiercoles().size(); i++) {
                labelsEjerciciosMiercoles[i].setText(rutina.getSecuenciaMiercoles().get(i).getEjercicio());
                labelsRepMiercoles[i].setText(rutina.getSecuenciaMiercoles().get(i).getRepeticiones());
                labelsSeriesMiercoles[i].setText(rutina.getSecuenciaMiercoles().get(i).getSeries());
                labelsDescansoMiercoles[i].setText(rutina.getSecuenciaMiercoles().get(i).getDescanso());
            }
        }

        // Jueves
        if (rutina.getSecuenciaJueves() != null) {
            for (int i = 0; i < rutina.getSecuenciaJueves().size(); i++) {
                labelsEjerciciosJueves[i].setText(rutina.getSecuenciaJueves().get(i).getEjercicio());
                labelsRepJueves[i].setText(rutina.getSecuenciaJueves().get(i).getRepeticiones());
                labelsSeriesJueves[i].setText(rutina.getSecuenciaJueves().get(i).getSeries());
                labelsDescansoJueves[i].setText(rutina.getSecuenciaJueves().get(i).getDescanso());
            }
        }

        // Viernes
        if (rutina.getSecuenciaViernes() != null) {
            for (int i = 0; i < rutina.getSecuenciaViernes().size(); i++) {
                labelsEjerciciosViernes[i].setText(rutina.getSecuenciaViernes().get(i).getEjercicio());
                labelsRepViernes[i].setText(rutina.getSecuenciaViernes().get(i).getRepeticiones());
                labelsSeriesViernes[i].setText(rutina.getSecuenciaViernes().get(i).getSeries());
                labelsDescansoViernes[i].setText(rutina.getSecuenciaViernes().get(i).getDescanso());
            }
        }

        // Sábado
        if (rutina.getSecuenciaSabado() != null) {
            for (int i = 0; i < rutina.getSecuenciaSabado().size(); i++) {
                labelsEjerciciosSabado[i].setText(rutina.getSecuenciaSabado().get(i).getEjercicio());
                labelsRepSabado[i].setText(rutina.getSecuenciaSabado().get(i).getRepeticiones());
                labelsSeriesSabado[i].setText(rutina.getSecuenciaSabado().get(i).getSeries());
                labelsDescansoSabado[i].setText(rutina.getSecuenciaSabado().get(i).getDescanso());
            }
        }

    }

}
