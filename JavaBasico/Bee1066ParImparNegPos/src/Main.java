import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int numero=0, pares=0, impares=0, positivos=0, negativos=0;
	for(int i=0; i<5; i++) {
		System.out.print("Digite um número: ");
		numero = teclado.nextInt();
		if(numero > 0) {
			positivos++;
		} else
			if(numero < 0) {
				negativos++;
			}
		if(numero%2 == 0) {
			pares++;
		} else {
			impares++;
		}
	} // for
	System.out.println(positivos + "valor(es) positivo(s)");
	System.out.println(negativos + "valor(es) negativo(s)");
	System.out.println(pares + "valor(es) par(es)");
	System.out.println(impares + "valor(es) ímpar(es)");
	teclado.close();
} // main
} // class
