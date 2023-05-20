import java.util.Scanner;

public class DescINSS {

	public static void main(String[] args) {
		double valorHora;
		int quantHoras;
		double valorBruto, valorLiq;
		double porcDesc;
		Scanner teclado = new Scanner(System.in);;
System.out.println("Digite o valor da hora:");
		valorHora = teclado.nextDouble();
		System.out.println("Digite a quantidade de horas:");
		quantHoras = teclado.nextInt();
		System.out.println("Digite o percentual de desconto:");
		porcDesc = teclado.nextDouble();
		valorBruto = quantHoras *valorHora;
		System.out.println("Salario líquido: " + valorBruto * (100-porcDesc)/100);
	}
}
