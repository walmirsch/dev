
public class Horista extends Funcionario {
private int numeroHoras;
private double valorHora;
public Horista(String nome, int numeroRegistro, int numeroHoras, double valorHora) {
	super(nome, numeroRegistro);
	this.numeroHoras = numeroHoras;
	this.valorHora = valorHora;
}
public int getNumeroHoras() {
	return numeroHoras;
}
public void setNumeroHoras(int numeroHoras) {
	this.numeroHoras = numeroHoras;
}
public double getValorHora() {
	return valorHora;
}
public void setValorHora(double valorHora) {
	this.valorHora = valorHora;
}
@Override
public double calcularSalario() {
	return valorHora * numeroHoras;
}

} // Horista
