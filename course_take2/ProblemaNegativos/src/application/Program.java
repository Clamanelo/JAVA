package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Check;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to type?");
		int n = sc.nextInt();
		Check[] vect = new Check[n];
		
		for (int i=0;i<vect.length;i++) {
			System.out.printf("Type a number: ");
			int number = sc.nextInt();
			vect[i] = new Check(number);
		}
		System.out.println("NEGATIVE NUMBERS: ");
		for (int i=0;i<vect.length;i++) {
			if(vect[i].getNumber()<0) {
				System.out.println(vect[i].getNumber());
			}
		}
		sc.close();
	}
}