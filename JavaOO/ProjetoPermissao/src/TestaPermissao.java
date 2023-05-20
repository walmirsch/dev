import java.util.Scanner;

public class TestaPermissao {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Permissao p = new Permissao(9876, "Administrador;");
		Usuario u = new Usuario("Walmir", "senha", p);
		System.out.println("Usuário: ");
		String usu = teclado.nextLine();
		System.out.println("Senha: "); 
		String sen = teclado.nextLine();
		if (u.fazerLogin(usu, sen)) {
			System.out.println(u.exibir());
		} else {
			System.out.println("Acesso negado");
		}
		teclado.close();
	} // main
} // TestaPermissao
