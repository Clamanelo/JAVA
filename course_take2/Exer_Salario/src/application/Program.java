package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Emplyoee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Emplyoee> list = new ArrayList<>();
		System.out.print("How many employee you want to add?: ");
		int N = sc.nextInt();
		System.out.println("Let's start");
		for(int i=0;i<N;i++) {
		
			System.out.println("Employee #"+(i+1)+":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
				while(hasID(list, id)) {
					System.out.println("ID already used!! Try other.");
					System.out.print("ID: ");
					id = sc.nextInt();
					
				}
			
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Emplyoee emp = new Emplyoee(id, name, salary);
			list.add(emp);
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
		
		Emplyoee pos = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		//Integer pos = positionID(list, idSalary);
		if(pos == null) {
			System.out.println("This id does not exist!");
			System.out.println();
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			pos.increaseSalary(percent);
		}
		
		System.out.println("List of employees: ");
		for (Emplyoee emp: list) {
			System.out.println(emp);
		}
		
	sc.close();
	}
	
	public static Integer positionID(List<Emplyoee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static Boolean hasID(List<Emplyoee> list, int id) {
		Emplyoee pos = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return pos != null;
	}

}
