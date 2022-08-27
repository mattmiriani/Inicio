package Fundamentos.ExercicioModulo;

import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			
			System.out.print("Qual é a base do tringulo: ");
			double base = entrada.nextDouble();
			
			System.out.print("Qual é a altura do triangulo: ");
			double altura = entrada.nextDouble();
			
			double area = (base * altura) / 2;
			
			System.out.printf("A area do seu triangulo é %.2f", area );
		
		
		
		
		
		
		entrada.close();
	}
}
