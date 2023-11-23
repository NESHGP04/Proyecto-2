/* Proyecto#2 POO
 * Autores: Marinés García 23391, Nery Molina 23218, Kevin Villagrán 23584, Álvaro León 23274
 * CLASS
 */

import java.io.File;
import java.util.*;

public class Rutina{
    private ArrayList<Secuencia> secuenciaLunes = new ArrayList<Secuencia>();
    private ArrayList<Secuencia> secuenciaMartes = new ArrayList<Secuencia>();
    private ArrayList<Secuencia> secuenciaMiercoles = new ArrayList<Secuencia>();
    private ArrayList<Secuencia> secuenciaJueves = new ArrayList<Secuencia>();
    private ArrayList<Secuencia> secuenciaViernes = new ArrayList<Secuencia>();
    private ArrayList<Secuencia> secuenciaSabado = new ArrayList<Secuencia>();

    private ArrayList<String> ejercicios;

    private String[] dias = new String[6];
    private int tipo;
    private String id;

    Rutina(int tipo, String[] trabajoDias, String id){
        for(int i = 0; i < dias.length; i++){
            dias[i] = trabajoDias[i];
        }

        this.tipo = tipo;
        this.id = id;

        String path = "Ejercicios.csv";
        String[] metas = {"Bajar", "Mantener", "Subir"};

        try{
            Scanner scan = new Scanner(new File(path));//Se lee el archivo CSV
            scan.useDelimiter(",");

            if(scan.hasNextLine()){//Se salta la linea de titulos
                scan.nextLine();
            }

            while(scan.hasNextLine()){
                String[] ejerciciosData = scan.nextLine().split(",");//Se separa cada casilla
                if(trabajoDias[0].equals("Descanso")){
                    secuenciaLunes = null;
                }
                else if(ejerciciosData[1].equals(trabajoDias[0]) && ejerciciosData[5].equals(metas[tipo-1])){
                    Secuencia secuencia = new Secuencia(ejerciciosData[0], ejerciciosData[2], ejerciciosData[3], ejerciciosData[4]);
                    secuenciaLunes.add(secuencia);
                }

                if(trabajoDias[1].equals("Descanso")){
                    secuenciaMartes = null;
                }else if(ejerciciosData[1].equals(trabajoDias[1]) && ejerciciosData[5].equals(metas[tipo-1])){
                    Secuencia secuencia = new Secuencia(ejerciciosData[0], ejerciciosData[2], ejerciciosData[3], ejerciciosData[4]);
                    secuenciaMartes.add(secuencia);
                }

                if(trabajoDias[2].equals("Descanso")){
                    secuenciaMiercoles = null;
                }else if(ejerciciosData[1].equals(trabajoDias[2]) && ejerciciosData[5].equals(metas[tipo-1])){
                    Secuencia secuencia = new Secuencia(ejerciciosData[0], ejerciciosData[2], ejerciciosData[3], ejerciciosData[4]);
                    secuenciaMiercoles.add(secuencia);
                }

                if(trabajoDias[3].equals("Descanso")){
                    secuenciaJueves = null;
                }else if(ejerciciosData[1].equals(trabajoDias[3]) && ejerciciosData[5].equals(metas[tipo-1])){
                    Secuencia secuencia = new Secuencia(ejerciciosData[0], ejerciciosData[2], ejerciciosData[3], ejerciciosData[4]);
                    secuenciaJueves.add(secuencia);
                }
                
                if(trabajoDias[4].equals("Descanso")){
                    secuenciaViernes = null;
                }else if(ejerciciosData[1].equals(trabajoDias[4]) && ejerciciosData[5].equals(metas[tipo-1])){
                    Secuencia secuencia = new Secuencia(ejerciciosData[0], ejerciciosData[2], ejerciciosData[3], ejerciciosData[4]);
                    secuenciaViernes.add(secuencia);
                }
                
                if(trabajoDias[5].equals("Descanso")){
                    secuenciaSabado = null;
                }else if(ejerciciosData[1].equals(trabajoDias[5]) && ejerciciosData[5].equals(metas[tipo-1])){
                    Secuencia secuencia = new Secuencia(ejerciciosData[0], ejerciciosData[2], ejerciciosData[3], ejerciciosData[4]);
                    secuenciaSabado.add(secuencia);
                }
            }

        System.out.println("Archivo de ejercicios cargados correctamente...");

        }catch(Exception e){//Si no se puede cargar el archivo, se mostrara el siguiente mensaje
            System.out.println("\nNo se ha podido cargar el archivo, puede que todavia no exista...");
            System.out.println("Motivo: " + e);
        }
    }

    public ArrayList<Secuencia> getSecuenciaLunes(){
        return secuenciaLunes;
    }

    public ArrayList<Secuencia> getSecuenciaMartes(){
        return secuenciaMartes;
    }

    public ArrayList<Secuencia> getSecuenciaMiercoles(){
        return secuenciaMiercoles;
    }

    public ArrayList<Secuencia> getSecuenciaJueves(){
        return secuenciaJueves;
    }

    public ArrayList<Secuencia> getSecuenciaViernes(){
        return secuenciaViernes;
    }

    public ArrayList<Secuencia> getSecuenciaSabado(){
        return secuenciaSabado;
    }

    public String[] getDias(){
        return dias;
    }

    public void setDias(String ... dias){
        this.dias = dias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toCSV(){
        String joinedDias = String.join(",",dias);

        return tipo+","+id+","+joinedDias;
    }
}