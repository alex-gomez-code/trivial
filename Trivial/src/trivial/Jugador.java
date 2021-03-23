package trivial;

public class Jugador {
    //Atributos
    private String nombre;
    private int puntos;

    //Constructores
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    //Métodos
    public void sumarPunto(){
        this.puntos++;
    }
    
}
