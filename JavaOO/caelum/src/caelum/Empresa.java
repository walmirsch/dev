package caelum;

public class Empresa {
	private String nome;
	private String cnpj;
	private Funcionario [] funcionarios;
	private int posLivre;

	public Empresa(String cnpj) {
		this.cnpj = cnpj;
		this.funcionarios = new Funcionario[10];
	}
	public void adicionaFunc(Funcionario f) {
		if(this.posLivre == funcionarios.length) {
			this.aumentaArray();
		} // if
		this.funcionarios[posLivre] = f;
	} // adicionaFunc
	private void aumentaArray() {
		Funcionario [] maior = new Funcionario[funcionarios.length*2];
		for(int i = 0; i < funcionarios.length; i++) {
			maior[i] = funcionarios[i];
		} // for
		this.funcionarios = maior;
	} // aumentaArray
	void mostraFunc() {
		for(int i =0; i < this.getPosLivre(); i++) {
			System.out.println("Funcionário na posição" + i);
			this.getFuncionario(i);
		} // for
	} // mostraFunc
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Funcionario getFuncionario(int posicao) {
		return this.funcionarios[posicao];
	} // getFuncionario
	public void setFuncionarios(Funcionario [] funcionarios) {
		this.funcionarios = funcionarios;
	}
	public int getPosLivre() {
		return posLivre;
	}
	public void setPosLivre(int posLivre) {
		this.posLivre = posLivre;
	}

} // Empresa 
