package ui;

import java.util.Scanner;

import core.Maquina;

public class TestaMaqRefri {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Maquina maq = new Maquina();
	int opcao;
	double valor;
	do {
		System.out.println(maq.exibirDisplay());
		System.out.println("100 - Inserir crédito");
		System.out.println("101 - Solicitar Troco");
		System.out.println(" -1 - Encerrar");
		opcao = teclado.nextInt();
		switch(opcao) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
			int res = maq.comprarRefri(opcao);
			if(res == 0) {
				System.out.println("Aproveite seu refrigerante");
			}
			else if(res == -1) {
				System.out.println("ERRO - Saldo Insuficiente");
			}
			else {
				System.out.println("ERRO - Estoque Insuficiente");
			}
			break;
		case 100:
			System.out.println("Digite o valor a ser inserido");
			valor = teclado.nextDouble();
			maq.adicionarCredito(valor);
			break;
		case 101:
			System.out.println("Seu troco R$ "+maq.solicitarTroco());
			break;
		case -1:
			System.out.println("Obrigado");
			break;
			default:
				System.out.println("Opcao Invalida");
				break;
		} // switch
	} while(opcao != -1);
	teclado.close();
} // main
} // TestaMaqRefri
