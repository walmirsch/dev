package gama;

import java.util.Scanner;

public class MenuComSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int opcao=0;
		while(opcao != 4) {
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Massas\n2 - Carnes\n3 - Peixes\n4 - Sair");
		opcao = scan.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("Você escolheu massas.");
			break;
		case 2:
			System.out.println("Você escolheu carne.");
			break;
		case 3:
			System.out.println("Você escolheu peixe.");
		case 4:
			System.out.println("Você escolheu sair. Obriagdo pela preferência.");
			break;
		default:
			System.out.println("Opção inválida.");
			break;
		} // switch
		} // while
	} // main

} // menucomswitch
