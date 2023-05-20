
public class Quadrado implements AreaCalculavel {
private int lado;

public Quadrado(int lado) {
	super();
	this.lado = lado;
}
public double calculaArea() {
	return this.lado * this.lado;
}
} // Quadrado
