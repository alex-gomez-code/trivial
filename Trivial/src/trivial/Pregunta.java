package trivial;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pregunta {
    //Atributos
    private String enunciado;
    private String[] opciones;
    private char correcta;
    
    //Constructores
    public Pregunta() {
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
    public String imprimePregunta(){
        List<String> preguntas = Arrays.asList(this.opciones);
        Collections.shuffle(preguntas);
        String pregunta = "\n";
        pregunta += enunciado + "\n"
                + "A: " + preguntas.get(0) + "\n"
                + "B: " + preguntas.get(1) + "\n"
                + "C: " + preguntas.get(2) + "\n"
                + "D: " + preguntas.get(3) + "\n";
        return pregunta;
    }
}
