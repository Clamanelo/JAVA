package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		//System.out.print("Quantity: ");
		//int quantity = sc.nextInt();
		Product product = new Product(name, price);
		
		product.setName("Abacate");
		System.out.println("Updated Name: "+product.getName());
		
		product.setPrice(1500);
		System.out.println("Updated Price: "+product.getPrice());
		
		System.out.println("Product Data: " + product);
		//System.out.println(product.name + "," +product.price + "," + product.quantity);
		
		System.out.println("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		System.out.println("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated Data: " + product);
		
		sc.close();
	
	}

}
