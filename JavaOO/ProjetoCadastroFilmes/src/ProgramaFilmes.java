import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaFilmes {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Incluir filme");
			System.out.println("2 - Exibir cadastro");
			System.out.println("3 - Busca filme por palavra no título");
			System.out.println("0 - Sair");
			opcao = Integer.parseInt(teclado.nextLine());
			switch (opcao) {
			case 1:
				Filme filme = new Filme();
				System.out.println("Digiyte os dados do filme\nNome:");
				filme.setNomeFilme(teclado.nextLine());
				System.out.println("Ano de lançamento: ");
				filme.setAno(Integer.parseInt(teclado.nextLine()));
				System.out.println("Gênero:");
				filme.setGenero(teclado.nextLine());
				System.out.println("Duração em minutos: ");
				filme.setDuracaoMin(Integer.parseInt(teclado.nextLine()));
				System.out.println("Classificação (1 a 5 estrelas:");
				filme.setClassificacao(Integer.parseInt(teclado.nextLine()));
				Escritor escr = new Escritor();
				escr.gravarFilme("filmes.txt", filme);
				break;
			case 2:
				Leitor leitor = new Leitor();
				ArrayList<Filme> filmes = leitor.lerAcervo("filmes.txt");
				if (filmes != null) {
					for (Filme f : filmes) {
						System.out.println(f);
					}
				}
				break;
			case 3:
				System.out.println("Digite a palavra a procurar:");
				String strProcura = teclado.nextLine().toLowerCase();
				Leitor le = new Leitor();
				ArrayList<Filme> lista = le.lerAcervo("filmes.txt");
				for (Filme f : lista) {
					if (f.getNomeFilme().toLowerCase().contains(strProcura)) {
						System.out.println(f);
					}
				} // for
				break;
			case 0:
				System.out.println("Obrigado por utilizar o programa");
				break;
			default:
				System.out.println("Opção inválida");
			} // switch
		} while (opcao != 0);
		teclado.close();
	} // main
} // ProgramaFilmes
