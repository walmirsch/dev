import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int n;
	n = teclado.nextInt();
	for(int i =1; i<=n*4; i++) {
		if(i%4==0) {
			System.out.println("PUN");
		} else
			System.out.print(i + " ");
	} // for
	teclado.close();
} // main
} // clas
