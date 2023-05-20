package gama;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// Variaveis
		Scanner scan = new Scanner(System.in);
		String nomeAgencia;
		String modeloVeiculo;
		String corVeiculo;
		double valorVeiculo;
		double taxaJuros;
		int quantPrest;
		double valorPrest;
		// Entradas
		System.out.println("Digite o nome da agência: ");
		nomeAgencia = scan.nextLine();
		System.out.println("Digite o modelo do veículo: ");
		modeloVeiculo =scan.nextLine();
		System.out.println("Digite a cor do veículo: ");
		corVeiculo = scan.nextLine();
		System.out.println("Digite o preço do veículo: ");
		valorVeiculo = scan.nextDouble();
		System.out.println("Digite a taxa de juros: ");
		taxaJuros = scan.nextDouble();
		System.out.println("Digite a quantidade de prestações: ");
		quantPrest = scan.nextInt();
		valorPrest = valorVeiculo * (1+taxaJuros/100)/quantPrest;
// Saida		
		System.out.println("Nome da agência: "+nomeAgencia);
		System.out.println("Modelo do veículo: "+modeloVeiculo);
		System.out.println("Cor do veículo: "+corVeiculo);
		System.out.printf("%s%,.2f","Valor do veículo: R$ ",valorVeiculo);
			System.out.printf("%n%s%.2f","Taxa de juros: ",taxaJuros);
		System.out.printf("%n%s%d","Quantidade de prestações: ",quantPrest);
		System.out.printf("%n%s%,.2f","Valor da prestação: R$ ",valorPrest);
 

	} // main

} // Caso4
