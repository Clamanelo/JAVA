import java.util.Scanner;

public class for_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos valores deseja incluir: ");
		int N = sc.nextInt();
		int soma = 0;
		
		int vezes = 0;
		for(int i=0; i<N; i++) {
			vezes = vezes + 1;
			
			System.out.println("Valor de numero "+vezes+":");
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println("Resultado: "+soma);
		sc.close();

	}

}
