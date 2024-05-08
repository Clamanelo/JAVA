package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Area;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle width and height: ");
		Area area = new Area();
		System.out.print("W: ");
		area.width = sc.nextDouble();
		System.out.print("H: ");
		area.height = sc.nextDouble();
		
		System.out.printf("Area: %.2f%n", area.calculoArea());
		System.out.printf("Area: %.2f%n", area.calculoPerimetro());
		System.out.printf("Area: %.2f", area.calculoDiagonal());
		sc.close();

	}

}
