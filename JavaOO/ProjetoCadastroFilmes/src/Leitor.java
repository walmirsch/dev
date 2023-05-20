import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Leitor {
public ArrayList<Filme> lerAcervo(String nomeArquivo) {
	try {
		ArrayList<Filme> filmes = new ArrayList<Filme>();
	File f = new File(nomeArquivo);
			FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String linha;
	do {
		linha = br.readLine();
		if(linha != null) {
			String infos[] =linha.split(";");
			Filme filme = new Filme();
			filme.setNomeFilme(infos[0]);
			filme.setAno(Integer.parseInt(infos[1]));
			filme.setGenero(infos[2]);
			filme.setDuracaoMin(Integer.parseInt(infos[3]));
			filme.setClassificacao(Integer.parseInt(infos[4]));
			filmes.add(filme);
		} // if not null
	} while(linha != null);
	br.close();
	fr.close();
	return filmes;
	} catch(IOException e) {
		System.out.println("Erro ao ler arquivo: " + e.getMessage());
	}
	return null;
}
} // Leitor
