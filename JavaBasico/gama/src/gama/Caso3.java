package gama;

public class Caso3 {

	public static void main(String[] args) {
		// Variaveis
		String nomeAgencia;
		String modeloVeiculo;
		String corVeiculo;
		double valorVeiculo;
		double taxaJuros;
		int quantPrest;
		double valorPrest;
		// Atribuicoes
		nomeAgencia = "FiatLux";
		modeloVeiculo ="Pálio";
		corVeiculo = "Prata";
		valorVeiculo = 50000;
		taxaJuros = 20;
		quantPrest = 12;
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

} // Caso3
