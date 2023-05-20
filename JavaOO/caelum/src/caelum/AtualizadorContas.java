package caelum;

public class AtualizadorContas {
private double saldo = 0;
private double selic;

public AtualizadorContas(double selic) {
	this.selic = selic;
} // construtor com selic
public void roda(Conta c) {
	System.out.println("==============================");
	System.out.println("Saldo anterior: " + c.getSaldo());
	c.atualiza(this.selic);
	System.out.println("Saldo atualizado: " + c.getSaldo());
	this.saldo += c.getSaldo();
} // roda
public double getSaldo() {
	return this.saldo;
} // getSaldo
} // AtualizadorContas 
