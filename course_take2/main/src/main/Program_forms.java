package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program_forms {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle triOne, triTwo;
		triOne = new Triangle();
		triTwo = new Triangle();
		//Inserir as medidas em SC
		System.out.println("Enter the measures of triangle X: ");
		triOne.a = sc.nextDouble();
		triOne.b = sc.nextDouble();
		triOne.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		triTwo.a = sc.nextDouble();
		triTwo.b = sc.nextDouble();
		triTwo.c = sc.nextDouble();
		//Calcular a area do triangulo X e Y
		double areaOne = triOne.area();
		double areaTwo = triTwo.area();
		//Print das areas
		System.out.printf("Triangle X area: %.4f%n",areaOne);
		System.out.printf("Triangle Y area: %.4f%n",areaTwo);
		//Detectar qual area é maior
		if(areaOne>areaTwo)
			System.out.println("Larger Area: X");
		else
			System.out.println("Larger Area: Y");
		sc.close();

	}

}
