package caelum;

public class ContaCorrente extends Conta {
	
public ContaCorrente(int numero, double saldo, double limite, Cliente titular) {
		super(numero, saldo, limite, titular);
	}
public void atualiza(double taxa) {
	this.saldo += this.saldo * taxa;
} // atualiza
public void deposita(double quantia) {
	this.saldo += quantia - 0.1;
} // deposita
} // ContaCorrente
