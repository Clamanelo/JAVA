import java.util.Locale;
import java.util.Scanner;

public class exerc_5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		//Registro de funcionarios (Pagamento com horas trabalhadas)
		int numero_funcionario,horas_trabalhadas;
		double valor_hora;
		System.out.print("ID: ");
		numero_funcionario = sc.nextInt();
		System.out.print("Horas: ");
		horas_trabalhadas = sc.nextInt();
		System.out.print("Valor p/horas: ");
		valor_hora = sc.nextDouble();
		
		System.out.println("-----------------");
		double salario = horas_trabalhadas * valor_hora;
		System.out.printf("ID: %d%nSalario: %.2f",numero_funcionario,salario);
		sc.close();
	}

}
