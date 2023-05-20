import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	/*
	 * Cód Descrição Valor
	 1 Hamburguer 4,5
	 2Misto 3
	 3 Refrigerante 1,5 
	  */
	Scanner teclado = new Scanner(System.in);
	int codigo, quant;
	codigo = teclado.nextInt();
	quant = teclado.nextInt();
if(codigo == 1)	 {
	System.out.println(quant + " hamburguer(es): R$" + quant*4.5);
} else
	if(codigo ==2) {
		System.out.println(quant + " misto(s): R$" + quant*3);		
	} else
		if(codigo == 3) {
			System.out.println(quant + " refreigerante(s): R$" + quant*1.5);
		}
	teclado.close();
}

  } // class
