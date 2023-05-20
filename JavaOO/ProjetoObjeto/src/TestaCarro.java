
public class TestaCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		c1.setMarca("Chevrloet");
		c1.setModelo("Corsa");
		c1.setCor("Vermelho");
		c1.setAno(2015);
		c1.setPreco(20000);
		c2.setMarca("Porshe");
		c2.setModelo("Caiene");
		c2.setCor("Prata");
		c2.setAno(2020);
		c2.setPreco(200000);
		c1.exibirAnuncio();
		System.out.println("Seguro do perfil 0: "+c2.calcularSeguro(0));
		System.out.println("Seguro do perfil 1: "+c2.calcularSeguro(1));
		System.out.println("Seguro do perfil 2: "+c2.calcularSeguro(2));
	} // main

} // Progr
