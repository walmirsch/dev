package caelum;

import java.util.Random;

public class TestaBanco {

	public static void main(String[] args) {
		Banco bb = new Banco();
		Random sorteador = new Random();
		// Cria 20 contas
for(int i = 0; i<20; i++) {
	int saldo = sorteador.nextInt(10000);
	Conta conta;
	if(saldo%3 == 0 ) {
		conta =new ContaCorrente(i+1,0,0,new Cliente("Walmir", "Schultz","123")); 
	} else {
		conta = new ContaCorrente(i+1,0.0,0.0,new Cliente("Poliana","Schultz","348"));
	} // if else
	conta.deposita(saldo);
	bb.adiciona(conta);
} // for

	} // main
} // TestaBanco
