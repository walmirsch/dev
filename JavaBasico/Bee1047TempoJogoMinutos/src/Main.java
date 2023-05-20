import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int horaInicio, minutoInicio, horaFim, minutoFim;
	horaInicio = teclado.nextInt();
	minutoInicio = teclado.nextInt();
	horaFim = teclado.nextInt();
	minutoFim = teclado.nextInt();
	// converte para minutos
	int inicioMinutos = horaInicio *60 + minutoInicio;
	int fimMinutos = horaFim * 60 + minutoFim;
	int duracao =fimMinutos - inicioMinutos;
	if(duracao<=0) {
		duracao += 60*24;
	}
	int duracaoHoras = duracao / 60;
	int duracaoMinutos = duracao % 60;
	System.out.println("O jogo durou " + duracaoHoras + " hora(s) e " + duracaoMinutos + " minuto(s)");
	teclado.close();
}
} // class 
