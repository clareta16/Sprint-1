package n1exercici2.models;

public class Cotxe {
	
	private static final String marca = "Seat";
	private static String model;
	private final int potencia;
	
	public Cotxe(int potencia) {
		this.potencia = potencia;
		
	}

	public int getPotencia() {
		return potencia;
	}


	public static void frenar() {
		System.out.println("El vehicle està frenant");
	}
	
	public void accelerar() {
		System.out.println("El vehicle està accelerant");
	}
	
	
	
	

}
