package Fundamentos.ExercicioModulo;

import java.util.Scanner;

public class AoQuadradoCubo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			int aoCubo = 0;
			int aoQuadrado = 0;
			int resultado3 = 0;
			int resultado2 = 0;
		
			System.out.print("Me informe um valor inteiro: ");
			int valor = entrada.nextInt();
			
			while(aoCubo <= 3) {
				resultado3 = valor * valor * valor;
				aoCubo++;
				}
			
			while(aoQuadrado <= 2) {
				resultado2 = valor * valor;
				aoQuadrado++;
				}
		
		
		System.out.println("O valor ao Quabrado é: " + resultado2);
		System.out.println("O valor ao Cubo é: " + resultado3);
		entrada.close();
	}
}
