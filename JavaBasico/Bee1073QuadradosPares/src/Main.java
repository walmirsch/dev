import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int n, i=2;
	n = teclado.nextInt();
	while(i<=n) {
		if(i%2==0) {
			System.out.println(i + "^2" + " = " + i*i);
		}
		i++;
	}
	
	teclado.close();
} // main
} // class
