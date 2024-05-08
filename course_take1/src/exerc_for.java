import java.util.Scanner;

public class exerc_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		
		for(int i=1; i<=valor;i++) {
			System.out.print(i+" ");
			System.out.print(i*i+" ");
			System.out.println(i*i*i);
			
		}
		sc.close();
	}

}
