
public class Contato {
private String nome;
private String email;
private String whatsApp;
public Contato(String nome, String email, String whatsApp) {
	super();
	this.nome = nome;
	this.email = email;
	this.whatsApp = whatsApp;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getWhatsApp() {
	return whatsApp;
}
public void setWhatsApp(String whatsApp) {
	this.whatsApp = whatsApp;
}
public String exibir() {
	return nome + " | E-mail: " + email + " (" + whatsApp + ")";
}
} // Contato
