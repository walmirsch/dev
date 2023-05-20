import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor, q100, q50, q20, q10, q5, q2, q1, resto;
		valor = teclado.nextInt();
		q100 = valor / 100;
		resto = valor % 100;
		q50 = resto / 50;
		resto = resto % 50;
		q20 = resto / 20;
		resto = resto % 20;
		q10 = resto / 10;
		resto = resto % 10;
		q5 = resto / 5;
		resto = resto % 5;
		q2 = resto / 2;
		resto = resto % 2;
		q1 = resto;
		System.out.println(q100 + " nota(s) de R$ 100");
		System.out.println(q50 + " nota(s) de r$ 50");
		System.out.println(q20 + " nota(s) de r$ 20");
		System.out.println(q10 + " nota(s) de r$ 10");
		System.out.println(q5 + " nota(s) de r$ 5");
		System.out.println(q2 + " nota(s) de r$ 2");
		System.out.println(q1 + " nota(s) de r$ 1");
		teclado.close();
	}
} // class
