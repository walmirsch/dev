package caelum;

public class TestaAtualizadorContas {
	public static void main(String[] args) {
		Cliente cli1 = new Cliente("Cliente","Um","9875");
				Cliente cli2 = new Cliente("Cliente","dois","54");
				Conta c = new ContaCorrente(1,0,0,cli1);
				Conta cc = new ContaCorrente(2,0,0,cli2);
				Conta cp = new ContaPoupanca(3,0,0,cli2);
				c.deposita(1000);
				cc.deposita(1000);
				cp.deposita(1000);
				AtualizadorContas ac = new AtualizadorContas(0.01);
				ac.roda(c);
				ac.roda(cc);
				ac.roda(cp);
				System.out.println("Saldo total das contas: " + ac.getSaldo());
	} // main

} // TestaAtualizadorContas
