package trivial;

import java.util.Scanner;

public class Trivial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
//        Pregunta p = new Pregunta();
        System.out.println("1. Cargar preguntas desde un fichero.\n"
                + "2. Ver la última partida (la veremos al final).");
        String opcion = sc.nextLine();
        switch (opcion){
            case "1":
                 Fichero f = new Fichero(sc.nextLine());
//                f.setPath(sc.nextLine());
                f.cargarPreguntas();
                System.out.println(f.imprimePreguntas());
                
//                System.out.println( p.imprimePregunta());
//                p.imprimePregunta();
                break;
            case "2":
                break;
            default:
                System.out.println("Comando no válido.");
                break;
        }
    }
}
