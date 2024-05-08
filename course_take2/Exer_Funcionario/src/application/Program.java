package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.print("Enter The Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Enter The Gross Salary: ");
		funcionario.gross_salary = sc.nextDouble();
		System.out.print("Enter The Tax: ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Employee: " + funcionario.name + ", $ " + funcionario.liquid_salary());
		
		System.out.println("Which percentage to increase salary? ");
		funcionario.percent = sc.nextDouble();
		System.out.println("Updated Data: " + funcionario.name + ", $ " + funcionario.percentage());
		sc.close();
	}

}
