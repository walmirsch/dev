
public class TestaHeranca {
public static void main(String[] args) {
	Pessoa p = new Pessoa("Jose", "jose@jose.com", "9123456789");
	//p.setNome("Joana");
	//p.setEmail("joana@joana;.com");
	//p.setTelefone("2799912345678");
	System.out.println(p);
	Aluno a = new Aluno("Ana", "ana@ana.com", "987654321", 91827);
	//a.setNome("Ana");
	//a.setEmail("ana@ana.com");
	//a.setTelefone("27-1233456789");
	//a.setMatricula(1000);
	System.out.println(a);
	Pessoa p1,p2;
	p1 = new Pessoa("Zezinho","ze@ze.com","12345");
	p2 = new Aluno("Joaozinho","jao@jao.com","2729342",56468);
	System.out.println(p1);
	System.out.println(p2);
	
} // main

} // TestaHeranca
