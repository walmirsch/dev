package br.com.isidrocorp.hello.model;

public class Produto {
private int id;
private String nome;
private String Descricao;
private int qtdEstoque;
private double preco;
private String linkFoto;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getDescricao() {
	return Descricao;
}
public void setDescricao(String descricao) {
	Descricao = descricao;
}
public int getQtdEstoque() {
	return qtdEstoque;
}
public void setQtdEstoque(int qtdEstoque) {
	this.qtdEstoque = qtdEstoque;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public String getLinkFoto() {
	return linkFoto;
}
public void setLinkFoto(String linkFoto) {
	this.linkFoto = linkFoto;
}
@Override
public String toString() {
	return "Produto [id=" + id + ", nome=" + nome + ", Descricao=" + Descricao + ", qtdEstoque=" + qtdEstoque
			+ ", preco=" + preco + ", linkFoto=" + linkFoto + "]";
}
public int diminuirEstoque() {
qtdEstoque--;
if(qtdEstoque<0) {
	qtdEstoque = 0;
}
return qtdEstoque;
}
} // Produto
