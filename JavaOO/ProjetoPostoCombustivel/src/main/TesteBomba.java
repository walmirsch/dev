package main;

import java.util.Scanner;
import core.Bomba;
import core.Combustivel;

public class TesteBomba {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor;
		Bomba b = new Bomba(new Combustivel("Etanol", 3.75));
		System.out.println("Escolha a opção:\n1 - Litros\n2 - Valor");
		opcao = teclado.nextInt();
		if(opcao == 1) {
			System.out.print("Digite a quantidade de litros: ");
			valor = teclado.nextDouble();
			b.abastecerPorLitros(valor);
			System.out.println(b.imprimirRecibo());
		}
		else if(opcao == 2) {
			System.out.print("Digite o valor que deseja abastecer: ");
			valor = teclado.nextDouble();
			b.abastecerPorValor(valor);
			System.out.println(b.imprimirRecibo());
					}
		else {
			System.out.println("Erro: opção inválida");
		}
		teclado.close();
	} // main
} // TesteBomba
