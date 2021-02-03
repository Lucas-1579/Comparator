package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.MyComparator;

public class Program {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Iphone", 6000.00));
		products.add(new Product("Tablet", 4000.00));
		products.add(new Product("Computer", 5000.00));
		
		products.sort(new MyComparator());
							
		
		for(Product p : products) {
			System.out.println(p);
		}

	}

}
