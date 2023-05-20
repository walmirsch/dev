package caelum;

public class BalancoTrimestral {

	public static void main(String[] args) {
		float gastosJaneiro = 15000;
		float gastosFevereiro =23000;
		float gastosMarco = 17000;
		float gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
		float mediaMensal =gastosTrimestre / 3; 
		System.out.printf("%s%,.2f","Gastos no trimestre: R$", gastosTrimestre);
		System.out.printf("%n%s%,.2f","Média de gastos mensal: R$",mediaMensal);

	} // main

} // BalancoTrimestral
