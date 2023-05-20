import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, media;
		a = teclado.nextDouble();
		b = teclado.nextDouble();
		media = (a*3.5 + b*7.5) / 11;
		System.out.printf("%s%.5f%n", "MEDIA = ", media);
		teclado.close();
	} // main method
} // Main class
