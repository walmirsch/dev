import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double preco=0, total=0;
	do {
		System.out.print("Digite o valor: ");
		preco = teclado.nextDouble();
		total += preco;
	} while(preco > 0);
	System.out.println("Total: " + total);
	teclado.close();
}
}
