package n1exercici2.models;

public class TreballadorOnline extends Treballador {
    private final double internet = 20.0;

    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }

    public double getInternet() {
        return internet;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    // mètode extret de la classe mare treballador que al fer override es sobreescriu
    @Override
    public double calcularSou(int nHores) { //nHores està a cridarTreballador
        double sou = super.calcularSou(nHores) + internet;
        return sou;
    }
// deprecated és un mètode que
    @Deprecated
    public static double calcularSouTrimestral(int preuHora) {
        int horesSetmana = 40;
        int setmanes = 12;
        double sou = preuHora * horesSetmana * setmanes;
        return sou;

    }
}





