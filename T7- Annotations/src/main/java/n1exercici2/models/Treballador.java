package n1exercici2.models;

public class Treballador {

    protected String nom;
    protected String cognom;
    protected double preuHora;

    public Treballador(String nom, String cognom, double preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public double getPreuHora() {
        return preuHora;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setPreuHora(double preuHora) {
        this.preuHora = preuHora;
    }

    @Override
    public String toString() {
        return super.toString();
    }


    public double calcularSou(int nHores) {
        double sou = nHores * preuHora;
        return sou;
    }
}
