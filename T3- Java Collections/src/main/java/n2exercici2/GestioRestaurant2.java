package n2exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import n2exercici2.Restaurant;

public class GestioRestaurant2 {

	public static void main(String[] args) {
		TreeSet<Restaurant> restaurant = new TreeSet<Restaurant>();
		
		Restaurant restaurant1 = new Restaurant("Tarraco", 5);
		Restaurant restaurant2 = new Restaurant("Michelin", 50);
		Restaurant restaurant3 = new Restaurant("Michelin", 30);
		Restaurant restaurant4 = new Restaurant("Quatre Vents", 20);
		Restaurant restaurant5 = new Restaurant("Quatre Vents", 20);
	
		
		
		restaurant.add(restaurant1);
		restaurant.add(restaurant2);
		restaurant.add(restaurant3);
		restaurant.add(restaurant4);
		restaurant.add(restaurant5);
		

		for (Restaurant r : restaurant) {
		System.out.println(r.getName() + " " + r.getRating());

		}
		
	}

}

	
