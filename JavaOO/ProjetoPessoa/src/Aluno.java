
public class Aluno extends Pessoa {
private int matricula;

public Aluno(String nome, String email, String telefone, int matricula) {
	super(nome, email, telefone);
	this.matricula = matricula;
}

@Override
public String toString() {
	return super.toString() + " - " + matricula;
}

public int getMatricula() {
	return matricula;
}
public void setMatricula(int matricula) {
	this.matricula = matricula;
}

} // Aluno
