package n1exercici2;


import java.util.*;

public class ListInteger {

	public static void List() {

			List<Integer> llista = new ArrayList<>();
			llista.add(4);
			llista.add(2);
			llista.add(1);


			Collections.sort(llista);


			List<Integer> segonaLlista = new ArrayList<>();


			ListIterator<Integer> lit = llista.listIterator(llista.size());
			while (lit.hasPrevious()) {
				segonaLlista.add(lit.previous());
			}


			System.out.println("Llista 1 ordenada " + llista);
			System.out.println("Llista 2 en ordre invers " + segonaLlista);
		}
	}