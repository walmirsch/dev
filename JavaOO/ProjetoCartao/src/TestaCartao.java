
public class TestaCartao {
public static void main(String[] args) {
	CartaoPrePago cpp = new CartaoPrePago("1230","Walmir Schultz", 2040, 12, 0.0);
	CartaoCashBack ccb = new CartaoCashBack("555","Poliana Schultz", 2040,11,10000.0,0);
	if(cpp.comprar(100)) {
		System.out.println("Compra efetuada");
	}
	else {
		System.out.println("Não foi possível efetuar a compra.");
	}
	if(ccb.comprar(100)) {
		System.out.println("Compra efetuada");
		System.out.println("Saldo: "+ccb.getSaldo());
	}
	else {
		System.out.println("Não foi possível efetuar a compra.");
	}
} // main
} // TestaCartao
