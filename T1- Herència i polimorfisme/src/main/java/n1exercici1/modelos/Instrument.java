package n1exercici1.modelos;

public abstract class Instrument {
	protected String nom;
	protected double preu;
	
	public Instrument(String nom, double preu) {
	
	this.nom = nom;
	this.preu = preu;
	
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}
	
	public String toString() {
		return "Instrument [nom=" + nom + ", preu=" + preu + "]";
	}

	public abstract void tocar();
	
	static {
        System.out.println("La classe Instrument està carregada");
    }

}
