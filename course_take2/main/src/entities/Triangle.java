package entities;

public class Triangle {
	//variaveis globais
	public double a;
	public double b;
	public double c;
	
	
	public double area() {
		//Calcular a area do triangulo
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p* (p - a) * (p - b) * (p - c));
	}

}
