
public class Conta {
	private int numero;
	private int digito;
	private String titular;
	private String cpf;
	private double saldo;

	public Conta(int numero, int digito, String titular, String cpf) {
		super();
		this.numero = numero;
		this.digito = digito;
		this.titular = titular;
		this.cpf = cpf;
	} // construtor

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getDigito() {
		return digito;
	}

	public void setDigito(int digito) {
		this.digito = digito;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

	public boolean saca(double quantia) {
		if (this.saldo >= quantia) {
			this.saldo -= quantia;
			return true;
		}
		return false;
	} // saca

	public void deposita(double quantia) {
		if (quantia > 0) {
			this.saldo += quantia;
		}
	} // deposita

	public String exibeConta() {
		return "Conta: " + this.numero + "-" + this.digito + "\nTitular: " + this.titular + "(" + this.cpf + ")" +"\nSaldo: R$" + String.format("%.2f",this.saldo);
	} // exibeConta
} // conta
