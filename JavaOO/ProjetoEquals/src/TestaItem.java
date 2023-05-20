
public class TestaItem {
	public static void main(String[] args) {
		System.out.println("----- ANTES ---------------------------");
		Item i1; // aqui eu apenas tenho uma referência para uma área de memória
		i1 = new Item(1, "Computador", 2000); // só terei o objeto real (ocupando um espaço) no momento do new
		System.out.println("i1 = " + i1.exibir());
		// quando declaro desta maneira, o que acontece?
		Item i2 = i1;
		// na verdade, i2 aponta para a mesma área de memória de i1 (não são 2 objetos
		// diferentes!!!)
		System.out.println("i2 = " + i2.exibir());
		System.out.println("----- DEPOIS ---------------------------");
		i2.setPreco(1800);
		// se eu altero um atributo via i2
		// eu estou alterando na verdade o objeto apontado também por i1 (já que é o
		// mesmo objeto)
		System.out.println("i1 = " + i1.exibir());
		System.out.println("i2 = " + i2.exibir());
		// agora vamos falar de STRINGS e sua comparação
		/*
		 * String s1 = "Oi quer tc?"; String s2 = "Oi quer tc?"; aqui a máquina virtual
		 * Java não cria 2 strings diferentes (ou 2 espaços na memória) ela verifica que
		 * a 2a string é igual a 1a e portanto faz com que a 2a referência aponte para a
		 * mesma área de memória da 1a.. equivale a String s2 = s1
		 */
		// aqui agora eu estou obrigando a maquina virtual a criar espaços distintos
		String s1 = new String("Oi, quer tc?");
		String s2 = new String("Oi, quer tc?");
		// se eu comparo s2 e s1 com == eu quero ver se ele apontam para a mesma área de
		// memória
		if (s1 == s2) {
			System.out.println("Apontam para o mesmo objeto");
		} else {
			System.out.println("Apontam para objetos diferents");
		}
		// agora se eu quero mesmo comparar conteúdos, eu preciso usar o EQUALS
		if (s1.equals(s2)) {
			System.out.println("Mesmo conteudo");
		} else {
			System.out.println("Conteudos distintos");
		}

	} // main
} // TestaItem
