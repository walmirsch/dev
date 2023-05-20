
public class CartaoCashBack extends CartaoPrePago {
	private int tipo; // 0 - Gold, 1 - Silver, 2 - Bronze

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}

	@Override
	public boolean comprar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			switch (this.tipo) {
			case 0:
				saldo += valor * 0.08;
				break;
			case 1:
				saldo += valor * 0.05;
				break;
			case 2:
				saldo += valor * 0.02;
				break;
			} // switch
			return true;
		} // if
		return false;
	}
} // CartaoCashBack
