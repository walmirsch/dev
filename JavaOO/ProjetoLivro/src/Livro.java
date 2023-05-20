
public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String categoria;
	private int estante;
	private int prateleira;
	private boolean disponivel;
	public void exibeLivro() {
		System.out.println("Título: "+getTitulo());
		System.out.println("Autor: "+getAutor());
		System.out.println("Categoria: "+getCategoria());System.out.println("Estante: "+getEstante());
		System.out.println("Ano da publicação: "+getAnoPublicacao());
		System.out.println("Estante: "+ getEstante());
		System.out.println("Prateleira: "+getPrateleira());
		if(isDisponivel()) {
			System.out.println("Livro disponível");
		} else {
			System.out.println("Livro emprestado");
		}
	} // exibeLivro
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getEstante() {
		return estante;
	}
	public void setEstante(int estante) {
		this.estante = estante;
	}
	public int getPrateleira() {
		return prateleira;
	}
	public void setPrateleira(int prateleira) {
		this.prateleira = prateleira;
	}
	public boolean isDisponivel() {
		return disponivel;
	}
	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
public void emprestar() {
	this.disponivel=false;
}
public void devolver() {
	this.disponivel=true;
}
} // Livro
