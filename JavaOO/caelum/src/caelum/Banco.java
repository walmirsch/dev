package caelum;

public class Banco {
private Conta [] contas;
private int posLivre;

public Banco() {
	this.contas = new Conta[10];
} // construtor Banco
public void adiciona(Conta conta) {
	if(posLivre == contas.length) {
		aumentaArray();
	} // if
	contas[posLivre++] = conta;
} // adiciona
private void aumentaArray() {
	Conta[] maior = new Conta[contas.length * 2];
	for(int i=0; i<contas.length; i++) {
		maior[i] = contas[i];
	} // for
	this.contas = maior;
} // aumentaArray
public Conta pegaConta(int pos) {
	return this.contas[pos];
} // pegaConta
} // Banco
