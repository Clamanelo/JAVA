import java.util.Locale;
import java.util.Scanner;

public class calculo_Fahrenheit {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		char resposta;
		do {
			System.out.println("Digite a temperatura(Celsius):");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.0;
			System.out.printf("Temperatura em Celsius = %.1f%n",C);
			System.out.printf("Temperatura em Fahrenheit = %.1f%n",F);
			
		System.out.print("Deseja repetir o programa? [s/n] > ");	
		resposta = sc.next().charAt(0);
		}while(resposta!='n');
		
		sc.close();

	}

}
