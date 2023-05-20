package caelum;

public class TestaConta {

	public static void main(String[] args) {
		Cliente cli = new Cliente("Cliente","Novo","12345678911");
		Cliente cliPoli = new Cliente("Cli","Poli","12345678922");
		Cliente cliWal = new Cliente("Cli","Wal","2468");
		Conta minhaConta, contaPoliana, contaWal;
		minhaConta = new ContaCorrente(1134, 0, 0, cli);
		contaPoliana = new ContaPoupanca(34,0,0,cliPoli);
		contaWal = new ContaCorrente(41,0,0,cliWal);
		//minhaConta.setTitular(cli);
		//minhaConta.getTitular().setNome("Walmir Schultz");
		//System.out.println("Titular: "+minhaConta.getTitular().getNome());
		minhaConta.deposita(1000);
		contaPoliana.deposita(5000);
		contaWal.deposita(5000);
		if(minhaConta.saca(200)) {
			System.out.println("Saque efetuado");
		} else {
			System.out.println("Não foi possível efetuar o saque");
		} // if else
		minhaConta.deposita(500);
		minhaConta.atualiza(0.01);
		contaPoliana.atualiza(0.01);
		contaWal.atualiza(0.01);
		System.out.println("Saldo atual: "+minhaConta.getSaldo());
		System.out.println("Saldo Poliana: "+contaPoliana.getSaldo());
		System.out.println("Saldo Walmir: "+contaWal.getSaldo());
		if(minhaConta.transferePara(contaPoliana, 50)) {
			System.out.println("Transferência efetuada");
		} else {
			System.out.println("Não foi possível transferir");
		}
		System.out.println("Total de contas criadas: " + Conta.getTotalDeContas());
	} // main
} // TestaConta
