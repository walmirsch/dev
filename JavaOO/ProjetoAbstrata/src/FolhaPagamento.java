import java.util.ArrayList;

public class FolhaPagamento {
public static void main(String[] args) {
	ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
	lista.add(new Chefe("José Chefe", 1234, 10000.00, 15.00, 2500.00));
	lista.add(new Horista("Maria Horista", 1235, 200, 79.70));
	lista.add(new Comissionado("Joao Comissionado", 1236, 3000.00, 22.75));
	lista.add(new Empreiteiro("Dejair Empreiteiro", 1237, 5490.00));
	for (Funcionario f: lista) {
		System.out.println("------------------------------------------");
			System.out.println(f.getNome() + String.format("   R$ %,.2f", f.calcularSalario()));
	} // for
	System.out.println("------------------------------------------");
} // main
} // FolhaPagamento
