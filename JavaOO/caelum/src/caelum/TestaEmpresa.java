package caelum;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa empresa = new Empresa("06065974000130");
		empresa.setFuncionarios(new Funcionario[10]);
		
			Funcionario f1 = new Gerente();
			f1.setSalario(1000);
					empresa.adicionaFunc(f1);
			Funcionario f2 = new Gerente();
f2.setSalario(1700);
empresa.adicionaFunc(f2);
empresa.mostraFunc();
	} // main

} // TestaEmpresa
