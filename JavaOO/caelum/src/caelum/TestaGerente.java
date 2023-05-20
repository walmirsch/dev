package caelum;

public class TestaGerente {

	public static void main(String[] args) {
		ControleBonificacoes controle = new ControleBonificacoes();
		Gerente gerente = new Gerente();
		Funcionario func = new Gerente();
		// Podemos chamar metodos do Funcionario
		gerente.setSalario(10000);
		func.setSalario(2000);
		// E métodos do Gerente
		gerente.setSenha(13579248);
		controle.registra(gerente);
		controle.registra(func);
		System.out.println("Bonificação: " + gerente.getBonificacao());
		System.out.println("Bonificações: " + controle.getTotalBonificacoes());
	} // main

} // TestaGerente
