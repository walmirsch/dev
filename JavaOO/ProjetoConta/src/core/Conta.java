package core;

public class Conta {
	protected String numero;
protected String nomeTitular;
protected String cpf;
protected double saldo;
public Conta(String numero, String nomeTitular, String cpf, double saldo) {
	super();
	this.numero = numero;
	this.nomeTitular = nomeTitular;
	this.cpf = cpf;
	this.saldo = saldo;
}
public String getNumero() {
	return numero;
}
public void setNumero(String numero) {
	this.numero = numero;
}
public String getNomeTitular() {
	return nomeTitular;
}
public void setNomeTitular(String nomeTitular) {
	this.nomeTitular = nomeTitular;
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
public void setSaldo(double saldo) {
	this.saldo = saldo;
}

@Override
public String toString() {
	return "Conta [numero=" + numero + ", nomeTitular=" + nomeTitular + ", cpf=" + cpf + ", saldo=" + saldo + "]";
}
public boolean debitar(double valor) {
	if(this.saldo >= valor) {
		this.saldo -= valor;
		return true;
	}
	return false;
} // debita
public void creditar(double valor) {
	this.saldo += valor;
}
} // Conta
