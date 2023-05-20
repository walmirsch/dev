import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	double a, b, c, temp;
	a = teclado.nextDouble();
	b = teclado.nextDouble();
	c = teclado.nextDouble();
	// ordena a, b e c em ordem decrescente sem usar lista
	if(a<b) {
		temp = a;
		a=b;
		b=temp;
	} // if a e b
	if(a<c) {
		temp = a;
		a=c;
		c= temp;
	} // a e c
	if(b<c) {
		temp=b;
		b=c;
		c=temp;
	} // b e c
	// com lados ordenados, classifica-se os triângulos
	if(a>=b+c) {
		System.out.println("Não é um triângulo");
	} else
		// classificação quanto aos ângulos
		if(a*a==b*b+c*c) {
			System.out.println("Triângulo retângulo");
		} else
			if(a*a>=b*b+c*c) {
				System.out.println("Triângulo obtusângulo");
			} else
				if(a*a<=b*b+c*c) {
					System.out.println("Triângulo acutângulo");
				}
					// classificação quanto aos lados
					if(a!=b && a!=c && b!=c) {
						System.out.println("Triângulo escaleno");
					} else
						if(a==b && a==c && b==c) {
							System.out.println("Triângulo equilátero");
						} else {
							System.out.println("Triângulo isósceles");
						}
							
	teclado.close();
}
} // class
