package n1exercici1.models;

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
}





