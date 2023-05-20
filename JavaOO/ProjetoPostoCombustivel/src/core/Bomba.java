package core;

public class Bomba {
	private Combustivel combustivel;
	private double qtdLitros;
	private double valorTotal;

	public Bomba(Combustivel combustivel) {
		super();
		this.combustivel = combustivel;
	} // construtor

	public void abastecerPorLitros(double litros) {
		this.qtdLitros = litros;
		this.valorTotal = this.qtdLitros * combustivel.getPrecoLitro();
	} // abastecerPorLitros

	public void abastecerPorValor(double valor) {
		this.valorTotal = valor;
		this.qtdLitros = this.valorTotal / combustivel.getPrecoLitro();
	} // abastecerPorValor

public String imprimirRecibo() {
	return "Posto WS S.A.\n"+
"Combustivel: " + combustivel.getNome()+"\n"+
			"Preço litro: R$"+String.format("%.3f", combustivel.getPrecoLitro())+"\n"+
"Abastecidos: "+String.format("%.3f", this.qtdLitros)+"\n"+
			"Total a pagar: R$"+String.format("%.2f", this.valorTotal);
} // imprimirRecibo
} // Bomba
