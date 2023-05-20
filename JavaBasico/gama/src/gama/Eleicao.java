package gama;

import java.util.Scanner;

public class Eleicao {

	public static void main(String[] args) {
		// Variáveis
		 Scanner scan = new Scanner(System.in);
		 int votosA = 0, votosB = 0, brancos = 0, nulos = 0, total = 0;
		 double porcentA, porcentB, porcentBrancos, porcentNulos;
		 int voto;
		 String [] menu = {
				"Escolha seu candidato ou tecle 0 para encerrar",
				"1 - Candidato A",
				"2 - Candidato B",
				"3 - Branco",
				"Qualqier número diferente de 0, 1, 2 ou 3 anulará seu voto",
				"Digite seu voto: "
		}; // menu
		 do {
			 // Exibe menu
			 for(String m : menu) {
				 System.out.println(m);	
			 } // for
			 // Lê o voto
			 voto = scan.nextInt();
			 // Efetua cálculos
			 switch(voto) {
			 case 0:
				 System.out.println("Votação encerrada");
				 break;
			 case 1:
				 votosA++;
				 break;
			 case 2:
				 votosB++;
				 break;
			 case 3:
				 brancos++;
				 break;
				 default:
					 nulos++;
			 } // switch
		 } while(voto != 0);
		 // Calcula totais e exibe
		 total = votosA + votosB + brancos + nulos;
		 // Se houve votos,calcula porcentagens
		 if(total>0) {
			 porcentA = votosA / total * 100.0;
			 porcentB = votosB / total * 100.0;
			 porcentBrancos = brancos / total * 100.0;
			 porcentNulos = nulos / total * 100.0;
			 System.out.println("\nTotal de votos: "+total);
			 System.out.println("\nCandidato A: "+votosA+"votos, "+porcentA+"do total");
			 System.out.println("\nCandidato B: "+votosB+"votos, "+porcentB+"do total");
			 System.out.println("\nBrancos: "+brancos+"votos, "+porcentBrancos+"do total");
			 System.out.println("\nNulos: "+nulos+"votos, "+porcentNulos+"do total");
		 } // if votos
	} // main

} // Eleicao
