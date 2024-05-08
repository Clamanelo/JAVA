import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia="";
		
		switch(x) {
		case 1:
			dia = "Domingo.";
			break;
		case 2:
			dia = "Segunda.";
			break;
		case 3:
			dia = "Terça.";
			break;
		case 4:
			dia = "Quarta.";
			break;
		case 5:
			dia = "Quinta.";
			break;
		case 6:
			dia = "Sexta.";
			break;
		case 7:
			dia = "Sabádo.";
			break;
		default:
			System.out.println("Os dias da semana vão de 1 a 7 apenas.");
			dia = "Valor invalido!";
			break;
		}
		
		if (x == 1 || x <= 7)System.out.printf("No %dº dia da semana é %s",x,dia);
		
		sc.close();

	}

}
