package trivial;
/**
 * Esta clase contiene los métodos de la clase Fichero
 * @author Alejandro Gómez y Jaime Hidalgo
 * @version 1.0
 * @since 23/03/2021
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fichero {

    //Atributos
    private String path;
    private File f;
    ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();

    /**
     * Constructor por defecto
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     */
    public Fichero() {
    }
    
    /**
     * Constructor
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @param p String del path
     * @since 23/03/2021
     */
    public Fichero(String p) {
        path = p;
        File archivo = new File(p.toString());
        f = archivo;
    }

    /**
     * Getter path
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @return Retorna el path de nuestro fichero
     */
    public String getPath() {
        return path;
    }

     /**
     * Getter File
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @return Retorna el File creado
     */
    public File getF() {
        return f;
    }
    
     /**
     * Getter ArrayList de Pregunta
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @return Retorna el array de preguntas
     */
    public ArrayList<Pregunta> getPregunta() {
        return preguntas;
    }

     /**
     * Setter path
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @param path El nuevo Path
     */
    public void setPath(String path) {
        this.path = path;
    }
    
     /**
     * Setter File
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @param f Nuevo File a setear
     */
    public void setF(File f) {
        File archivo = new File(path.toString());
        this.f = archivo;
    }

    /**
     * Método para crear nuestros objetos preguntas según
     * el archivo que creamos a través del path
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @return Retorna un array de preguntas randomizado
     */
    public ArrayList<Pregunta> cargarPreguntas() {
        boolean flag = true;
        try {
            FileReader fr = new FileReader(this.f);
            BufferedReader br = new BufferedReader(fr);
            String enunciado = "";
            String na = "";

            while ((enunciado = br.readLine()) != null) {
                String[] opc = new String[4];
                for (int i = 0; i < opc.length; i++) {
                    opc[i] = br.readLine();
                }
                preguntas.add(new Pregunta(enunciado, opc));
            }
            Collections.shuffle(preguntas);
            br.close();
            fr.close();
        } catch (FileNotFoundException fnfe) {
            System.err.println("Error File: " + fnfe.getMessage());
        } catch (IOException ex) {
            System.out.println("Error File: " + ex.getMessage());
        }
        return preguntas;
    }

    public String imprimePreguntas(int num) {
        String pregunta = "";
        return pregunta = preguntas.get(num).imprimePregunta();

    }
}
