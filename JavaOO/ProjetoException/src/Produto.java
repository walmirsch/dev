
public class Produto {
private int codigo;
private String nome;
private double preco;
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) throws WException {
	if(codigo<=0) {
		throw new WException("O código não pode ser menor ou igual a Zero!");
	}
	this.codigo = codigo;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) throws WException {
	if(nome == null || nome.length()==0) {
		throw new WException("Nome precisa ser preenchido");
	}
	this.nome = nome;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) throws WException {
	if(preco < 0) {
		throw new WException("O preço não pode ser negativo");
	}
	this.preco = preco;
}
@Override
public String toString() {
	return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
}

} // Produto
