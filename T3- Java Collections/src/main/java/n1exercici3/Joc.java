package n1exercici3;

import java.io.*;
import java.util.*;

public class Joc {

    public static  HashMap<String, String> llegirFitxer(String ruta) throws IOException {
        HashMap<String, String> paisCapital = new HashMap<String, String>();
        try  {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            String linia;
            while ((linia = br.readLine()) != null) {
                String[] parts = linia.split(" ");
                if (parts.length > 1) {
                    paisCapital.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return paisCapital;
    }

    public static String paisRandom(HashMap<String, String> paisos) {
        Random random = new Random();
        List<String> claus = new ArrayList<>(paisos.keySet());
        return claus.get(random.nextInt(claus.size()));
    }

    public static String fitxaJugador() {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Com et dius?");
        String nom = teclat.nextLine();
        return nom;
    }

    public static int jugar(HashMap<String, String> paisCapital) {
        Scanner teclat = new Scanner(System.in);

        int contador = 1;
        int puntuacio = 0;



        while (contador < 11) {
           String pais = paisRandom(paisCapital);
           System.out.println("Pregunta número: " + contador);
            System.out.println(pais+ " quina és la seva capital?");
            String resposta = teclat.nextLine();
            if (resposta.equalsIgnoreCase(paisCapital.get(pais))) {
                System.out.println("Has encertat \uD83D\uDE03!");
                puntuacio += 1;
            } else {
                System.out.println("No has encertat \uD83D\uDE2D!");
            }
            contador++;
        }
        return puntuacio;

    }

    public static void crearFitxerClassificacio() {
        File classificacio1 = new File("Classificacio1.txt");

        try {
            File classificacio = new File("Classificacio1.txt");
            if (classificacio.createNewFile()) {
                System.out.println("Document creat " + classificacio.getName());
            } else {
                System.out.println("El document ja existeix.");
            }
        } catch (IOException e) {
            System.err.println("Sha produït un error.");
            e.printStackTrace();
        }
    }

    public static void escriureClassificacio(String nomJugador, int puntuacio) {
        try {
            FileWriter myWriter = new FileWriter("Classificacio1.txt", true);
            myWriter.write("El jugador " + nomJugador + " ha obtingut una puntuació de " + puntuacio + " punts sobre 10");
            myWriter.close();
            System.out.println("S'ha escrit la classificació al document.");
        } catch (IOException e) {
            System.err.println("Hi ha hagut un error.");
            e.printStackTrace();
        }
    }
}




