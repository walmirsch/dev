package caelum;

public class Fibonacci {

	public static void main(String[] args) {
		int anterior = 0;
		int atual = 1;
		while(atual<1000) {
			System.out.println(atual);
			atual += anterior;
			anterior = atual - anterior;
		} // while
		System.out.println(atual);
	} // main

} // Fibonacci
