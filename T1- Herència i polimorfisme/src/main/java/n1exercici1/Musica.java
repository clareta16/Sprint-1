package n1exercici1;

import n1exercici1.modelos.Percussio;
import n1exercici1.modelos.Vent;

public class Musica {

	public static void runMusica() {
		
		Vent flauta = new Vent("flauta", 450);
		Percussio marimba = new Percussio("marimba", 2000);
		
		flauta.tocar();
		marimba.tocar();

	}

}

