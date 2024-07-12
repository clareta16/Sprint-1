package n2exercici1.models;

public class Telefon {
	private String marca;
	private String model;
	
	public Telefon(String marca, String model) {
		this.setMarca(marca);
		this.setModel(model);
	}
	
	
	public void trucar(String numero) {
		System.out.println("S'està trucant al número de teléfon escrit");
		
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}

}
