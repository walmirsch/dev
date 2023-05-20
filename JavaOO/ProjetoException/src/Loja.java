import java.util.Scanner;

public class Loja {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	String strCodigo, nome, strPreco;
	int codigo;
	double preco;
	boolean funcionou = false;
	Produto p = new Produto();
	do {
		try {
			System.out.println("Digite o codigo do produto");
			strCodigo = teclado.nextLine();
			codigo = Integer.parseInt(strCodigo);
			p.setCodigo(codigo);
			System.out.println("Digite o nome do produto");
			nome = teclado.nextLine();
			p.setNome(nome);
			System.out.println("Digite o preço do produto");
			strPreco = teclado.nextLine();
			preco = Double.parseDouble(strPreco);
			p.setPreco(preco);
			System.out.println(p);
			teclado.close();
			funcionou = true;
		} catch(WException E) {
			System.out.println("Erro ao preencher: " + E.getMessage());
		} catch(Exception E) {
			System.out.println(E.getClass().getName());
			System.out.println("Deu erro!");
		}
	} while(!funcionou);
} // main
} // Loja
