
public class Cubo extends FormaGeometrica implements IForma2D, IForma3D{
private double lado;

public Cubo(double lado) {
	this.lado = lado;
}

@Override
public double calcularVolume() {
	return lado * lado * lado;
}

@Override
public double calcularArea() {
	return 6*(lado*lado);
}

@Override
public double calcularPerimetro() {
	return 14 * lado;
}

@Override
public String exibirInfo() {
	return "Cubo de lado "+lado+" tem area "+calcularArea()+" perimetro "+calcularPerimetro()+ " e volume "+calcularVolume();
}


} // Cubo