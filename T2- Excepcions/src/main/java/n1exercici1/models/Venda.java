package n1exercici1.models;

import java.util.ArrayList;

public class Venda {
	private ArrayList<Producte> llistaProductes;
	private double preuTotal;

	public Venda(ArrayList<Producte> llistaProductes, double preuTotal) {
		this.llistaProductes = llistaProductes;
		this.preuTotal = preuTotal;

	}

	public void afegirProducte(Producte producte) {
		llistaProductes.add(producte);
	}

	public ArrayList<Producte> getLlistaProductes() {
		return llistaProductes;
	}

	public void setLlistaProductes(ArrayList<Producte> llistaProductes) {
		this.llistaProductes = llistaProductes;
	}

	public double getPreuTotal() {
		return preuTotal;
	}

	public void setPreuTotal(double preuTotal) {
		this.preuTotal = preuTotal;
	}

	@Override
	public String toString() {
		return "Venda [llistaProductes=" + llistaProductes + ", preuTotal=" + preuTotal + "]";
	}

	public void calcularTotal() throws VendaBuidaException {
		if(llistaProductes.isEmpty()) {
			throw new VendaBuidaException();
		} else {

			for(Producte producte: llistaProductes) {
				this.preuTotal += producte.getPreu();
			}
		}
	}




}
