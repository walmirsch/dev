package caelum;

public class ContaPoupanca extends Conta {
	
public ContaPoupanca(int numero, double saldo, double limite, Cliente titular) {
		super(numero, saldo, limite, titular);
		// TODO Auto-generated constructor stub
	}

public void atualiza(double taxa) {
	this.saldo += this.saldo * taxa;
} // atualiza
} // ContaPoupanca
