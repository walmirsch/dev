package gama;

import java.util.Scanner;

public class CasoUm {

	public static void main(String[] args) {
		String nome;
		Scanner scan = new Scanner(System.in);
		System.out.println("Por favor, digite seu nome: ");
		nome = scan.nextLine();
		System.out.println("Olá, mundo");
		System.out.println("Bem-vindo, "+nome);
	} // main

} // CasoUm
