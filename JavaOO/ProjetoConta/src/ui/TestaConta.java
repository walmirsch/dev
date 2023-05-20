package ui;

import java.util.Scanner;

import core.Conta;
import core.ContaEspecial;

public class TestaConta {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	Conta lista[] = new Conta[4];
	lista[0] = new Conta("123-6","Adamastor", "123456789-10",0.0);
	lista[1] = new ContaEspecial("12-6","Deosdete", "13579-10",0.0,500.0);
	lista[2] = new Conta("138-6","Clécio", "123456789-10",0.0);
	lista[3] = new ContaEspecial("385-7","Laércia", "28468-10",0.0,800.0);
	// Alterar para:
	// Admastor tem conta comum. débito negado
	// x tem conta especial com limite de R$, débito autorizado
	// usar if(c instanceof ContaEspecial)
	for(Conta c : lista) {
		if(c.debitar(100) ) {
			System.out.println("Débito autorizado na conta de: " + c.getNomeTitular());		
		}
	else {
		System.out.println("Desculpe, " + c.getNomeTitular() + ". Débito negado");	
	}
} // for
	
	teclado.close();
} // main
} // TestaConta
