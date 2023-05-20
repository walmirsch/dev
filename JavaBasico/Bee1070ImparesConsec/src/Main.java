import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero;
	System.out.print("Digite um número positivo: ");
	numero = teclado.nextInt();
	if(numero%2==0) { 
		numero++;
	}
	for(int i=1; i<=6; i++) {
		System.out.println(numero);
		numero += 2;
	} // for
		teclado.close();
} // main
} // class
