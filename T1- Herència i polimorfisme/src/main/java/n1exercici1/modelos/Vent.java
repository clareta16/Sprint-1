package n1exercici1.modelos;

public class Vent extends Instrument {
	
	public Vent(String nom, double preu) {
	super(nom, preu);
	}
	
	public void tocar() {
		System.out.println("Està sonant un instrument de vent"); 
	}
}
