import java.util.Scanner;

public class state_if {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		if (x < 10) {
			System.out.println("O numero digitado é menor que 10");
		}else if (x > 10) {
			System.out.println("O numero digitado é maior que 10");
		}else{
			System.out.println("O numero digitado é 10");
		}
		sc.close();

	}

}
