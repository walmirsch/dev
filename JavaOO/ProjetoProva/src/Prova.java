import java.util.ArrayList;
import java.util.Scanner;

public class Prova {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int pontos = 0;
	ArrayList<QuestaoSimples> lista = new ArrayList<QuestaoSimples>();
	lista.add(new QuestaoSimples("Bral, bral, bral, quem descobriu a América?", "Cristóvão Colombo"));
	lista.add(new QuestaoMultiplaEscolha("Quantas pernas tem uma mesa?", "4", "1", "2", "3", "4"));
	lista.add(new QuestaoSimples("Qual a cor do céu?", "Azul"));
	lista.add(new QuestaoComDica("Com quantos paus se faz uma canoa?", "1", "Responda com o numeral mínimo."));
	for(int i = 0; i<lista.size(); i++){
		System.out.printf("Questão %d:\n", i+1);
		System.out.println(lista.get(i).aplicarQuestao());
		System.out.println("Digite sua resposta: ");
		String resp = teclado.nextLine() ;
		if(lista.get(i).corrigir(resp)) {
			pontos++;
		}
	} // for
	System.out.println("Você fez " + pontos + " pontos.");
	teclado.close();
} // main
} // Prova
