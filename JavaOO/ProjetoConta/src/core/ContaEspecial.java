package core;

public class ContaEspecial extends Conta {
private double limite;

public ContaEspecial(String numero, String nomeTitular, String cpf, double saldo, double limite) {
	super(numero, nomeTitular, cpf, saldo);
	this.limite = limite;
}

public double getLimite() {
	return limite;
}

public void setLimite(double limite) {
	this.limite = limite;
}

@Override
public boolean debitar(double valor) {
	if(super.saldo + limite >= valor) {
		saldo -= valor;
		return true;
	}
	return false;
} // debitar

@Override
public String toString() {
	return "ContaEspecial [limite=" + limite + ", numero=" + numero + ", nomeTitular=" + nomeTitular + ", cpf=" + cpf
			+ ", saldo=" + saldo + "]";
}

} // ContaEspecial
