
public class Carro {
private String marca;
private String modelo;
private int ano;
private String cor;
private double preco;
private double seguro;
public void exibirAnuncio() {
	System.out.println("Marca: "+getMarca());
	System.out.println("Modelo: "+getModelo());
	System.out.println("Cor: "+getCor());
	System.out.println("Ano: "+ getAno());
	System.out.println("Preço: "+getPreco());
} // exibeAnucnio
public double calcularSeguro(int perfil) {
	double valor=0;
	if(perfil==0) {
		valor = getPreco() * 0.1;
	} else
		if(perfil ==1) {
			valor = getPreco() * 0.05;
		} else {
			valor = getPreco() * 0.03;
		}
	return valor;
} // calculaSeguro
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getCor() {
	return cor;
}
public void setCor(String cor) {
	this.cor = cor;
}
public double getPreco() {
	return preco;
}
public void setPreco(double preco) {
	this.preco = preco;
}
public double getSeguro() {
	return seguro;
}
public void setSeguro(double seguro) {
	this.seguro = seguro;
}
} // Carro
