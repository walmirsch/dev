import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escritor {
public void gravarFilme(String nomeArquivo, Filme filme) {
try {
	File f = new File(nomeArquivo); // manipulo o arquivo
	FileWriter fw = new FileWriter(f, true); // acesso em modo escrita
	PrintWriter pw = new PrintWriter(fw); // elemento que vai ainda gravar os dados
	pw.println(filme.toCsv());
	pw.close();
	fw.close();
} catch(IOException e) {
	System.out.println("Erro ao gravar: " + e.getMessage());
}
} // gravarFilme
} // Escritor
