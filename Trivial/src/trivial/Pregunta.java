package trivial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pregunta {

    //Atributos
    private String enunciado;
    private String[] opciones;
    private char correcta;

    //Constructores
    public Pregunta(String e, String[] o) {
        enunciado = e;
        opciones = o;

    }

    //Getters y setters
    public String getEnunciado() {
        return enunciado;
    }

    public String[] getOpciones() {
        return opciones;
    }

    public char getCorrecta() {
        return correcta;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }

    public void setCorrecta(char correcta) {
        this.correcta = correcta;
    }

    //Métodos
    public String imprimePregunta() {
        ArrayList<String> mylist = new ArrayList<String>();
        for (int i = 0; i < opciones.length; i++) {
            mylist.add(opciones[i]);
        }
        Collections.shuffle(mylist);

        if (opciones[0] == mylist.get(0)) {
            correcta = 'A';
        } else if (opciones[0] == mylist.get(1)) {
            correcta = 'B';
        } else if (opciones[0] == mylist.get(2)) {
            correcta = 'C';
        } else if (opciones[0] == mylist.get(3)) {
            correcta = 'D';
        }

        String pregunta = enunciado + "\n"
                + "" + "A: " + mylist.get(0) + "\n"
                + "" + "B: " + mylist.get(1) + "\n"
                + "" + "C: " + mylist.get(2) + "\n"
                + "" + "D: " + mylist.get(3);
        return pregunta;

    }
}
