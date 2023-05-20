
public class Retangulo extends FormaGeometrica implements IForma2D{
private double base;
private double altura;

public Retangulo(double base, double altura) {
	this.base = base;
	this.altura = altura;
}
@Override
public double calcularArea() {
	return base * altura;
}
@Override
public double calcularPerimetro() {
	return base * altura * 2;
}
@Override
public String exibirInfo() {
	return "Retângulo de base " + base + " e altura " + altura
			+ " tem área de " + calcularArea()
			+ " e perímetro de " + calcularPerimetro();
}

} // Retangulo
