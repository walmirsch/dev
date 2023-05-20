package caelum;

public class Cliente {
private String nome;
private String sobrenome;
private String cpf;


public Cliente(String nome, String sobrenome, String cpf) {
	super();
	this.nome = nome;
	this.sobrenome = sobrenome;
	// validaCPF(cpf);
	this.cpf = cpf;
}
//private void validaCPF(cpf) {
	// Série de regras aqui. Falha se não for válido
//} // validaCPF
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobrenome() {
	return sobrenome;
}
public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
public String getCpf() {
	return cpf;
}
} // cliente
