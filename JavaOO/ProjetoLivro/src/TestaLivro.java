
public class TestaLivro {
public static void main(String[] args) {
	Livro l1 = new Livro();
	l1.setTitulo("Título do livro");
	l1.setAutor("Nome do autor");
	l1.setAnoPublicacao(1983);
	l1.setCategoria("Investimentos");
	l1.setEstante(5);
	l1.setPrateleira(4);
	l1.exibeLivro();
	l1.emprestar();
	l1.exibeLivro();
	l1.devolver();
	l1.exibeLivro();
} // main
} // TestaLivro
