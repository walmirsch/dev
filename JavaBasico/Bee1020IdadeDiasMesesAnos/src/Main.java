import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dias, meses, anos, diasFin;
		dias = teclado.nextInt();
		anos = dias / 365;
		meses = dias % 365 / 30;
		diasFin = dias % 365 % 30;
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(diasFin + " dia(s)");
	}

}
