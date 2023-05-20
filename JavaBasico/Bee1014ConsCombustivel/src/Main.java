import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int distancia;
		double litros, consumo;
		distancia = teclado.nextInt();
litros = teclado.nextDouble();
consumo = distancia / litros;
System.out.printf("%.3f%s", consumo, " km/l");
	}

}
