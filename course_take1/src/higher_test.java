import java.util.Scanner;

public class higher_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = soma(a,b,c);
		System.out.println(result);
	}
	
	public static int soma(int x,int y,int z) {
		int result = x+y+z;
		
		return result;
	}
}
