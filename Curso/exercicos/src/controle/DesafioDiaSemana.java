package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		//Domingo -> 1
		//Segunda -> 2
		//Terça -> 3
		//Quarta -> 4
		//Quinta -> 5
		//Sexta -> 6
		//Sabado -> 7
		
	Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um dia da semana: ");
			
			String diaSemana = entrada.nextLine();
				
				String domingo = "Domingo";
				String segunda = "Segunda";
				String terca = "Terça";
				String quarta = "Quarta";
				String quinta = "Quinta";
				String sexta = "Sexta";
				String sabado = "Sabádo";
				
				if(diaSemana.equals(domingo)) {
					System.out.println("1");
				} else if(diaSemana.equals(segunda)) {
					System.out.println("2");
				} else if(diaSemana.equals(terca)) {
					System.out.println("3");
				} else if(diaSemana.equals(quarta)) {
					System.out.println("4");
				} else if(diaSemana.equals(quinta)) {
					System.out.println("5");
				} else if (diaSemana.equals(sexta)) {
					System.out.println("6");
				} else if(diaSemana.equals(sabado)) {
					System.out.println("7");
				} else {
					System.out.println("Valor invalido");
				}
	
	
	
	entrada.close();
	}
}
