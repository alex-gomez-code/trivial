package trivial;
/**
 * Esta clase contiene los métodos de la clase Pregunta
 * @author Alejandro Gómez y Jaime Hidalgo
 * @version 1.0
 * @since 23/03/2021
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pregunta {

    //Atributos
    private String enunciado;
    private String[] opciones;
    private char correcta;

    /**
     * Constructor
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @param e Strring del constructor
     * @param o Array de opciones
     * @since 23/03/2021
     */
    public Pregunta(String e, String[] o) {
        enunciado = e;
        opciones = o;

    }

    /**
     * Getter enunciado
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @return Retorna el enunciado
     */
    public String getEnunciado() {
        return enunciado;
    }
    
    /**
     * Getter opciones
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @return Retorna las opciones
     */
    public String[] getOpciones() {
        return opciones;
    }

    /**
     * Getter correcta
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @return Retorna la correcta
     */
    public char getCorrecta() {
        return correcta;
    }
    
    /**
     * Setter enunciado
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @param enunciado Enunciado para el atributo
     */
    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }
    /**
     * Setter opciones
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @param opciones Array de Strings
     */
    public void setOpciones(String[] opciones) {
        this.opciones = opciones;
    }
    /**
     * Setter correcta
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @param correcta Opcion correcta
     */
    public void setCorrecta(char correcta) {
        this.correcta = correcta;
    }

    /**
     * Método para randomizar las preguntas, randomizar las opciones,
     * elegir la opción correcta e imprimir la pregunta
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 23/03/2021
     * @return Retorna las preguntas ya randomizadas
     */
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
