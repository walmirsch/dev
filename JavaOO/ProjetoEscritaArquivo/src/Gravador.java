import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Gravador {
public static void main(String[] args) {
	int opcao = 0;
	try {
		Scanner teclado = new Scanner(System.in);
		// preciso manipular um arquivo (uso o objeto File)
		File f = new File("dados.txt");
		// vou manipular esse arquivo em modo escrita (no caso o parâmetro TRUE, indica APPEND - inserir
		FileWriter fw = new FileWriter(f, true);
		// agora vou usar o mesmo cara do System.out para imprimir neste arquivo
		PrintWriter pr = new PrintWriter(fw);
		Produto p ;
		for(int i = 0; i < 10; i++) {
			p = new Produto(i, "Produto"+i, i*100);
			System.out.println("Deseja gravar o produto de codigo "+i+ " (1 para sim e 0 para não)");opcao = teclado.nextInt();
			if(opcao == 1) {
				pr.println(p);
			}
		} // for
		pr.close();
		fw.close();
		teclado.close();
		System.out.println("Gravado no arquivo");
	} catch(IOException e) {
		System.out.println("Erro "+e.getMessage());
	}
} // main
} // Gravador
