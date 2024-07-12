package n1exercici2;

import n1exercici2.models.Treballador;
import n1exercici2.models.TreballadorOnline;
import n1exercici2.models.TreballadorPresencial;

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

    @SuppressWarnings("deprecation")
public static void cridarMetodeSouTrimestral() {
   double souPresencial = TreballadorPresencial.calcularSouTrimestral(30);
        System.out.println("El sou trimestral del treballador presencial és " + souPresencial);

        double souOnline = TreballadorOnline.calcularSouTrimestral(30);
        System.out.println("El sou trimestral del treballador online és " + souOnline);
}
    }


