import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 23.3213;
		
		String nome = "Bruno";
		int idade = 19;
		double renda = 5000.0;
		System.out.print("Hello World! ");
		System.out.println(x);
		System.out.printf("%.2f", x); //%.2f apenas mostra 3 decimais após a virgula
		Locale.setDefault(Locale.US); //configurar a localização para o inglês, oque faz mudar a virgula para ponto
		System.out.printf("%n%.3f", x);
		System.out.println("RESULTADO = " + x + " COMBINACOES");
		System.out.printf("RESULTADO = %.2f COMBINACOES",x);
		//%f = ponto flutuante
		//%d = inteiro
		//%s = texto
		//%n = quebra de linha
		System.out.printf("%n%s tem %d anos e possui uma renda fixa de %.2f%n",nome, idade, renda);
		
		int valor1 = 5;
		double valor2 = 4 * valor1;
		int valor3 = 4 * valor1;
		System.out.print(valor3);
		System.out.printf("%n%f%n",valor2);
		System.out.print(valor2);
		System.out.printf("%n");
		
		//
		
		//CASTING
		
		int a, b;
		double resultado1, resultado2;
		
		a = 7;
		b = 2;
		//Ele sempre vai resoltar um numero INT pois os que foram usados são de valor Inteiro
		resultado1 = a / b;
		
		//Indicando que o resultado terá de sair do tipo DOUBLE/FLOAT, ele vai retornar sem problemas no mesmo valor com ponto
		resultado2 = (double) a / b;
		
		System.out.println(resultado1);
		//Verdadeiro valor da conta
		System.out.println(resultado2);
		
		
		double c;
		int d;
		
		c = 5.5;
		//Impossivel de converter uma double para uma int sem o indicador necessario no inicio
		d = (int) c;
		
		System.out.println(d);
		
		//
		
	}

}
