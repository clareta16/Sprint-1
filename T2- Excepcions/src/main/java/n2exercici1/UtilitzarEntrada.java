package n2exercici1;

import n2exercici1.models.Entrada;

public class UtilitzarEntrada {

	public static void usageEntrada() {
		String missatge = "Introdueix la teva edat";
		
		byte a = Entrada.llegirByte(missatge + " en format byte");

		int b = Entrada.llegirInt(missatge + " en format int");

		float c = Entrada.llegirFloat(missatge + " en format float");

		double d = Entrada.llegirDouble(missatge + " en format double");
		
		char e = Entrada.llegirChar(missatge + " en format char");

		String f = Entrada.llegirString(missatge + " en format String");

		boolean g = Entrada.llegirSiNo(missatge + " en format boolean");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		

		
		

	}

}
