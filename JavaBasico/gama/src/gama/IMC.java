package gama;

import java.util.Scanner;
import java.util.Scanner;

// Calcula o IMC - Índice de massa corporal
public class IMC {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		double peso, altura, imc;
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.println("Digite seu peso em Kg. Exemplo 67,2: ");
		peso = scan.nextDouble();
		System.out.println("Digite sua altura em metros. Exemplo 1,7: ");
		altura = scan.nextDouble();
		imc = peso / (altura * altura);
		System.out.printf("%n%s%s%.2f", nome, ", seu IMC é: ", imc);
		if(imc<18.5) {System.out.println();
			System.out.println("\nVocê está abaixo do peso.");
		}
		if(imc>=18.5 && imc<25) {
			System.out.println("\nSeu peso é normal.");
		}
		if(imc>=25 && imc <30) {
			System.out.println("\nVocê está com sobrepeso");
		}
		if(imc>=30 && imc<40) {
			System.out.println("\nseu IMC indica obesidade.");
		}
		if(imc>=40 ) {
			System.out.println("\nSeu IMC indica obesidade grave.");
		}
	} // MAIN

} // IMC
