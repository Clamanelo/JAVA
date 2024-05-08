import java.util.Locale;
import java.util.Scanner;

public class exerc_6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int produto1, produto2, quantidade1,quantidade2;
		double valor1, valor2, soma1, soma2, valor_Total;
		System.out.println("Produto 1 >");
		System.out.printf("Digite o id do produto: ");
		produto1 = sc.nextInt();
		System.out.printf("Quantidade: ");
		quantidade1 = sc.nextInt();
		System.out.printf("Valor unitário: ");
		valor1 = sc.nextDouble();
		soma1 = quantidade1 * valor1;
		
		System.out.println("Produto 2 >");
		System.out.printf("Digite o id do produto: ");
		produto2 = sc.nextInt();
		System.out.printf("Quantidade: ");
		quantidade2 = sc.nextInt();
		System.out.printf("Valor unitário: ");
		valor2 = sc.nextDouble();
		soma2 = quantidade2 * valor2;
		
		valor_Total = soma1 + soma2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",valor_Total);
		sc.close();
	}

}
