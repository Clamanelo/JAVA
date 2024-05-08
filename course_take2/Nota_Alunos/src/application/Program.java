package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CalculoNota;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao somador/calculador de média!");
		System.out.printf("Vamos comerçar.%nDigite o nome do aluno:");
		CalculoNota calculo = new CalculoNota();
		calculo.nome = sc.nextLine();
		System.out.println("Agora as notas dos 3 semestres:");
		do{
			System.out.println("1º Vale entre 0 a 30");
			calculo.nota1 = sc.nextDouble();
		}while(calculo.nota1>30);
		do{
			System.out.println("2º Vale entre 0 a 35");
			calculo.nota2 = sc.nextDouble();
		}while(calculo.nota2>35);
		do{
			System.out.println("3º Vale entre 0 a 35");
			calculo.nota3 = sc.nextDouble();
		}while(calculo.nota3>35);
		System.out.printf("Nome: %s%nPrimeira Nota: %.2f%nSegunda Nota: %.2f%nTerceira Nota: %.2f%n%n",calculo.nome,calculo.nota1,calculo.nota2,calculo.nota3);
		System.out.println("Soma final: = "+calculo.soma());
		if(calculo.soma()<60) {
			System.out.println("Faltam: "+(60-calculo.soma()));
			System.out.println("Resultado Não suficiente.");
		}else{
			System.out.println("Resultado suficiente.");
		}
		sc.close();
	}

}
