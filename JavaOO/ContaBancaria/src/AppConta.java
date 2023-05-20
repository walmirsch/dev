import java.util.Scanner;

public class AppConta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Conta c = new Conta(4321,7,"Walmir Schultz","123.456.789-10");
		int opcao;
		double valor;
		do{ 
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Depositar\n2 - Sacar\n3 - Exibir\n0 - Sair");
		opcao = teclado.nextInt();
		switch(opcao) {
		case 1:
			System.out.print("Digite o valor do depósito: ");
			valor = teclado.nextDouble();
			c.deposita(valor);
			break;
		case 2:
			System.out.print("Digite o valor do saque: ");
			valor = teclado.nextDouble();
			if(c.saca(valor)) {
				System.out.println("Saque efetuado");
			} // i 
			else {
				System.out.println("Saldo insuficiente");
			} // else 
			break;
		case 3:
			System.out.println(c.exibeConta());
			break;
		case 0:
			System.out.println("Saindo do sistema");
			break;
			default:
				System.out.println("Opção inválida");
		} // switch
		} while(opcao != 0);
		teclado.close();
	} // main
} // AppConta
