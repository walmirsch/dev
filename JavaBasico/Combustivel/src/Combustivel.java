import java.util.Scanner;

public class Combustivel {

	public static void main(String[] args) {
		double tempoViagem;
		double velMedia;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o tempo da viagem em horas: ");
		tempoViagem = teclado.nextDouble();
		System.out.println("Digite a velocidade média: ");
		velMedia = teclado.nextDouble();
		double distancia = velMedia * tempoViagem;
		double litros =distancia / 12; 

		System.out.println("quantidade de litros: " + litros);
	}

}
