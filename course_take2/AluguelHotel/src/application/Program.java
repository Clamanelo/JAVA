package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Check;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quartos = 10;
		Check[] quarto = new Check[quartos];
		for (int i=0; i < quarto.length; i++) {
			quarto[i] = new Check(i+1,"","",0);
		}
		System.out.println("    ----------------");
		System.out.println("Bem vindo ao Hotel MangesVI");
		System.out.println("    ----------------");
		System.out.print("\n      Oque procura?");
		System.out.print("\n\n    [1] Quartos");
		System.out.print("\n\n    [2] Lista de Clientes");
		System.out.print("\n\n    [3] Sair\n\n");
		
		int escolha;
		do {
			System.out.print("    > ");
			escolha = sc.nextInt();
			
			if(escolha==1) {
				System.out.print("    [ Quartos ]\n    Disponiveis:\n");
				for (int i=0; i < quarto.length-1; i++) {
					if(quarto[i].getState()==0)System.out.println("    - Quarto "+quarto[i].getNumber());
				}
				
				System.out.print("\n      Oque deseja fazer?\n\n    [1] Alugar\n    [2] Voltar\n");
					System.out.print("    > ");
					int escolha2 = sc.nextInt();
					int escolha3;
					if(escolha2==1) {
						do {
						System.out.print("    [ Alugar ]\n      Qual quarto deseja?\n\n");
						System.out.print("    > ");
						escolha3 = sc.nextInt();
						}while((escolha3<=0)||(escolha3>quarto.length));
							if(quarto[escolha3-1].getState()==0) {
								System.out.print("\n    Quarto livre! Hora do cadastro:");
								//Cadastro
								System.out.println("\n\n    Digite o nome do cliente primeiro:\n");
								System.out.print("    > ");
								sc.nextLine();
								quarto[escolha3].setName(sc.nextLine());
								System.out.println("\n    Digite o email do cliente:\n");
								System.out.print("    > ");
								quarto[escolha3].setEmail(sc.next());
								//Mostrar o Registro
								System.out.println("      Registro realizado com sucesso!");
								System.out.println("    ----------------");
								System.out.println("      Quarto - "+quarto[escolha3-1].getNumber());
								System.out.println("      Nome - "+quarto[escolha3].getName());
								System.out.println("      Email - "+quarto[escolha3].getEmail());
								double calcRent=100*escolha3;
								quarto[escolha3].setRent(calcRent);
								System.out.println("      Preço - R$"+quarto[escolha3].getRent());
								System.out.println("    ----------------");
								quarto[escolha3-1].setState(1);
								System.out.print("\n\n    Oque deseja fazer?\n\n    [1] Alugar\n    [2] Voltar\n\n");
							}else {
								System.out.print("\n    Quarto indisponivel.\n    Vamos voltar um pouco..");
								System.out.print("\n\n    Oque deseja fazer?\n\n    [2] Voltar\n\n");
							}
					}
					if(escolha2==2) {
						System.out.print("\n      Oque procura?");
						System.out.print("\n\n    [1] Quartos");
						System.out.print("\n\n    [2] Lista de Clientes");
						System.out.print("\n\n    [3] Sair\n\n");
						
					}
			}
			if(escolha==2) {
				System.out.print("    [ Lista de Clientes ]\n    ----------------\n");
				for (int i=0; i < quarto.length; i++) {
					if(quarto[i].getState()==1)System.out.println("    - "+quarto[i].getNumber()+" "+quarto[i+1].getName()+"/ Email: "+quarto[i+1].getEmail());
				}
				System.out.println("    ----------------");
				System.out.print("\n\n    Oque deseja fazer?");
				System.out.print("\n\n    [1] Quartos");
				System.out.print("\n\n    [2] Lista de Clientes");
				System.out.print("\n\n    [3] Sair\n\n");
			}

		}while(escolha!=3);
			System.out.print("    [ Sair ]\n\n    Adeus.\n");
			System.exit(0);
		sc.close();
	}

}