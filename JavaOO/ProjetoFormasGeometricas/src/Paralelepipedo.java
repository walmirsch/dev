
public class Paralelepipedo extends FormaGeometrica implements IForma3D{
private double largura;
private double altura;
private double profundidade;
public Paralelepipedo(double largura, double altura, double profundidade) {
	this.largura = largura;
	this.altura = altura;
	this.profundidade = profundidade;
}
@Override
public double calcularVolume() {
	return largura * altura * profundidade;
}
@Override
public String exibirInfo() {
	return "Paralelepipedo de largura " + largura + ", altura " + altura + " e profundidade " + 
	" tem volume de " + calcularVolume();
}

} // Paralelepipedo
