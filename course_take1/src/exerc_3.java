import java.util.Locale;
import java.util.Scanner;

public class exerc_3 {
	
	public static void main(String[] arg) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio_circulo, area_circulo, pi = 3.14159;
		System.out.println("Por favor digite o valor do raio do seu circulo: ");
		raio_circulo = sc.nextDouble();
		
		area_circulo = pi * (raio_circulo*raio_circulo);
		
		System.out.printf("A area do seu circulo é %.4f",area_circulo);
		
		sc.close();
	}
	
}
