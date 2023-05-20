
public class Filme {
private String nomeFilme;
private int ano;
private String genero;
private int duracaoMin;
private int classificacao;
public String getNomeFilme() {
	return nomeFilme;
}
public void setNomeFilme(String nomeFilme) {
	this.nomeFilme = nomeFilme;
}
public int getAno() {
	return ano;
}
public void setAno(int ano) {
	this.ano = ano;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public int getDuracaoMin() {
	return duracaoMin;
}
public void setDuracaoMin(int duracaoMin) {
	this.duracaoMin = duracaoMin;
}
public int getClassificacao() {
	return classificacao;
}
public void setClassificacao(int classificacao) {
	this.classificacao = classificacao;
}
public String toCsv() {
	return nomeFilme + ";" + ano + ";" + genero + ";" + duracaoMin + ";" + classificacao; 
}
@Override
public String toString() {
	return nomeFilme + ", " + ano + ", " + genero + ", " + duracaoMin + " minutos" 
			+ ", " + classificacao + "estrelas";
}

} // Filme
