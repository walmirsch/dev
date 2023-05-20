import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
			double numero = 0, soma = 0, media = 0;
	int positivos = 0;
	for(int i=0;i<6;i++) {
		System.out.print("Digite um número: ");
		numero = teclado.nextDouble();
		if(numero>0) {
			positivos++;
			soma += numero;
		} // if
	} // for
	System.out.println(positivos + " valores positivos");
	System.out.println(soma/positivos);
	teclado.close();
}
} // class
