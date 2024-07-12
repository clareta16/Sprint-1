package n2exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GestioRestaurant {

	public static void main(String[] args) {
		
		Set<Restaurant> set = new TreeSet();
		
		Restaurant restaurant1 = new Restaurant("Tarraco", 5);
		Restaurant restaurant2 = new Restaurant("Michelin", 50);
		Restaurant restaurant3 = new Restaurant("Michelin", 30);
		Restaurant restaurant4 = new Restaurant("Quatre Vents", 20);
		Restaurant restaurant5 = new Restaurant("Quatre Vents", 20);
	
		
		
		set.add(restaurant1);
		set.add(restaurant2);
		set.add(restaurant3);
		set.add(restaurant4);
		set.add(restaurant5);
		
		
		
		
		for (Restaurant restaurant : set) {
			System.out.println(restaurant);
		}
	}

}
