package trivial;

import java.util.Scanner;

public class Trivial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
//        Pregunta p = new Pregunta();
        System.out.println("1. Cargar preguntas desde un fichero.\n"
                + "2. Ver la última partida (la veremos al final).");
        String opcion = sc.nextLine();

        while (flag) {
            switch (opcion) {
                case "1":
                    Fichero f = new Fichero(sc.nextLine());
//                f.setPath(sc.nextLine());
                    f.cargarPreguntas();
                    System.out.println("Nombre del jugador");
                    String nombre = sc.nextLine();
                    Jugador j1 = new Jugador(nombre);

                    for (int i = 0; i < 5; i++) {
                        System.out.println(f.imprimePreguntas(i));
                        char respuesta = sc.nextLine().charAt(0);

                        if (respuesta == f.preguntas.get(i).getCorrecta()) {
                            j1.sumarPunto();
                            System.out.println("correcto tienes " + j1.getPuntos() + " puntos");

                        }
                    }

                    break;
                case "2":
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    System.out.println("Comando no válido.");
                    break;
            }
        }
    }
}
