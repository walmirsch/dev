package caelum;

public abstract class Conta {
	protected int numero;
	protected double saldo; // não tem set pq usa-se saca() e deposita()
	protected double limite;// não tem get pq getSaldo retorna saldo + limite 
	protected Cliente titular;
	protected static int totalDeContas;

	public Conta(int numero, double saldo, double limite, Cliente titular) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.titular = titular;
		this.totalDeContas++;
	}
	public boolean saca(double quantia) {
		// posso sacar até saldo + limite
		if(quantia > this.saldo + this.getLimite()) {
			return false;
		} else {
			this.saldo -= quantia;
			return true;
		}  	} // saca
	public void deposita(double quantia) {
		if(quantia > 0) {
			this.saldo +=quantia; 
		}
	} // deposita
	public boolean transferePara(Conta destino, double valor) {
		boolean retirou = this.saca(valor);
		if(retirou) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		} // else if
	} // transfere
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return this.saldo+  this.limite;
	}
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}
	public abstract void atualiza(double taxa);
	} //Conta
 