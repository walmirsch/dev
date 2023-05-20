import java.util.ArrayList;

public class Loja {
public static void main(String[] args) {
	ArrayList <Produto> lista;
	lista = new ArrayList<Produto>();
	lista.add(new Produto(1,"Computador",3000.0));
	lista.add(new Produto(2,"mouse",50.0));
	lista.add(new Produto(3,"Teclado",35.0));
	for(Produto p : lista) {
		System.out.println(p);
	}
	System.out.println("Posição 2: " + lista.get(2));
	// lista.remove(2);
	lista.add(3,new Produto(5,"Webcam",50.0));
	for(Produto p : lista) {
		System.out.println(p);
	}
} // main
} // Loja
