import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int idade, i=0;
	double soma=0;
	do {
		idade = teclado.nextInt();
		if(idade>0) {
			soma+= idade;
			i++;
		}
	} while(idade > 0);
	System.out.printf("%.2f",soma/i);
	teclado.close();
} // main
} // class
