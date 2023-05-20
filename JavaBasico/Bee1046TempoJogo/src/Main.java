import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int inicio, fim;
	inicio = teclado.nextInt();
	fim = teclado.nextInt();
	int duracao = fim - inicio;
	if(duracao<=0) {
		duracao += 24;
	}
	System.out.println("O jogodurou "+duracao+" horas");
	teclado.close();
} // main
} // class
