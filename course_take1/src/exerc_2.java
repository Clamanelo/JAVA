import java.util.Scanner;

public class exerc_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor1,valor2;
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		System.out.println(valor1 + " + " + valor2);
		int resultado = valor1 + valor2;
		System.out.println("= " + resultado);
		sc.close();
	}

}
