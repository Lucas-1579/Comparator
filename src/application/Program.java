package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Iphone", 6000.00));
		products.add(new Product("Tablet", 4000.00));
		products.add(new Product("Computer", 5000.00));
		
		Comparator<Product> comp = new Comparator<Product>() {
		
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getPrice().compareTo(p2.getPrice());
			}
		};
		
		products.sort(comp);
							
		
		for(Product p : products) {
			System.out.println(p);
		}

	}

}
