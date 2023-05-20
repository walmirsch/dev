package caelum;

public abstract class Funcionario {
	protected String nome;
	protected String cpf;
	protected String departamento;
	protected int senha;
	protected String dataEntrada;
	protected double salario;

	Funcionario() {
		// Construtor sem argumentos
	}
	Funcionario(String nome) {
		this.nome = nome;
	}
	void recebeAumento(double aumento) {
		this.setSalario(this.getSalario() + aumento);
	} // recebeAumento
	double getGanhoAnual() {
		return this.getSalario() * 12;
	} // getGanhoAnual
	void mostra() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Departamento: " + this.getDepartamento());
		System.out.println("Salário: " + this.getSalario());
		System.out.println("Data de entrada: " + this.getDataEntrada());
		System.out.println("");
	} // mostra
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(String dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
} // Funcionario
