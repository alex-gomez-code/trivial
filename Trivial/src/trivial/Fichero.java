package trivial;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fichero {
    //Atributos
    private String path;
    private File f;

    //Constructores
    public Fichero() {
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
        this.f = f;
    }
    
    //Métodos
    public ArrayList<Pregunta> cargarPreguntas(){
        ArrayList<Pregunta> preguntas = new ArrayList<Pregunta>();
        try {
            FileReader fr = new FileReader(this.f);
            BufferedReader br = new BufferedReader(fr);
            while(br.readLine() != null){
                String enunciado = br.readLine();
                String opciones[] = new String[3];
                Pregunta p = new Pregunta();
                p.setEnunciado(enunciado);
                for (int i = 0; i < opciones.length; i++) {
                    opciones[i] = br.readLine();
                }
                preguntas.add(p);
            }
            br.close();
            fr.close();
        } catch (FileNotFoundException fnfe) {
            System.err.println("Error File: " + fnfe.getMessage());
        } catch (IOException ex) {
            System.out.println("Error File: " + ex.getMessage());
        }
        return preguntas;
    }
}
