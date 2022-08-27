package Controle.ExercicioModulo4;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			System.out.print("Me informe um numero: ");
			double numero = entrada.nextDouble();		
		
			if(numero > 0 && numero < 10) {
				System.out.println("Numero esta contido dentro do intervalo 0 ate 10!");
				 double resto = numero % 2;
				 	if(resto == 0) {
				 		System.out.println("Numero é par!");
				 	}
				 	else {
				 		System.out.println("Numero é impar!");
				 	}
			}
			else {
				System.out.println("Numero não esta contindo dentro do intervalo de 0 ate 10!");
			}
		
		
		entrada.close();
	}
}
