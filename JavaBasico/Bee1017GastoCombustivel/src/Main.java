import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int horas, velocidadeMedia;
		horas = teclado.nextInt();
		velocidadeMedia = teclado.nextInt();
		// distancia = velocidade * tempo
		double distancia = velocidadeMedia * horas;
		double litros = distancia / 12; // o carro faz 12 km por litro
		System.out.printf("%.3f",litros);
		
		teclado.close();
	}
} // class
