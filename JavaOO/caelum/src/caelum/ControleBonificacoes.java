package caelum;

public class ControleBonificacoes {
private double totalBonificacoes = 0;

public void registra(Funcionario funcionario) {
	this.totalBonificacoes+= funcionario.getBonificacao();
} // registra
public double getTotalBonificacoes() {
	return this.totalBonificacoes;
}
} // ControleBonificacoes 
