import java.util.Scanner;

public class bit_Mask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		//& = operação E bit a bit
		//| = operação OU bit a bit
		//^ = operação OU-exclusivo bit a bit
		if ((n & mask) != 0)
			System.out.println("O 6 bit é verdadeiro");
		else
			System.out.println("O 6 bit é falso");

	}

}
