package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		String[] vect = new String[] {"Bruno", "Julia", "Joao"};
		
		for (int i= 0; i < vect.length;i++) {
			System.out.println(vect[i]);
		}
		System.out.println("---------");
		for (String obj : vect) {
			System.out.println(obj+".");
		}
		System.out.println("------------------------");
		//Cria a lista
		List<String> list = new ArrayList<>();
		//Adiciona elementos na lista
		list.add("José");
		list.add("Marquinhos");
		list.add("Pedro");
		//Adiciona elementos na lista já feita
		list.add(1, "Bruno");
		//Verificar o tamanho da lista
		
		//Remover um elemento da lista
		list.remove("José");
		list.remove(2);
		
		
		list.add("Marcelo");
		list.add("Moreira");
		System.out.println("Tamanho da lista: "+list.size());
		System.out.println("--Antes--");
		for (String x : list) {
			System.out.println(x);
		}
		//Ele pega o X e fala com o "->" que caso seja verdade, ele remove
		list.removeIf(x -> x.charAt(0)=='M');
		System.out.println("--Depois--");
		System.out.println("Tamanho da lista: "+list.size());
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------------");
		list.add("José");
		list.add("Marquinhos");
		list.add("Pedro");
		list.add("Marcelo");
		list.add("Moreira");
		for (String x : list) {
			//IndexOf pra mostrar a posição de cada um na lista
			System.out.println("Posição: "+list.indexOf(x)+" "+x);
		}
		
		System.out.println("------------------------");
		
		//removeIf com o if que remove a todos que não possuem a letra "M" na posição 0
		//list.removeIf(x -> x.charAt(0)!='M');
		//For que checa e mostra apenas quem tem o M no começo do nome
		for (String x : list) {
			if(x.charAt(0)=='M')System.out.println("Posição: "+list.indexOf(x)+" "+x);
		}
		
		System.out.println("------------------------");
		//Variavel string para procurar o primeiro com a letra 'P' na lista inteira
		String name = list.stream().filter(x -> x.charAt(0)=='P').findFirst().orElse(null);
		System.out.println(name);
		//Variavel string para retornar NULL por não existir um nome com 'V' na lista
		name = list.stream().filter(x -> x.charAt(0)=='V').findFirst().orElse(null);
		System.out.println(name);
	}
		
}