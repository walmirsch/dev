package caelum;

public class Carro {
String cor;
String modelo;
double velocidadeAtual;
double velocidadeMaxima;
Motor motor;
void liga() {
	System.out.println("O carro foi ligado");
} // liga
void acelera(double quantidade) {
	this.velocidadeAtual += quantidade;
} // acelera
int pegaMarcha() {
	if(this.velocidadeAtual<0) {
		return -1;
	} // if
	if(this.velocidadeAtual>-0  && this.velocidadeAtual<40) {
		return 1;
	} // ir
	if(this.velocidadeAtual>40 && this.velocidadeAtual<80) {
		return 2;
	} // if
	return 3;
} // pegamarcha

} // carro
