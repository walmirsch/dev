package gama;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		double nota1, nota2, nota3, nota4;
		double media;
		System.out.println("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.println("Digite a nota 1: ");
		nota1 = scan.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = scan.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = scan.nextDouble();
		System.out.println("Digite a nota 4: ");
		nota4 = scan.nextDouble();
		System.out.println("Resumo:");
		System.out.println("\nSuas notas:");
		System.out.printf("%,.2f%s%,.2f%s%,.2f%s%,.2f",nota1,", ",nota2,", ",nota3," e ",nota4);
		media = (nota1+nota2+nota3+nota4)/4;
		System.out.printf("%n%s%,.2f%n","Média: ",media);
		if(media >=7) {
			System.out.println("Parabéns! Você foi aprovado.");
		}
		if(media>=5 && media<7) {
			System.out.println("Você ficou de recuperação.");
		}
		if(media<5) {
			System.out.println("Infelizmente, você foi reprovado.");
		}
	} // main

} // Caso5
