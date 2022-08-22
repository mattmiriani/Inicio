package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String valor = "";
		System.out.print("Digite uma senha: ");
		valor = entrada.next();

		while (!valor.equalsIgnoreCase("sair")) {
			System.out.print("voce diz: ");
			valor = entrada.nextLine();
		}

		entrada.close();
	}
}
