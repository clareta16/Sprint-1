package n2exercici1.models;

public class Smartphone extends Telefon implements Camera, Rellotge {
	
	public Smartphone(String marca, String model) {
		super(marca, model);
	}



	@Override
	public String alarma() {
		
		return "Està sonant l'alarma";
	}


	@Override
	public String fotografiar() {
	
		return "s'està fent una foto";
	}
	
	public String toString() {
		return "Smartphone []";
	}
	
}
