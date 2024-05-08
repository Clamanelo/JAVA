import java.util.Locale;
import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//String x;
		//x = sc.next();
		//System.out.println("Foi digitado: " + x);
		//sc.close();
		
		//int x;
		//x = sc.nextInt();
		//System.out.println("Foi digitado: " + x);
		//sc.close();
		
		//double x;
		//x = sc.nextDouble();
		//System.out.println("Foi digitado: " + x);
		//sc.close();
		
		//char x;
		//x = sc.next().charAt(0);
		//System.out.println("Foi digitado: " + x);
		//sc.close();
		
		//String x;
		//int y;
		//double z;
		//x = sc.next();
		//y = sc.nextInt();
		//z = sc.nextDouble();
		//System.out.println("X (string) = " + x);
		//System.out.println("Y (int) = " + y);
		// System.out.println("Z (double) = " + z);

		int x;
		String s1, s2, s3;
		x = sc.nextInt();
		//esse nextLine de baixo serve para limpar o buffer que acaba restando do nextint
		//ao se dar
		sc.nextLine();
		//Sempre sc.nextLine para ler a linha/frase inteira.
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.printf("Dados digitados: %n%d %n%s.%n%s.%n%s.",x,s1,s2,s3);
		sc.close();
	}

}
