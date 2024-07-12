package n1exercici1;

import n1exercici1.models.Treballador;
import n1exercici1.models.TreballadorOnline;
import n1exercici1.models.TreballadorPresencial;

public class CridarTreballador {

public static void tipusTreballadors() {
    int nHores = 200;
    Treballador jefe = new Treballador("Albert", "Serra", 36);
    TreballadorPresencial worker = new TreballadorPresencial("Ramon", "Garcia", 31);
    TreballadorOnline worker2 = new TreballadorOnline("Anna", "Pastor", 39);


    System.out.println("El treballador Albert té un sou de " + jefe.calcularSou(nHores));
    System.out.println("El treballador Ramon té un sou de " + worker.calcularSou(nHores));
    System.out.println("La treballadora Anna té un sou de " + worker2.calcularSou(nHores));
}
    }


