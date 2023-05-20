package caelum;

public class Diretor extends Funcionario implements Autenticavel {
public boolean autentica(int senha) {
	 if(super.senha == senha) {
	System.out.println("Acesso permitido");
	return true;
} else {
	System.out.println("Acesso negado");
	return false;
} // if else
} // autentica
public double getBonificacao() {
	return super.salario * 1.4 + 1000;
} // getBonificacao

} // Diretor
