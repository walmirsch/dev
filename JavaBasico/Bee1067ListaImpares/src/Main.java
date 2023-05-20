import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero;
	System.out.print("Digite um número positivo: ");
	numero = teclado.nextInt();
	for(int i=1; i<=numero; i+=2) {
		System.out.println(i);
	} // for
	teclado.close();
} // main
} // class
