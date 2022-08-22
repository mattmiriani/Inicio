package Controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			System.out.print("Digite a primeira nota: ");
			double nota = entrada.nextInt();			
			
			while (nota >= 0 || nota >= 10) {
				double total = nota + nota;
				System.out.println(total);
			}
		
		
		
		
		
		entrada.close();
		
	}
}
