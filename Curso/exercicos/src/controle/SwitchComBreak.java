package Controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		String conceito = "";
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a nota e receba o conceito: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		case 2: case 1:
			conceito = "E";
			break;
		default:
			  conceito = "nota invalida";
		}
		
		System.out.println("Conceito é: " + conceito);
		entrada.close();
		//usar esse switch para coisas grandes!!
	}
}
