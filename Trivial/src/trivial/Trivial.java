package trivial;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Trivial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Fichero f = new Fichero();
        do {
            System.out.println("1. Cargar preguntas desde un fichero.\n"
                    + "2. Ver la última partida (la veremos al final).\n"
                    + "3. Jugar con las preguntas anteriores.\n"
                    + "4. Salir.\n"
                    + "5. Aprobado general.");
            String opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("¿Desde dónde cargamos las preguntas?");
                    f = new Fichero(sc.nextLine());
                    f.cargarPreguntas();
                    System.out.print("Nombre del jugador: ");
                    String nombre = sc.nextLine();
                    Jugador j1 = new Jugador(nombre);
                    for (int i = 0; i < 5; i++) {
                        System.out.println(f.imprimePreguntas(i));
                        char respuesta = sc.nextLine().charAt(0);
                        if (respuesta == f.preguntas.get(i).getCorrecta()) {
                            j1.sumarPunto();
                            System.out.println("¡CORRECTO! ¡TIENES " + j1.getPuntos() + " PUNTOS!");
                        } else {
                            System.out.println("¡HAS FALLADO! ¡TIENES " + j1.getPuntos() + " PUNTOS!");
                        }
                    }
                    try {
                        FileOutputStream salida = new FileOutputStream("datos");
                        DataOutputStream oos = new DataOutputStream(salida);
                        oos.writeUTF(j1.getNombre());
                        oos.writeInt(j1.getPuntos());
                        oos.close();
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "2":
                    try {
                        FileInputStream streamEntrada = new FileInputStream("datos");
                        DataInputStream dis = new DataInputStream(streamEntrada);
                        String playerName = dis.readUTF();
                        int numPuntos = dis.readInt();
                        System.out.println("El jugador " + playerName + " tuvo " + numPuntos + " puntos.");
                    } catch (FileNotFoundException ex) {
                        System.err.println("Error File: " + ex.getMessage());
                    } catch (IOException ex) {
                        System.err.println("Error: " + ex.getMessage());
                    }
                    break;
                case "3":
                    System.out.print("Nombre del jugador: ");
                    String nombre2 = sc.nextLine();
                    Jugador j2 = new Jugador(nombre2);
                    for (int i = 0; i < 5; i++) {
                        System.out.println(f.imprimePreguntas(i));
                        char respuesta = sc.nextLine().charAt(0);
                        if (respuesta == f.preguntas.get(i).getCorrecta()) {
                            j2.sumarPunto();
                            System.out.println("¡CORRECTO! ¡TIENES " + j2.getPuntos() + " PUNTOS!");
                        } else {
                            System.out.println("¡HAS FALLADO! ¡TIENES " + j2.getPuntos() + " PUNTOS!");
                        }
                    }
                    try {
                        FileOutputStream salida = new FileOutputStream("datos");
                        DataOutputStream oos = new DataOutputStream(salida);
                        oos.writeUTF(j2.getNombre());
                        oos.writeInt(j2.getPuntos());
                        oos.close();
                    } catch (FileNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    } catch (IOException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case "4":
                    flag = false;
                    break;
                default:
                    System.out.println("Comando no válido.");
                    break;
            }
        } while (flag);
    }
}
