package trivial;

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

    //Constructores
    public Fichero() {
    }

    public Fichero(String p) {
        path = p;
        File archivo = new File(p.toString());
        f = archivo;
    }

    //Getters y setters
    public String getPath() {
        return path;
    }

    public File getF() {
        return f;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setF(File f) {
        File archivo = new File(path.toString());
        this.f = archivo;
    }

    public ArrayList<Pregunta> getPregunta() {
        return preguntas;
    }

    //Métodos
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
