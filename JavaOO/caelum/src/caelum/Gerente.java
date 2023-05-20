package caelum;

public class Gerente extends Funcionario implements Autenticavel {
private int senha;
private int numeroFuncionariosGerenciados;

public boolean autentica(int senha) {
	if(this.senha == senha) { // verificar se o setor dele tem acesso
		System.out.println("Acesso permitido");
		return true;
	} else {
		System.out.println("Acesso negado");
		return false;
	} // if else
} // autentica
@Override
public double getBonificacao() {
	return this.salario * 1.4 + 1000;
} // getBonificacao
public int getSenha() {
	return senha;
}

public void setSenha(int senha) {
	this.senha = senha;
}

public int getNumeroFuncionariosGerenciados() {
	return numeroFuncionariosGerenciados;
}

public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
	this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
}
}// Gerente  
