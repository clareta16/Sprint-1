package n1exercici1.models;

public class TreballadorPresencial extends Treballador {
    private static final double benzina = 50.0;

    public TreballadorPresencial(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);

    }
    public static double getBenzina() {
        return benzina;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    // mètode extret de la classe mare treballador que al fer override es sobreescriu
    @Override
    public double calcularSou(int nHores) {
        double sou = super.calcularSou(nHores) + benzina;
        return sou;
    }
}
