package gama;

public class Repeticao {

	public static void main(String[] args) {
		// Estrutura de repetição while
		System.out.println("Saída do while");
		int i = 0;
		while(i<5) {
			System.out.println(i);
			i++;
		} // while
		//Estruturade repetição for
		System.out.println("Saída do for");
		for(int j=0; j<5;j++) {
			System.out.println(j);
		} // for
		// Estrutura de repetição for com array
		String [] carros = {"Volkswagen","Fiat","Ford"};
		System.out.println("Saída do for com array");
		for(String w : carros) {
			System.out.println(w);
		} // for com array
		// Estrutura de repetição do while
		int k = 0;
		System.out.println("Saída do do while");
		do {
			System.out.println(k);
			k++;
		} while(k<5);
	} // main

} // Repeticao
