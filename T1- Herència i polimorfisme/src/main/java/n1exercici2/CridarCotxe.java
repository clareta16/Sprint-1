package n1exercici2;

import n1exercici2.models.Cotxe;

public class CridarCotxe {
	public static void utilitzarCotxe() {
		Cotxe cotxe1 = new Cotxe(125);
		Cotxe cotxe2 = new Cotxe(200);


		Cotxe.frenar();

		cotxe1.accelerar();
	}

}
