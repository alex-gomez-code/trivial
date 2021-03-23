package trivial;
/**
 * Esta clase contiene los métodos de la clase Jugador
 * @author Alejandro Gómez y Jaime Hidalgo
 * @version 1.0
 * @since 22/03/2021
 */
public class Jugador {
    //Atributos
    private String nombre;
    private int puntos;

    /**
     * Constructor
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @param nombre
     * @since 22/03/2021
     */
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter nombre
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 22/03/2021
     * @return Retorna el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter puntos
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 22/03/2021
     * @return Retorna los puntos
     */
    public int getPuntos() {
        return puntos;
    }
    
    /**
     * Setter nombre
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 22/03/2021
     * @param nombre Nombre para el jugador
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     /**
     * Setter puntos
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 22/03/2021
     * @param puntos Puntos del jugador
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    /**
     * Método para sumar puntos
     * @author Alejandro Gómez y Jaime Hidalgo
     * @version 1.0
     * @since 22/03/2021
     */
    public void sumarPunto(){
        this.puntos++;
    }
    
}
