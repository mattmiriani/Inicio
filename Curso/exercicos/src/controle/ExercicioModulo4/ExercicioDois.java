package Controle.ExercicioModulo4;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resto = 0;
		
			System.out.print("Qual ano estamos? Ou passe um ano: ");
				int ano = entrada.nextInt();
				resto = ano % 4;
					if(ano == 2022) {
						System.out.println("Estamos no ano de 2022");
							}
					else {
						System.out.printf("%d nao é nosso ano atual", ano);
						}
					if(resto == 0) {
						System.out.printf("\nAno de %d é bicesto", ano );
					}
					else {
						System.out.println("Ano nao é bicesto");
					}
		
		
		
		entrada.close();
		
	}
}
