package n1exercici3;

import java.io.IOException;
import java.util.HashMap;

import static n1exercici3.Joc.*;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> llistaPaisCapital;
        try {
            llistaPaisCapital = llegirFitxer("countries.txt");

            crearFitxerClassificacio();
            String nomJugador = fitxaJugador();
            int puntuacio = jugar(llistaPaisCapital);
            escriureClassificacio(nomJugador, puntuacio);
        } catch (IOException e) {
            System.out.println("Error en llegir el fitxer de països.");
            e.printStackTrace();
        }
    }
}