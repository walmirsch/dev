package core;

public class Maquina {
	private Refrigerante lista[];
	private double credito;

// Construtor criado manualmente
	public Maquina() {
		this.lista = new Refrigerante[5];
		this.lista[0] = new Refrigerante("Coca-Cola", 2.5, 10);
		this.lista[1] = new Refrigerante("Fanta", 2.2, 5);
		this.lista[2] = new Refrigerante("Pepsi", 2.0, 8);
		this.lista[3] = new Refrigerante("Sprite", 1.8, 10);
		this.lista[4] = new Refrigerante("Guaraná", 2.0, 8);
		this.credito = 0;
	}

	public void adicionarCredito(double valor) {
		this.credito += valor;
	}

	public int comprarRefri(int codRefri) {
		// na compra temos 3 possibilidades
		// 0 - compra bem sucedida
		// -1 - saldo insuficiente
		// -2 - estoque zerado
		if (this.credito >= lista[codRefri].getPreco()) { // tem crédito suficiente
			if (lista[codRefri].getQuant() > 0) { // tem estoque suficiente
				this.credito -= lista[codRefri].getPreco(); // atualiza saldo de crédito
				int quantRefri = lista[codRefri].getQuant() - 1;
				lista[codRefri].setQuant(quantRefri); // atualiza estoque (-1)
				return 0;
			}
			return -2;
		}
		return -1;
	} // comprarRefri

	public double solicitarTroco() {
		double troco = this.credito;
		this.credito = 0;
		return troco;
	}

	public String exibirDisplay() {
		String display = "Maquina de Refri - Seu saldo R$ " + String.format("%.2f", credito) + "\n"
				+ "----------------------------------------------------\n";
		for (int i = 0; i < 5; i++) {
			display += "  " + i + "-" + lista[i].getNome() + String.format(" - R$ %.2f\n", lista[i].getPreco());
		}
		return display;
	} // exibeDisplay
} // Maquina
