package caelum;

public class progrCarro {

	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "verde";
		meuCarro.modelo= "Fusca";
		meuCarro.velocidadeAtual=0;
		meuCarro.velocidadeMaxima= 80;
		meuCarro.liga();
		meuCarro.acelera(20);
		System.out.println(meuCarro.velocidadeAtual);
	} // main

} // progrcarro
