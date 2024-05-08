package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter account number: ");
		int number = sc.nextInt();
		System.out.printf("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.printf("Is there na initial deposit(y/n)? ");
		char initial_choose = sc.next().charAt(0);
		double initial_deposit=0;
		do {
				if(initial_choose=='y') {
					System.out.printf("Enter initial deposit value: ");
					initial_deposit = sc.nextDouble();

				}
			}while((initial_choose!='n')&&(initial_choose!='y'));
		Product product = new Product(number, holder,initial_deposit);
		
		System.out.println("\nAccount Data: ");
		System.out.println(product.toString());
		
		//Enter deposit
		
		System.out.printf("\nEnter a deposit value: ");
		product.deposit(sc.nextDouble());

		System.out.println("Updated account Data: ");
		System.out.println(product.toString());
		
		System.out.printf("\nEnter a withdraw value: ");
		product.withdraw(sc.nextDouble());

		System.out.println("Updated account Data: ");
		System.out.println(product.toString());
		
		sc.close();
	}

}
