import java.util.Scanner;

public class exerc_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,C,D, dif;
		
		System.out.println("Digite 4 numeros separados");
		System.out.println("O sistema mostrará a diferença entre eles");
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		dif = (A*B - C*D);
		
		System.out.println("DIFERENÇA ENTRE ELAS: "+dif);
		sc.close();
	}

}
