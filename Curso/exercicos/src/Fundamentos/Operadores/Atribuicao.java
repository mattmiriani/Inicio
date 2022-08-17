package Fundamentos.Operadores;

import java.util.Scanner;

public class Atribuicao {
	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		
		c += b; //c = c + b;
		c -= a; //c = c - a;
		c *= b; // c = c * b;
		c /= a; //c = c / a;
		
		System.out.println(c);
		
		c %= 2; // c = c% 2 ou 1
		System.out.println(c);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		String num1 = entrada.nextLine();
		
		double valor1 = Double.parseDouble(num1);
		
		double result = valor1 % 2;
		
			if (result == 0) {
				System.out.println("Seu numero é par!");
			}
			else {
				System.out.println("Seu numero é impar!");
			}
		
		
	}
}
